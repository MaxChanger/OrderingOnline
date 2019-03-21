package com.k.neleme.payui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.k.neleme.R;
import com.k.neleme.Windows.WindowsActivity;

public class MainActivity extends AppCompatActivity implements PayPwdView.InputCallBack, View.OnClickListener {
    private String money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payactivity_main);

        Intent intent = getIntent();
        money = intent.getStringExtra("pay_money");
        //        TextView moneyTextView = (TextView) findViewById(R.id.tv_amount);
        //        moneyTextView.setText(money);
        findViewById(R.id.btn_pay).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pay:
                Bundle bundle = new Bundle();

                bundle.putString(PayFragment.EXTRA_CONTENT, "支付：  " + money);

                PayFragment fragment = new PayFragment();
                fragment.setArguments(bundle);
                fragment.setPaySuccessCallBack(MainActivity.this);
                fragment.show(getSupportFragmentManager(), "Pay");
                break;
        }
    }

    @Override
    public void onInputFinish(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(com.k.neleme.payui.MainActivity.this, WindowsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        //Toast.makeText(WindowsActivity.this , name, Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
