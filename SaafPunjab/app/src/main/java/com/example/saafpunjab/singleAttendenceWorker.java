package com.example.saafpunjab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link singleAttendenceWorker#newInstance} factory method to
 * create an instance of this fragment.
 */
public class singleAttendenceWorker extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<SingleAttendenceModel> events;

    public singleAttendenceWorker() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment singleAttendenceWorker.
     */
    // TODO: Rename and change types and number of parameters
    public static singleAttendenceWorker newInstance(String param1, String param2) {
        singleAttendenceWorker fragment = new singleAttendenceWorker();
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

        View view= inflater.inflate(R.layout.fragment_single_attendence_worker, container, false);
        recyclerView= view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        events= new ArrayList<>();
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "P"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "P"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "P"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "A"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "P"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "A"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "L"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "P"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "P"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "P"));
        events.add(new SingleAttendenceModel("Mon", "01", "8:45 AM", "11:45 PM", "P"));

        SingleAttendenceRecyclerAdapter adapter = new SingleAttendenceRecyclerAdapter(getContext(), events);
        recyclerView.setAdapter(adapter);




        return view;
    }
}