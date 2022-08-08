package com.example.saafpunjab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuRecyclerAdapter extends RecyclerView.Adapter<MenuRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<MenuStructure> arrContacts;
    MenuRecyclerAdapter (Context context, ArrayList<MenuStructure> arrContacts)
    {
        this.context= context;
        this.arrContacts= arrContacts;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.bio, parent, false);
        ViewHolder viewHolder= new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.txtname.setText(arrContacts.get(position).getName());
        holder.txtno.setText(arrContacts.get(position).getEmpNo());
        holder.txtshift.setText(arrContacts.get(position).getShift());
        holder.txtuc.setText(arrContacts.get(position).getUc());
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtname, txtno;
        TextView txtuc, txtshift;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtname = itemView.findViewById(R.id.name);
            txtno= itemView.findViewById(R.id.empno);
            txtuc = itemView.findViewById(R.id.uc);
            txtshift= itemView.findViewById(R.id.shift);
        }
    }
}
