package com.clacktas.ross.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] weekdayForecast = new String[]{
                "Today - 16/18",
                "Tomorrow - 16/18",
                "Wednesday - 16/18",
                "Thursday - 16/18",
                "Friday - 16/18",
                "Saturday - 16/18",
                "Sunday - 16/18"
        };
        List<String> weekForecast = new ArrayList<>(Arrays.asList(weekdayForecast));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forcast, R.id.textView, weekForecast);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceBundle) {
        super.onActivityCreated(savedInstanceBundle);
    }
}