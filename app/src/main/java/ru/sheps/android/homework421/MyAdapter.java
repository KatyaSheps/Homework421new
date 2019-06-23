package ru.sheps.android.homework421;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Sample> {

    private List<Sample> dataList;
    private int layout;

    public MyAdapter(Context context, int resource, List<Sample> dataList) {
        super(context, resource, dataList);
        this.dataList = dataList;
        this.layout = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(layout, parent, false);
        }

        Sample sample = dataList.get(position);

        TextView name = convertView.findViewById(R.id.name);
        TextView taskName = convertView.findViewById(R.id.taskName);
        ImageView image = convertView.findViewById(R.id.image);
        name.setText(sample.name);
        taskName.setText(sample.taskName);
        image.setImageDrawable(getContext().getResources().getDrawable(sample.imageResource));

        return convertView;
    }
}

class Sample {
    String name;
    String taskName;
    int imageResource;

    public Sample(String name, String taskName, int imageResourse) {
        this.name = name;
        this.taskName = taskName;
        this.imageResource = imageResourse;
    }
}
