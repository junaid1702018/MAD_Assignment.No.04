package com.example.Assignment4;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import org.json.JSONObject;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    RequestQueue mRequestQueue;
    static WeatherProperties weatherProperties = null;
    ArrayList <WeatherDetails> data = new ArrayList<>();
    TextView textViewMainTemperature;
    TextView textViewWeatherDesc;
    ImageView imageViewWeatherImage;
    Weather_Details wd;
    RecyclerView recyclerView;
    MyAdapter adapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRequestQueue = Volley.newRequestQueue(this);
        fetchJsonResponse();

        textViewMainTemperature = findViewById(R.id.temperature);
        imageViewWeatherImage = findViewById(R.id.weather_image);
        textViewWeatherDesc = findViewById(R.id.weather_desc);


    }
    private void fetchJsonResponse() {
        // Passing 2nd argument as "null"  GET requests
        JsonObjectRequest req = new JsonObjectRequest(Request.Method.GET, "https://api.openweathermap.org/data/2.5/weather?q=Lahore&appid=1f71b5454f8714464ae1ec426e9597d1", null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson();
                        weatherProperties = gson.fromJson(response.toString(),WeatherProperties.class);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                UISetter(weatherProperties);
                            }
                        });

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.e("Error: ", error.getMessage());
                Toast.makeText(MainActivity.this, "No Internet", Toast.LENGTH_SHORT).show();
            }
        });

        /* Add your Requests to the RequestQueue to execute */
        mRequestQueue.add(req);
    }
    public void UISetter(WeatherProperties weatherProperties){
        weatherProperties.getMain().setTemp(weatherProperties.getMain().getTemp() - 273.15);
        textViewMainTemperature.setText(weatherProperties.getMain().getTemp().toString() + "℃");
        textViewWeatherDesc.setText( weatherProperties.getWeather().get(0).getDescription().toUpperCase());

        String ImageLink = "https://openweathermap.org/img/wn/";
        ImageLink = ImageLink + weatherProperties.getWeather().get(0).getIcon() + "@2x.png";// format from weather-conditions open weather
        Glide.with(this).load(ImageLink).into(imageViewWeatherImage);

        wd = new Weather_Details(R.drawable.ic_baseline_wb_sunny_24,"Sunrise",weatherProperties.getSys().getSunrise().toString(),R.drawable.sunset,"Sunset",weatherProperties.getSys().getSunset().toString());
        data.add(wd);
        wd = new Weather_Details(R.drawable.humidity,"Humidity",weatherProperties.getMain().getHumidity().toString(),R.drawable.ic_baseline_get_app_24,"Pressure",weatherProperties.getMain().getPressure().toString());
        data.add(wd);
        wd = new Weather_Details(R.drawable.ic_baseline_fast_rewind_24,"WindSpeed",weatherProperties.getWind().getSpeed().toString(),R.drawable.ic_baseline_get_app_24,"Pressure",weatherProperties.getMain().getPressure().toString());
        data.add(wd);

        ///*** Setting Adapter***///
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new MyAdapter(this,data);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

}