package com.example.ahosanhabib.travelcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private EditText editText;
    private Button busB,airB,trainB;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =(EditText) findViewById(R.id.inputID);
        busB = (Button) findViewById(R.id.byBusID);
        airB =(Button) findViewById(R.id.byAirID);
        trainB = (Button) findViewById(R.id.byTrainID);
        textView = (TextView) findViewById(R.id.showID);

        busB.setOnClickListener(this);
        airB.setOnClickListener(this);
        trainB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        try{

            Double inp = Double.parseDouble(editText.getText().toString());
            if(v.getId()==R.id.byBusID){
                double b = 2;
                double bus = b*inp;
                textView.setText(String.valueOf( bus));

            }
            else if(v.getId()==R.id.byAirID){

                double b = 10;
                double bus = b*inp;
                textView.setText(String.valueOf(bus));
            }
            else if(v.getId()==R.id.byTrainID){

                double b = 1.5;
                double bus = b*inp;
                textView.setText(String.valueOf( bus));
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please insert a number",Toast.LENGTH_SHORT).show();
        }


    }
}
