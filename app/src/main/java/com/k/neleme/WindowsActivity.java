package com.k.neleme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.itheima.pulltorefreshlib.PullToRefreshBase;
import com.itheima.pulltorefreshlib.PullToRefreshListView;

import java.util.ArrayList;
import java.util.List;

public class WindowsActivity extends AppCompatActivity {

    private ArrayList<String> mItems = new ArrayList<String>();
    private List<Shop> shoplist = new ArrayList<Shop>();
    private ShopAdapter mArrayAdapter;
    private RelativeLayout infolayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows);
        initShops(); // 初始化列表
        final PullToRefreshListView pullToRefreshListView = (PullToRefreshListView) findViewById(R.id.pull_to_refresh_list_view);
        mArrayAdapter = new ShopAdapter(WindowsActivity.this, R.layout.shop_item, shoplist); //mockList(0, 30)

        // 点击布局跳转到个人信息界面
        infolayout = (RelativeLayout) findViewById(R.id.name_container);
        infolayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(WindowsActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });


        pullToRefreshListView.setAdapter(mArrayAdapter);
        pullToRefreshListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shop shop = shoplist.get(i-1);
                String name = shop.getName();
                //Toast.makeText(WindowsActivity.this , shop.getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(WindowsActivity.this, MainActivity.class);
                intent.putExtra("name_data", name);
                //Toast.makeText(WindowsActivity.this , name, Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        pullToRefreshListView.setMode(PullToRefreshBase.Mode.BOTH);
        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {

            /**
             * 下拉刷新回调
             * @param refreshView
             */
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                //模拟延时三秒刷新
                pullToRefreshListView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mItems.clear();
                        mockList(0, 20);
                        mArrayAdapter.notifyDataSetChanged();
                        pullToRefreshListView.onRefreshComplete();

                    }
                }, 3000);
            }

            /**
             * 上拉加载更多回调
             * @param refreshView
             */
            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                //模拟延时三秒加载更多数据
                pullToRefreshListView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mockList(mItems.size(), 20);
                        mArrayAdapter.notifyDataSetChanged();
                        pullToRefreshListView.onRefreshComplete();
                    }
                }, 3000);
            }
        });


    }


    private List<String> mockList(int start, int count) {
        for (int i = start; i < start + count; i++) {
            mItems.add("学生食堂:" + i);
        }
        return mItems;
    }

    private void initShops() {
        Shop pear = new Shop("桃李园食堂", R.drawable.shitang_1, R.drawable.next);
        shoplist.add(pear);
        Shop grape = new Shop("槐园食堂", R.drawable.shitang_2, R.drawable.next);
        shoplist.add(grape);
        Shop pineapple = new Shop("清真食堂", R.drawable.shitang, R.drawable.next);
        shoplist.add(pineapple);

        Shop apple = new Shop("学生一食堂", R.drawable.shitang_1, R.drawable.next);
        shoplist.add(apple);
        Shop banana = new Shop("学生二食堂", R.drawable.shitang, R.drawable.next);
        shoplist.add(banana);
        Shop orange = new Shop("学生三食堂", R.drawable.shitang_1, R.drawable.next);
        shoplist.add(orange);
        Shop watermelon = new Shop("学生四食堂", R.drawable.shitang_2, R.drawable.next);
        shoplist.add(watermelon);
        Shop strawberry = new Shop("学生五食堂", R.drawable.shitang_2, R.drawable.next);
        shoplist.add(strawberry);
        Shop cherry = new Shop("学生六食堂", R.drawable.shitang, R.drawable.next);
        shoplist.add(cherry);
        Shop mango = new Shop("学生七食堂", R.drawable.shitang_2, R.drawable.next);
        shoplist.add(mango);
    }
}