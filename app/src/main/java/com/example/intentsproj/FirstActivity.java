package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {

    public static  final String EXTRA_MESSAGE1=".com.example.intentsProj";
    public static  final String EXTRA_MESSAGE2=".com.example.intentsProj2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }


    public void sendNumbers(View view1){
        Intent intent3= new Intent(this, SecondActivity.class);



        EditText editText3=(EditText) findViewById(R.id.editText3);
        EditText editText4=(EditText) findViewById(R.id.editText4);


       // int num3= Integer.parseInt(editText3.getText().toString());
        //int num4= Integer.parseInt(editText4.getText().toString());

        String message1= editText3.getText().toString();
        String message2= editText4.getText().toString();

        intent3.putExtra(EXTRA_MESSAGE1, message1);//(key,value)pair
        intent3.putExtra(EXTRA_MESSAGE2, message2);

        //The context to use. Usually your Application or Activity object
        Context context =getApplicationContext();
        //Display string
        CharSequence message=" You just clicked the Ok Button";
        int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration); toast.show();

        // Intent[] intent={intent3, intent4};
       // startActivities(intent);
        startActivity(intent3);

    }
}
