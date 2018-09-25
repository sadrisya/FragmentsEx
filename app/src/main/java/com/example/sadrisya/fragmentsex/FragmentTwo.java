package com.example.sadrisya.fragmentsex;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {
    Activity context;

    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Button button;
        Button b2;
        context=getActivity();
        View rootView = inflater.inflate(R.layout.fragment_two_layout,
                container, false);
        button = (Button) rootView.findViewById(R.id.bn2);
        b2 =(Button) rootView.findViewById(R.id.bn1);
             button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Fragmentone f1= new Fragmentone();
                fragmentTransaction.add(R.id.fragment_container,f1);
                fragmentTransaction.commit();
//
//                Button  bn=(Button)context.findViewById(R.id.bn);
//                bn.setVisibility(View.VISIBLE);
//                boolean status=false;

            }
        });
        return rootView;
    }

    public void updateDetail() {
        Intent intent;
        intent = new Intent(getActivity(), DisplayMessageActivity.class);
        EditText editText = (EditText)context.findViewById( R.id.editText);
//        String message = editText.getText().toString();
        intent.putExtra("text", editText.getText().toString());
        startActivity(intent);
    }
}
