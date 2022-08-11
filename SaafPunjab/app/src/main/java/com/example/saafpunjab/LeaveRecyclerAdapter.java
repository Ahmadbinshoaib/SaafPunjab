package com.example.saafpunjab;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LeaveRecyclerAdapter extends RecyclerView.Adapter<LeaveRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<LeaveModel> arrEvents;
    LeaveRecyclerAdapter (Context context, ArrayList<LeaveModel> arrEvents)
    {
        this.context= context;
        this.arrEvents= arrEvents;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.leave_row, parent, false);
        ViewHolder viewHolder= new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtname.setText(arrEvents.get(position).getL_name());
        holder.txtleavetype.setText(arrEvents.get(position).getL_leavetype());
        holder.txtdatefrom.setText(arrEvents.get(position).getL_datefrom());
        holder.txtdateto.setText(arrEvents.get(position).getL_dateto());
        holder.txtnod.setText(arrEvents.get(position).getL_noofdays());
        holder.txtstatus.setText(arrEvents.get(position).getL_status());

        if(holder.txtstatus.getText().toString().equals("Rejected"))
        {
            holder.card.setCardBackgroundColor(Color.parseColor("#dc4437"));
        }
        else if(holder.txtstatus.getText().toString().equals("Pending"))
        {
            holder.card.setCardBackgroundColor(Color.parseColor("#ff9700"));
        }
        else if(holder.txtstatus.getText().toString().equals("Approved"))
        {
            holder.card.setCardBackgroundColor(Color.parseColor("#3cbb04"));
        }

    }

    @Override
    public int getItemCount() {
        return arrEvents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtname, txtleavetype, txtstatus, txtdatefrom, txtdateto, txtnod;
        CardView card;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtname = itemView.findViewById(R.id.name);
            txtleavetype = itemView.findViewById(R.id.leavetype);
            txtstatus = itemView.findViewById(R.id.status);
            txtdatefrom = itemView.findViewById(R.id.datefrom);
            txtdateto = itemView.findViewById(R.id.dateto);
            txtnod = itemView.findViewById(R.id.noOfdays);
            card = itemView.findViewById(R.id.cd);

        }
    }
}
