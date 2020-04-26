package com.example.emchiaman;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragA extends Fragment {
FloatingActionButton fab1 ;
    Button btn1 ;
    RadioGroup rg;
    RadioButton rbwoman, rbman;
    EditText etName;
    TextView tvfirst, tvName;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View frag1= inflater.inflate(R.layout.frag_a, container, false);

        return frag1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fab1= getView().findViewById(R.id.fab);
        rg = getView().findViewById(R.id.radiogrp);
        rbman = getView().findViewById(R.id.radioMan);
        rbwoman = getView().findViewById(R.id.radioWoman);
        etName = getView().findViewById(R.id.etname);
        tvfirst = getView().findViewById(R.id.etsex);
        tvName = getView().findViewById(R.id.tvname);
        //btn1=  getView().findViewById(R.id.btn) ;
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                int crimson = 0;
                if (name.equals(""))  {
                    //finally trigger alarm manager
                    crimson = getResources().getColor(R.color.crimson);
                    tvName.setTextColor(crimson);
                    toastt();

                } else {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragB fragment = new FragB() ;
                manager.beginTransaction().replace(R.id.frame, fragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();

            }}
        });
    }

    public void toastt() {
        Toast toast = Toast.makeText(getContext(), "please complete the form", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        View viewt = toast.getView();
        TextView view1 = (TextView) viewt.findViewById(android.R.id.message);

        viewt.setBackgroundResource(R.color.crimson);
        toast.show();
    }

    public void toastc() {
        Toast toast = Toast.makeText(getContext(), "sa7it si chbeb", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
        View viewt = toast.getView();
        TextView view1 = (TextView) viewt.findViewById(android.R.id.message);

        viewt.setBackgroundResource(R.color.colorAccent);
        toast.show();
    }

}




