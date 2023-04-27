package com.chapter5fragmanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView items=findViewById(R.id.itemLV);
        String names[]={"Diksha","Dhiraj","Sanjeev","Milan","Ritee","Parash","Sabin","Saya"};
        ArrayAdapter <String> adapter  =new  ArrayAdapter<String>(this,R.layout.list_view_item,R.id.nameTV,names);
        items.setAdapter(adapter);
    }
}