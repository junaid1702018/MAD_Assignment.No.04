package com.example.Assignment4;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context ctxt;
    ArrayList<WeatherDetails> data;
    public MyAdapter(Context ctxt, ArrayList<WeatherDetails> data){
        this.ctxt = ctxt;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctxt);
        View view = inflater.inflate(R.layout.weather_attributes, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WeatherDetails data = this.data.get(position);
        holder.ImageView.setImageResource(data.Icon);
        holder.UpperText.setText(data.UpperBox);
        holder.LowerText.setText(data.LowerBox);
        holder.ImageView2.setImageResource(data.Icon2);
        holder.UpperText2.setText(data.UpperBox2);
        holder.LowerText2.setText(data.LowerBox2);

    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ImageView;
        TextView UpperText;
        TextView LowerText;
        ImageView ImageView2;
        TextView UpperText2;
        TextView LowerText2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageView = itemView.findViewById(R.id.Image);
            UpperText = itemView.findViewById(R.id.UpperText);
            LowerText = itemView.findViewById(R.id.LowerText);
            ImageView2 = itemView.findViewById(R.id.Image2);
            UpperText2 = itemView.findViewById(R.id.UpperText2);
            LowerText2 = itemView.findViewById(R.id.LowerText2);
        }
    }
}
