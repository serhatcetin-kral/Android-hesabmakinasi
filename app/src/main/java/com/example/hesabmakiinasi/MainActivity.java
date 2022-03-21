package com.example.hesabmakiinasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    TextView result;
    Button sum;
    Button subTrack;
    Button division;
    Button multible;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber=findViewById(R.id.firstNumber);
        secondNumber=findViewById(R.id.secondNumber);
        result=findViewById(R.id.result);
        sum=findViewById(R.id.sum);
        subTrack=findViewById(R.id.subtrack);
        division=findViewById(R.id.division);
        multible=findViewById(R.id.multiblacition);

  // when click button act
   sum.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {

          Integer num1;
          Integer num2;
          Integer num3;

          num1=Integer.parseInt(firstNumber.getText().toString());
          num2=Integer.parseInt(secondNumber.getText().toString());

          num3=num1+num2;
          result.setText(num3.toString());

       }
   });

        // when click  subrack button act
        subTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer num1;
                Integer num2;
                Integer num3;

                num1=Integer.parseInt(firstNumber.getText().toString());
                num2=Integer.parseInt(secondNumber.getText().toString());

                num3=num1-num2;
                result.setText(num3.toString());

            }
        });

// when click  division  button act
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1;
                Double num2;
                Double num3;

                num1=Double.parseDouble(firstNumber.getText().toString());
                num2=Double.parseDouble(secondNumber.getText().toString());

                num3=num1/num2;
                result.setText(num3.toString());

            }
        });
        // when click  multible  button act
        multible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer num1;
                Integer num2;
                Integer num3;

                num1=Integer.parseInt(firstNumber.getText().toString());
                num2=Integer.parseInt(secondNumber.getText().toString());

                num3=num1*num2;
                result.setText(num3.toString());

            }
        });

    }
}