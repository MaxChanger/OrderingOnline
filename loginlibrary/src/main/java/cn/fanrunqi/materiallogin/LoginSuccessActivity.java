package cn.fanrunqi.materiallogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.View;
import android.widget.Button;

public class LoginSuccessActivity extends AppCompatActivity {
    private Button btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity_login_success);

        Explode explode = new Explode();
        explode.setDuration(500);
        getWindow().setExitTransition(explode);
        getWindow().setEnterTransition(explode);

        btn_reset   = (Button)findViewById(R.id.button);
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(LoginSuccessActivity.this,com.k.neleme.detail.MainActivity.class );
                //startActivity(intent);
                Intent intent = new Intent();
                intent.setClassName("cn.fanrunqi.materiallogin.LoginSuccessActivity.this", "com.k.neleme.detail.MainActivity.class");
            }
        });
    }
}
