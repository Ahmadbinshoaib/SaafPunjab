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

public class SingleAttendenceRecyclerAdapter extends RecyclerView.Adapter<SingleAttendenceRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<SingleAttendenceModel> arrEvents;
    SingleAttendenceRecyclerAdapter(Context context, ArrayList<SingleAttendenceModel> arrEvents)
    {
        this.context= context;
        this.arrEvents= arrEvents;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.singleattendencegrid, parent, false);
        ViewHolder viewHolder= new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtdate.setText(arrEvents.get(position).getDate());
        holder.txtday.setText(arrEvents.get(position).getDay());
        holder.txtstatus.setText(arrEvents.get(position).getStatus());
        holder.txtcheckin.setText(arrEvents.get(position).getCheckin());
        holder.txtcheckout.setText(arrEvents.get(position).getCheckout());


        if(holder.txtstatus.getText().toString().equals("P"))
        {
            holder.st.setImageResource(R.drawable.present);
        }
        else if(holder.txtstatus.getText().toString().equals("A"))
        {
            holder.st.setImageResource(R.drawable.absent);
        }
        else if(holder.txtstatus.getText().toString().equals("L"))
        {
            holder.st.setImageResource(R.drawable.leaveicon);
        }

    }


    @Override
    public int getItemCount() {
        return arrEvents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtdate, txtday, txtcheckin, txtcheckout, txtstatus;
        ImageView st;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            txtdate = itemView.findViewById(R.id.date1);
            txtday = itemView.findViewById(R.id.day1);
            txtstatus = itemView.findViewById(R.id.status1);
            txtcheckin = itemView.findViewById(R.id.checkin1);
            txtcheckout = itemView.findViewById(R.id.checkout1);
            st = itemView.findViewById(R.id.s1);
        }
    }
}
