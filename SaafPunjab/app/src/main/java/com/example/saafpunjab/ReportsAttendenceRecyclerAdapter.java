package com.example.saafpunjab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReportsAttendenceRecyclerAdapter extends RecyclerView.Adapter<ReportsAttendenceRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<ReportsAttendenceModel> arrEvents;
    ReportsAttendenceRecyclerAdapter (Context context, ArrayList<ReportsAttendenceModel> arrEvents)
    {
        this.context= context;
        this.arrEvents= arrEvents;

    }

    @NonNull
    @Override
    public ReportsAttendenceRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.attendencereportrow, parent, false);
        ViewHolder viewHolder= new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReportsAttendenceRecyclerAdapter.ViewHolder holder, int position) {
        holder.txtname.setText(arrEvents.get(position).getName());
        holder.txtcategory.setText(arrEvents.get(position).getCategory());
        holder.txtstatus.setText(arrEvents.get(position).getStatus());
        holder.txtcheckin.setText(arrEvents.get(position).getCheckIn());
        holder.txtcheckout.setText(arrEvents.get(position).getCheckOut());

        if(holder.txtstatus.getText().toString().equals("P"))
        {
            holder.sta.setImageResource(R.drawable.present);
        }
        else if(holder.txtstatus.getText().toString().equals("A"))
        {
            holder.sta.setImageResource(R.drawable.absent);
        }
        else if(holder.txtstatus.getText().toString().equals("L"))
        {
            holder.sta.setImageResource(R.drawable.leaveicon);
        }

    }

    @Override
    public int getItemCount() {
        return arrEvents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtname, txtcategory, txtstatus, txtcheckin , txtcheckout;
        ImageView sta;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtname = itemView.findViewById(R.id.name);
            txtcategory = itemView.findViewById(R.id.category);
            txtstatus = itemView.findViewById(R.id.status);
            txtcheckin = itemView.findViewById(R.id.checkin);
            txtcheckout = itemView.findViewById(R.id.checkout);
            sta= itemView.findViewById(R.id.s);

        }
    }
}
