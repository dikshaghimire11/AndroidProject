package com.chapter5fragmanet;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;


public class FirstFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText n1=view.findViewById(R.id.num1);
        EditText n2=view.findViewById(R.id.num2);
        Button b=view.findViewById(R.id.addbtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fn=n1.getText().toString();
                String sn=n2.getText().toString();
                int first=Integer.parseInt(fn);
                int second=Integer.parseInt(sn);
                int result=first+second;
                Snackbar.make(view,"The sum is:"+result,Snackbar.LENGTH_LONG).show();

            }
        });
    }
}