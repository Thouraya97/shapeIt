package com.example.emchiaman;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragB extends Fragment {
    EditText et_poids, et_taille ;
   // Button btn1 ;
FloatingActionButton fab2 ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View frag2= inflater.inflate(R.layout.frag_b, container, false);

        return frag2;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
et_poids=getView().findViewById(R.id.etpoids);
et_taille=getView().findViewById(R.id.ettaille);

        fab2=  getView().findViewById(R.id.fab) ;
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String poids=et_poids.getText().toString();
                String taille=et_taille.getText().toString();
                int crimson = 0;
                if (((poids.equals(""))&&(taille.equals("")))||((poids.equals(""))||(taille.equals(""))))  {
                    //finally trigger alarm manager

                    toastt();

                } else{FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragC fragment = new FragC() ;
                    manager.beginTransaction().replace(R.id.frame, fragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();}


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




