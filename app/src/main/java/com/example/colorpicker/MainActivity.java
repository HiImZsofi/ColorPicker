package com.example.colorpicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    private Slider slider1;
    private Slider slider2;
    private Slider slider3;
    private TextView tw1;
    private TextView tw2;
    private TextView tw3;
    private TextView tw4;
    public float value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        slider1.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                value = slider.getValue();
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {
                tw1.setText((int) value);
            }
        });
    }

    private void init()
    {
        slider1 = findViewById(R.id.slider1);
        slider2 = findViewById(R.id.slider2);
        slider3 = findViewById(R.id.slider3);
        tw1 = findViewById(R.id.tw1);
        tw2 = findViewById(R.id.tw2);
        tw3 = findViewById(R.id.tw3);
        tw4 = findViewById(R.id.tw4);
    }
}