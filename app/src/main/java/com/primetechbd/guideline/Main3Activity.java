package com.primetechbd.guideline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {


    private Spinner spinner1;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        oneSpinner();

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        twoSpinner();
    }

    public void oneSpinner (){

        List<String> list = new ArrayList<String>();

        list.add("Bangladesh");
        list.add("India");
        list.add("China");
        list.add("Dubai");
        list.add("Nepal");

        ArrayAdapter<String> dataAdaptor = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
        dataAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdaptor);
    }

    public void twoSpinner (){

        List<String> list = new ArrayList<String>();

        list.add("Cox'Bazaar");
        list.add("Rangamati");
        list.add("Chittagong");
        list.add("Shilet");

        ArrayAdapter<String> dataAdaptor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdaptor);
    }

}
