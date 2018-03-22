package com.abhinav.restowner;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {
    RadioButton yes,no;
    EditText sabji1,sabji2,sabji3;
    Button submit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner element
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        yes = (RadioButton)findViewById(R.id.yes);
        no=(RadioButton)findViewById(R.id.no);

        sabji1 =(EditText)findViewById(R.id.sabji1);
        sabji2 =(EditText)findViewById(R.id.sabji2);
        sabji3 =(EditText)findViewById(R.id.sabji3);

        submit = (Button)findViewById(R.id.submit);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String>  roti = new ArrayList<String>();
        roti.add("2");
        roti.add("3");
        roti.add("4");
        roti.add("5");
        roti.add("6");
        roti.add("7");
        roti.add("Unlimited");

        List<String>  rice = new ArrayList<String>();
        rice.add("Fixed");
        rice.add("Unlimited");

        List<String>  dal = new ArrayList<String>();
        dal.add("Fixed");
        dal.add("Unlimited");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, roti);
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, rice);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dal);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spinner1.setAdapter(dataAdapter1);
        spinner2.setAdapter(dataAdapter2);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}