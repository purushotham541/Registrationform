package com.example.raj.registrationform;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity
{
    EditText et1,et2,et3,et4,et5,et6;
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        et5=(EditText)findViewById(R.id.et5);
        et6=(EditText)findViewById(R.id.et6);
        b1=(Button) findViewById(R.id.b1);
        tv1=(TextView)findViewById(R.id.tv1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if(et1.getText().toString().isEmpty())
                {
                    et1.setError("Should not be Empty");
                    et1.requestFocus();
                }

               else if(et2.getText().toString().isEmpty())
                {
                    et2.setError("Should not be Empty");
                    et2.requestFocus();
                }

               else if(et3.getText().toString().isEmpty())
                {
                    et3.setError("Should not be Empty");
                    et3.requestFocus();
                }

                else if(et4.getText().toString().isEmpty())
                {
                    et4.setError("Should not be Empty");
                    et4.requestFocus();
                }

               else if(et5.getText().toString().isEmpty())
                {
                    et5.setError("Should not be Empty");
                    et5.requestFocus();
                }

              else   if(et6.getText().toString().isEmpty())
                {
                    et6.setError("Should not be Empty");
                    et6.requestFocus();
                }

              else   if (!et5.getText().toString().equals(et6.getText().toString()))

                {
                    Toast.makeText(getApplicationContext(),"password is not matched",Toast.LENGTH_SHORT).show();
                    et6.requestFocus();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();
                    tv1.setText("Connecting....");
                }
            }
        });
    }
}
