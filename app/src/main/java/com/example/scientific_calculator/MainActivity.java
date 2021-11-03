package com.example.scientific_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.scientific_calculator.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private static final boolean DEBUG = true;

    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(R.layout.activity_main);

    }

    public void clearForm(View view){ clearForm(); }
    public void clearForm(){
        binding.results.setText("");
    }

    public void oneButton(View view){oneButton();}
    public void oneButton() {binding.buttonOne.setOnClickListener(v -> binding.results.setText(binding.results.getText() + "1"));}

}