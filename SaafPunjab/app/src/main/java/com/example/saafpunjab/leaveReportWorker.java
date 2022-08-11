package com.example.saafpunjab;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link leaveReportWorker#newInstance} factory method to
 * create an instance of this fragment.
 */
public class leaveReportWorker extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<LeaveModel> events;
    Button applyLeave;


    public leaveReportWorker() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment leaveReportWorker.
     */
    // TODO: Rename and change types and number of parameters
    public static leaveReportWorker newInstance(String param1, String param2) {
        leaveReportWorker fragment = new leaveReportWorker();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_leave_report_worker, container, false);
        recyclerView= view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        events= new ArrayList<>();
        events.add(new LeaveModel("Iqbal Javed","Earned Leave", "Pending", "20 - 01 - 2022", "23 - 01 - 2022", "03"));
        events.add(new LeaveModel("Burhan Saif Anjum", "Medical Leave", "Rejected", "12 - 03 - 2022", "14 - 03 - 2022", "02"));
        events.add(new LeaveModel("Iqbal Javed","Earned Leave", "Approved", "20 - 01 - 2022", "23 - 01 - 2022", "03"));
        events.add(new LeaveModel("Burhan Saif Anjum", "Medical Leave", "Approved", "12 - 03 - 2022", "14 - 03 - 2022", "02"));
        events.add(new LeaveModel("Iqbal Javed","Earned Leave", "Pending", "20 - 01 - 2022", "23 - 01 - 2022", "03"));
        events.add(new LeaveModel("Burhan Saif Anjum", "Medical Leave", "Rejected", "12 - 03 - 2022", "14 - 03 - 2022", "02"));
        LeaveRecyclerAdapter adapter = new LeaveRecyclerAdapter(getContext(), events);
        recyclerView.setAdapter(adapter);

        return view;
    }
}