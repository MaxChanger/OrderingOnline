package com.k.neleme;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
/**
 * Created by MaxChanger on 2019/3/14.
 */

public class ShopAdapter extends ArrayAdapter {
    private final int resourceId;

    public ShopAdapter(Context context, int textViewResourceId, List<Shop> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Shop Shop = (Shop) getItem(position); // 获取当前项的Fruit实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);//实例化一个对象
        ImageView fruitImage = (ImageView) view.findViewById(R.id.shop_image);//获取该布局内的图片视图
        TextView fruitName = (TextView) view.findViewById(R.id.shop_name);//获取该布局内的文本视图
        ImageView nextName = (ImageView) view.findViewById(R.id.click_image);//获取该布局内的文本视图

        fruitImage.setImageResource(Shop.getImageId());//为图片视图设置图片资源
        fruitName.setText(Shop.getName());//为文本视图设置文本内容
        nextName.setImageResource(Shop.getNextId());//为文本视图设置文本内容

        return view;
    }
}
