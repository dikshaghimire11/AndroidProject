package com.chapter5fragmanet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class DialogActivity extends AppCompatActivity {
 MaterialButton btn,btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        btn=findViewById(R.id.calculatebtn);
        btn1=findViewById(R.id.simplebtn);
        btn2=findViewById(R.id.tringlebtn);
        btn3=findViewById(R.id.areacirclebtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displaySI();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayAreaOfTringle();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayAreaOfCircle();
            }
        });

    }
    private void displayAreaOfCircle(){
        AlertDialog.Builder builder=new AlertDialog.Builder(DialogActivity.this);
        builder.setTitle("Calculate Area of Circle");
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.areaofcircle,null);
        builder.setView(view);

        EditText r= view.findViewById(R.id.radius);
        MaterialButton add=view.findViewById(R.id.circlebtn);
        TextView result=view.findViewById(R.id.resultcircle);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float output;
                output= (float) (Float.parseFloat(r.getText().toString())*Float.parseFloat(r.getText().toString())*Math.PI);
                result.setText(String.valueOf(output));
            }
        });
        builder.show();
    }
    private void displayAreaOfTringle(){
        AlertDialog.Builder builder=new AlertDialog.Builder(DialogActivity.this);
        builder.setTitle("Calculate Area of Tringle");
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.areaoftriangle,null);
        builder.setView(view);

        EditText b= view.findViewById(R.id.base);
        EditText h= view.findViewById(R.id.height);
        MaterialButton add=view.findViewById(R.id.areabtn);
        TextView result=view.findViewById(R.id.resultarea);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float output;
                output=Math.round (Float.parseFloat(b.getText().toString())*Integer.parseInt(h.getText().toString())/2);
                result.setText(String.valueOf(output));
            }
        });
        builder.show();
    }
    private void displaySI(){
        AlertDialog.Builder builder=new AlertDialog.Builder(DialogActivity.this);
        builder.setTitle("Calculate Simple Intrest");
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.simple_intrest,null);
        builder.setView(view);

        EditText p= view.findViewById(R.id.principle);
        EditText t= view.findViewById(R.id.time);
        EditText r= view.findViewById(R.id.rate);
        MaterialButton add=view.findViewById(R.id.SIbtn);
        TextView result=view.findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float output;
                output=(Float.parseFloat(p.getText().toString())*Integer.parseInt(t.getText().toString())*Integer.parseInt(r.getText().toString()))/100;
                result.setText(String.valueOf(output));
            }
        });
        builder.show();
    }
   private void displayDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(DialogActivity.this);
        builder.setTitle("Calculate Sum");
       LayoutInflater inflater=getLayoutInflater();
      View view =inflater.inflate(R.layout.custom_dialog,null);
       builder.setView(view);
       EditText firstnum= view.findViewById(R.id.num1);
       EditText secondnum= view.findViewById(R.id.num2);
       MaterialButton add=view.findViewById(R.id.addbtn);
       TextView result=view.findViewById(R.id.resultTv);
       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int first, second,output;
               first=Integer.parseInt(firstnum.getText().toString());
               second=Integer.parseInt(secondnum.getText().toString());
               output=first+second;
               result.setText(String.valueOf(output));
           }
       });
       builder.show();
    }

}