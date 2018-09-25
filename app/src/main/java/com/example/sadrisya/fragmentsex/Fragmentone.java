package com.example.sadrisya.fragmentsex;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentone extends Fragment {


    public Fragmentone() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_one_layout, container, false);
        Button button = (Button) rootView.findViewById(R.id.bnToFirst);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnBtn = new Intent(getActivity(),
                        MainActivity.class);

                startActivity(returnBtn);
            }
        });
        return rootView;
    }

}
