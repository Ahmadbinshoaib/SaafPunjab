package com.example.saafpunjab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonthlyReportRecyclerAdapter extends RecyclerView.Adapter<MonthlyReportRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<MonthlyReportModel> arrEvents;
    MonthlyReportRecyclerAdapter (Context context, ArrayList<MonthlyReportModel> arrEvents)
    {
        this.context= context;
        this.arrEvents= arrEvents;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.monthlywiseleave, parent, false);
        ViewHolder viewHolder= new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtdate.setText(arrEvents.get(position).getDate());
        holder.txtday.setText(arrEvents.get(position).getDay());
        holder.txtpercent.setText(arrEvents.get(position).getPercentage());
        holder.txtpresent.setText(arrEvents.get(position).getPresent());
        holder.txtabsent.setText(arrEvents.get(position).getAbsent());
        holder.txtleave.setText(arrEvents.get(position).getLeave());


    }

    @Override
    public int getItemCount() {
        return arrEvents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtdate, txtday, txtpercent, txtpresent, txtabsent, txtleave;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtdate = itemView.findViewById(R.id.date);
            txtday = itemView.findViewById(R.id.day);
            txtpercent = itemView.findViewById(R.id.percent);
            txtpresent = itemView.findViewById(R.id.present);
            txtabsent = itemView.findViewById(R.id.absent);
            txtleave = itemView.findViewById(R.id.leave);

        }
    }
}
