package com.k.neleme.Windows;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.k.neleme.ItemView;
import com.k.neleme.Login.LoginActivity;
import com.k.neleme.R;


public class SettingActivity extends AppCompatActivity {
    private ImageView mHBack;
    private ImageView mHHead;
    private ImageView mUserLine;
    private TextView mUserName;
    private TextView mUserVal;

    private ItemView mNickName;
    private ItemView mSex;
    private ItemView mSchool;
    private ItemView mSignName;
    private ItemView mBackground;
    private ItemView mLanguage;
    private ItemView mPass;
    private ItemView mCache;
    private ItemView mAbout;
    private ItemView mHelp;
    private ItemView mExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initView();
        printInfo();

    }

    private void initView() {
        //item控件
        mNickName = (ItemView) findViewById(R.id.nickName);
        mSex = (ItemView) findViewById(R.id.sex);
        mSignName = (ItemView) findViewById(R.id.signName);
        mBackground = (ItemView) findViewById(R.id.background);
        mLanguage = (ItemView) findViewById(R.id.language);
        mPass = (ItemView) findViewById(R.id.pass);
        mCache = (ItemView) findViewById(R.id.cache);
        mAbout = (ItemView) findViewById(R.id.about);
        mHelp  = (ItemView) findViewById(R.id.help);
        mExit = (ItemView) findViewById(R.id.exit);
        mSchool  = (ItemView) findViewById(R.id.school);
    }
    private void printInfo(){
        mNickName.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mSex.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mSchool.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mSignName.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mBackground.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mLanguage.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mPass.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mCache.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mAbout.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
            }
        });
        mHelp.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
//                Intent intent = new Intent();
//                intent.setClass(SettingActivity.this, HelpActivity.class);
//                startActivity(intent);
                Toast.makeText(SettingActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();

            }
        });
        mExit.setItemClickListener(new ItemView.itemClickListener() {
            @Override
            public void itemClick(String text) {
//                Toast.makeText(SettingsActivity.this, "该功能尚未完善，敬请期待！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(SettingActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}
