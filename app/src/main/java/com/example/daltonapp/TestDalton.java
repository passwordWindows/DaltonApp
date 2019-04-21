package com.example.daltonapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class TestDalton extends AppCompatActivity {

    EditText userinput;
    Button submit;
    String result;
    public static boolean protodeitero = false; // red - green color blind people as a collective
    public static boolean trito = false; // yellow blue
    public static boolean normal = false;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dalton);
        userinput = findViewById(R.id.editText);
        submit = findViewById(R.id.button2);
        submit.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v) {
                                          result = userinput.getText().toString();

                                          switch (result) {
                                              case "70":
                                                  protodeitero = true;
                                                  Toast.makeText(getApplicationContext(), "Proto", Toast.LENGTH_SHORT).show();
                                                  startActivity(new Intent(TestDalton.this, cameraActivity.class));
                                                  break;
                                              case "unsure":
                                                  trito = true;
                                                  Toast.makeText(getApplicationContext(), "Trito", Toast.LENGTH_SHORT).show();
                                                  startActivity(new Intent(TestDalton.this, cameraActivity.class));
                                                  break;
                                              case "29":
                                                  //normal = true;

                                                  AlertDialog.Builder builder = new AlertDialog.Builder(TestDalton.this);
                                                  builder.setTitle("Notification")
                                                          .setMessage("Congratulations! You have normal color vision! You may close this application as it is not necessary to you")
                                                          .setIcon(R.drawable.information)
                                                          .setCancelable(false)
                                                          .setNegativeButton("OK",
                                                                  new DialogInterface.OnClickListener() {
                                                                      public void onClick(DialogInterface dialog, int id) {
                                                                          dialog.cancel();
                                                                      }
                                                                  });
                                                  AlertDialog alert = builder.create();
                                                  alert.show();
                                                  break;
                                              default:
                                                  startActivity(new Intent(TestDalton.this, cameraActivity.class));
                                                  break;
                                          }
                                          }
                                  }


        );


    }



    /*public void checknum(View view) {
        //EditText userinput = (EditText)findViewById(R.id.editText);
        //String result = userinput.getText().toString();
        if (result == "70") {
            protodeitero = true;
        } else if (result == "unsure") {
            trito = true;
        }

        if ((!protodeitero)&&(!trito)){
            normal = true;
            if (normal) {
            AlertDialog.Builder builder = new AlertDialog.Builder(TestDalton.this);
            builder.setTitle("Notification")
                    .setMessage("Congratulations! You have normal color vision! You may close this application as it is not necessary to you")
                    .setIcon(R.drawable.information)
                    .setCancelable(false)
                    .setNegativeButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show(); }
                    } else {
                Intent intent = new Intent(this, cameraActivity.class);
                startActivity(intent);
            }
        }*/

    }

