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
 * Use the {@link reports1WorkerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class reports1WorkerFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<MonthlyReportModel> events;
    public reports1WorkerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment reports1WorkerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static reports1WorkerFragment newInstance(String param1, String param2) {
        reports1WorkerFragment fragment = new reports1WorkerFragment();
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

        View view= inflater.inflate(R.layout.fragment_reports1_worker, container, false);
        recyclerView= view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        events= new ArrayList<>();

        MonthlyReportModel info= new MonthlyReportModel();
        info.setDate("01");
        info.setDay("Mon");
        info.setPercentage("80%");
        info.setPresent("1574");
        info.setAbsent("102");
        info.setLeave("34");
        events.add(info);

        MonthlyReportModel info2= new MonthlyReportModel();
        info2.setDate("02");
        info2.setDay("Tues");
        info2.setPercentage("80%");
        info2.setPresent("1574");
        info2.setAbsent("102");
        info2.setLeave("34");
        events.add(info2);

        MonthlyReportModel info3= new MonthlyReportModel();
        info3.setDate("03");
        info3.setDay("Wed");
        info3.setPercentage("80%");
        info3.setPresent("1574");
        info3.setAbsent("102");
        info3.setLeave("34");
        events.add(info3);

        MonthlyReportModel info4= new MonthlyReportModel();
        info4.setDate("04");
        info4.setDay("Thu");
        info4.setPercentage("80%");
        info4.setPresent("1574");
        info4.setAbsent("102");
        info4.setLeave("34");
        events.add(info4);

        MonthlyReportModel info5= new MonthlyReportModel();
        info5.setDate("05");
        info5.setDay("Fri");
        info5.setPercentage("80%");
        info5.setPresent("1574");
        info5.setAbsent("102");
        info5.setLeave("34");
        events.add(info5);

        MonthlyReportModel info6= new MonthlyReportModel();
        info6.setDate("06");
        info6.setDay("Sat");
        info6.setPercentage("80%");
        info6.setPresent("1574");
        info6.setAbsent("102");
        info6.setLeave("34");
        events.add(info6);

        MonthlyReportModel info7= new MonthlyReportModel();
        info7.setDate("07");
        info7.setDay("Sun");
        info7.setPercentage("80%");
        info7.setPresent("1574");
        info7.setAbsent("102");
        info7.setLeave("34");
        events.add(info7);

        MonthlyReportModel info8= new MonthlyReportModel();
        info8.setDate("08");
        info8.setDay("Mon");
        info8.setPercentage("80%");
        info8.setPresent("1574");
        info8.setAbsent("102");
        info8.setLeave("34");
        events.add(info8);

        MonthlyReportModel info9= new MonthlyReportModel();
        info9.setDate("09");
        info9.setDay("Tues");
        info9.setPercentage("80%");
        info9.setPresent("1574");
        info9.setAbsent("102");
        info9.setLeave("34");
        events.add(info9);

        MonthlyReportModel info10= new MonthlyReportModel();
        info10.setDate("10");
        info10.setDay("Wed");
        info10.setPercentage("80%");
        info10.setPresent("1574");
        info10.setAbsent("102");
        info10.setLeave("34");
        events.add(info10);

        MonthlyReportModel info11= new MonthlyReportModel();
        info11.setDate("10");
        info11.setDay("Thu");
        info11.setPercentage("80%");
        info11.setPresent("1574");
        info11.setAbsent("102");
        info11.setLeave("34");
        events.add(info11);

        MonthlyReportModel info12= new MonthlyReportModel();
        info12.setDate("12");
        info12.setDay("Fri");
        info12.setPercentage("80%");
        info12.setPresent("1574");
        info12.setAbsent("102");
        info12.setLeave("34");
        events.add(info10);

        MonthlyReportRecyclerAdapter adapter = new MonthlyReportRecyclerAdapter(getContext(), events);
        recyclerView.setAdapter(adapter);


        return view;
    }
}