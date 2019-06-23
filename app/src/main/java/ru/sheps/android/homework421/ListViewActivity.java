package ru.sheps.android.homework421;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ListViewActivity extends AppCompatActivity {

    private List<Sample> values = new ArrayList<>();

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);

        values.add(new Sample("Название семпла", "Название урока", R.drawable.ic_ondemand_video_black_24dp));
        values.add(new Sample("Введите адрес", "Домашнее задание 2.1.2", R.drawable.adress));
        values.add(new Sample("Календарь задач", "Домашнее задание 2.1.3", R.drawable.calendar));
        values.add(new Sample("Оплатить", "Домашнее задание 2.1.1", R.drawable.pay));
        values.add(new Sample("Сохранить текст", "Домашнее задание 2.2.1", R.drawable.savetext));

        adapter = new MyAdapter(this, R.layout.my_simple_list_item, values);
        listView.setAdapter(adapter);
    }
}