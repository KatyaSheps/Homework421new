package ru.sheps.android.homework421;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.List;


public class ListViewActivity extends AppCompatActivity {

    private List<Sample> values;

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);

        values.add(new Sample("Название сэмпла", "Название урока", R.drawable.ic_ondemand_video_black_24dp));
        values.add(new Sample("Название сэмпла", "Название урока", R.drawable.ic_ondemand_video_black_24dp));
        values.add(new Sample("Название сэмпла", "Название урока", R.drawable.ic_ondemand_video_black_24dp));
        values.add(new Sample("Название сэмпла", "Название урока", R.drawable.ic_ondemand_video_black_24dp));
        values.add(new Sample("Название сэмпла", "Название урока", R.drawable.ic_ondemand_video_black_24dp));

        adapter = new MyAdapter(this, R.layout.my_simple_list_item, values);
        listView.setAdapter(adapter);
    }
}