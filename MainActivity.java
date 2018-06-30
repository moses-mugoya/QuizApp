package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaration of variables to increment if answer is correct
    private int mCapitalAns = 0;
    private int mCountryAns = 0;
    private int mMountainAns = 0;
    private int mYearAns = 0;
    private int mKisumuAns = 0;
    private int mNakuruAns = 0;
    private int mNaivashaAns = 0;

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculateScore(View v){

        //getting reference to the views
        RadioButton nairobi = findViewById(R.id.nairobi);
        EditText country = findViewById(R.id.uganda);
        EditText year = findViewById(R.id.year);
        CheckBox kisumu = findViewById(R.id.kisumu);
        CheckBox naivasha = findViewById(R.id.naivasha);
        CheckBox nakuru = findViewById(R.id.nakuru);
        RadioButton kilimanjaro = findViewById(R.id.kilimanjaro);
        Button submit = findViewById(R.id.submit);


        //if answer is correct, increment the variable by one else initialize it to 0
        if(nairobi.isChecked()){
            mCapitalAns = mCapitalAns + 1;
        }else {
            mCapitalAns = 0;
        }

        if(country.getText().toString().equalsIgnoreCase("uganda")){
            mCountryAns = mCountryAns + 1;
        }else {
            mCountryAns = 0;
        }

        if(kisumu.isChecked()){
            mKisumuAns = mKisumuAns + 1;
        }else {
            mKisumuAns = 0;
        }

        if(nakuru.isChecked()){
            mNakuruAns = mNakuruAns + 1;
        }
        else {
            mNakuruAns = 0;
        }

        if(naivasha.isChecked()){
            mNaivashaAns = mNaivashaAns + 1;
        }else {
            mNaivashaAns = 0;
        }

        if(year.getText().toString().equals("1963")){
            mYearAns = mYearAns + 1;
        }else {
            mYearAns = 0;
        }

        if(kilimanjaro.isChecked()){
            mMountainAns = mMountainAns + 1;
        }else {
            mMountainAns = 0;
        }


        //calculating the score based on answer given
        score =(mCapitalAns + mMountainAns + mYearAns + mNaivashaAns + mNakuruAns + mKisumuAns + mCountryAns);
        Toast toast = Toast.makeText(MainActivity.this, "Your have scored "+ score +" out of 7", Toast.LENGTH_LONG);
        toast.show();
        //disable the button after displaying the score message to avoid re-submission
        submit.setEnabled(false);
    }
}
