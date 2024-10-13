package com.example.assinment_4;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] contactName;
    int[] images;
    LayoutInflater inflater;
    CustomAdapter(Context context, String[] contactName, int[] images){
        this.context = context;
        this.contactName = contactName;
        this.images = images;
    }
    @Override
    public int getCount() {
        return contactName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.img);
        TextView textView = convertView.findViewById(R.id.tv_contactName);
        imageView.setImageResource(images[position]);
        textView.setText(contactName[position]);

        return convertView;
    }
}