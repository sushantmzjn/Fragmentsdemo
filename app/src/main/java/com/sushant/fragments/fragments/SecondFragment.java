package com.sushant.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sushant.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    EditText radius;
    Button btnA;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);

        radius = view.findViewById(R.id.radius);
        btnA = view.findViewById(R.id.btnArea);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x = Double.parseDouble(radius.getText().toString());
                Double area = 3.14 * x * x;

                Toast.makeText(getActivity(), "The area is :" + area, Toast.LENGTH_LONG).show();
            }
        });


        return view;
    }

}
