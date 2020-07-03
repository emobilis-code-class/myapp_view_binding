package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        //get a particular UI components - Textviews,EditText,CardView - we can programmatically
        //change the values -
        //username ,
        //--
      //  String name = "John Doe";
        //

       /* TextView txtName = findViewById(R.id.txtUserName);
        txtName.setText("My Name is : John Doe");
        txtName.setTextColor(Color.parseColor("#F82313"));*/

       //Button,TextView,EditText
        final EditText edtName = findViewById(R.id.edt_name);
        Button btnSave = findViewById(R.id.btn_save);
        final TextView txtWelome = findViewById(R.id.txt_welcome_text);

        Button btnClear = findViewById(R.id.btn_clear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText("");
                txtWelome.setText("");
            }
        });

        //get the name that user has input


        //how we get the click user
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do the different things that you want to happen is clicked
                String name = edtName.getText().toString();
                if (name.isEmpty()){
                    edtName.setError("Provide name");
                }else{
                    txtWelome.setText("Welcome dear "+name);
                }


            }
        });


    }
    /*
    * SOC
    * Separation of Concerns
    * Logic - Java
    * UI - layouts - Res/Layout -
    *
    * |---Oncreate ---|
    * //setContentView(//layout id )
    * - View
    *
    * */

    /*
    * This is the method on activity that inflates the layout
    * Java programs main -
    *
    *
    * Activity - resource layout - associate on create using setContentView(//)
    * */
}