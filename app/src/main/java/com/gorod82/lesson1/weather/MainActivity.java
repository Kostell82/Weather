package com.gorod82.lesson1.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Объявляем наши вью
    private TextView textView;
    private Spinner spinner;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
// Указываем, какой макет отображать
        setContentView(R.layout.activity_main);
// Находим Text View
        textView = (TextView) findViewById(R.id.textview_description);
// Объявляем и находим кнопку
        Button button = (Button) findViewById(R.id.button_show_description);
// Устанавливаем слушатель нажатий
        button.setOnClickListener(onClickListener);
// Находим Spinner
        spinner = (Spinner) findViewById(R.id.spinner_for_colors);
    }
    // Объявляем listener
    private final View.OnClickListener onClickListener = new
            View.OnClickListener() {
                @Override
                public void onClick (View view) {
// Получаем цвет из Spinner и отображаем в textView
                    if (view.getId() == R.id.button_show_description) {
// Убедимся, что нажата нужная кнопка
// Получаем значение элемента из Spinner
// Получаем эффект
                        String result = WeatherSpec.getEffect(MainActivity.this ,spinner.getSelectedItemPosition());
//// Устанавливаем текст в textView
                        textView.setText(result);
                        //  String color = String.valueOf(spinner.getSelectedItem());
// Устанавливаем это значение в качестве текста для надписи
                        //  textView.setText(color);

                    }
                }
            };
}