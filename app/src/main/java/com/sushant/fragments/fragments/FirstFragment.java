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
public class FirstFragment extends Fragment {

    EditText num1, num2;
    Button bntC;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        num1 = view.findViewById(R.id.et1);
        num2 = view.findViewById(R.id.et2);
        bntC = view.findViewById(R.id.btncalculate);

        bntC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = Integer.parseInt(num1.getText().toString());
                int y = Integer.parseInt(num2.getText().toString());
                int res = x + y;


                Toast.makeText(getActivity(), "The Sum is :" + res, Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }
}
