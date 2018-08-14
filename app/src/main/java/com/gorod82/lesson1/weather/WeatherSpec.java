package com.gorod82.lesson1.weather;

import android.content.Context;

public class WeatherSpec {
    static String getEffect (Context context, int position) {
// Получаем массив эффектов (для этого необходим контекст приложения)
        String[] strings = context.getResources().getStringArray(R.array.effect);
// Получаем эффект из массива (для этого необходима позиция Spinner)
        String effect = strings[position];
// Возвращаем эффект
        return effect;
    }

}
