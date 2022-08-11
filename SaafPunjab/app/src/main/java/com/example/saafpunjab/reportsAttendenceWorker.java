package com.example.saafpunjab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link reportsAttendenceWorker#newInstance} factory method to
 * create an instance of this fragment.
 */
public class reportsAttendenceWorker extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<ReportsAttendenceModel> events;

    public reportsAttendenceWorker() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment reportsAttendenceWorker.
     */
    // TODO: Rename and change types and number of parameters
    public static reportsAttendenceWorker newInstance(String param1, String param2) {
        reportsAttendenceWorker fragment = new reportsAttendenceWorker();
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
        View view= inflater.inflate(R.layout.fragment_reports_attendence_worker, container, false);
        // Inflate the layout for this fragment
        recyclerView= view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        events= new ArrayList<>();
        events.add(new ReportsAttendenceModel("Iqbal Ahmad", "Sanitary Worker", "", "P", "08:45 AM", "11:20 PM"));
        events.add(new ReportsAttendenceModel("Arham Ali Khan Janjua", "Sanitary Worker", "", "P", "08:45 AM", "11:20 PM"));
        events.add(new ReportsAttendenceModel("Mouiz Ahmad", "Sanitary Worker", "", "A", "08:45 AM", "11:20 PM"));
        events.add(new ReportsAttendenceModel("Farhan Ahmad Siddique", "Sanitary Worker", "", "P", "08:45 AM", "11:20 PM"));
        events.add(new ReportsAttendenceModel("Arshad Asim Ali", "Sanitary Worker", "", "L", "08:45 AM", "11:20 PM"));
        ReportsAttendenceRecyclerAdapter adapter = new ReportsAttendenceRecyclerAdapter(getContext(), events);
        recyclerView.setAdapter(adapter);

        return view;
    }
}