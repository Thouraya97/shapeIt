package com.example.emchiaman;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragC extends Fragment {
    FloatingActionButton fab3 ;
    EditText eTension,eGlycemia ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View frag3= inflater.inflate(R.layout.frag_c, container, false);

        return frag3;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        eTension=getView().findViewById(R.id.edittension);
        eGlycemia=getView().findViewById(R.id.editgly);

        fab3=  getView().findViewById(R.id.fab) ;
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tension=eTension.getText().toString();
                String glycemia=eGlycemia.getText().toString();
                int crimson = 0;
                if (((tension.equals(""))&&(glycemia.equals("")))||((tension.equals(""))||(glycemia.equals(""))))  {
                    //finally trigger alarm manager

                    toastt();

                } else {
                    Intent intent= new Intent(getActivity(), Bilan.class);
                    startActivity(intent);
                }


            }
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




