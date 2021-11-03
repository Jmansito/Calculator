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

    // Clear button to clear out the form. We may need to set it to where one press clears the current entry, and two presses clears the entire equation.
    // User types in 34 + 60
    // One C press would change it to 34 +
    // Two C presses would change it to an empty form
    public void clearForm(View view){ clearForm(); }
    public void clearForm(){
        binding.results.setText("");
    }

    // Starting to try and make the buttons update the textview
    // Currently: Not updating with click listener
    public void oneButton(View view){oneButton();}
    public void oneButton() {binding.one.setOnClickListener(v -> binding.results.setText(binding.results.getText() + "1"));}

}