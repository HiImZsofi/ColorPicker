package com.example.colorpicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
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
    private RelativeLayout mainLayout;
    private int redValue;
    private int greenValue;
    private int blueValue;
    private RelativeLayout coloredLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        slider1.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                redValue = (int) slider1.getValue();
                tw1.setText("Piros: " + redValue);
                tw4.setText(colorToString(redValue, greenValue, blueValue));
                coloredLayout.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
            }
        });

        slider2.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                greenValue = (int) slider2.getValue();
                tw2.setText("Zöld: " + greenValue);
                tw4.setText(colorToString(redValue, greenValue, blueValue));
                coloredLayout.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
            }
        });

        slider3.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                blueValue = (int) slider3.getValue();
                tw3.setText("Kék: " + blueValue);
                tw4.setText(colorToString(redValue, greenValue, blueValue));
                coloredLayout.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
            }
        });
    }
//
    //
    private void init()
    {
        slider1 = findViewById(R.id.slider1);
        slider2 = findViewById(R.id.slider2);
        slider3 = findViewById(R.id.slider3);
        tw1 = findViewById(R.id.tw1);
        tw2 = findViewById(R.id.tw2);
        tw3 = findViewById(R.id.tw3);
        tw4 = findViewById(R.id.tw4);
        mainLayout = findViewById(R.id.mainLayout);
        coloredLayout = findViewById(R.id.coloredLayout);
        redValue=(int) slider1.getValue();
        greenValue=(int) slider2.getValue();
        blueValue=(int) slider3.getValue();
    }

    private String colorToString(int r, int g, int b) {
        return "(" + r + "," + g + "," + b + ")";
    }
}