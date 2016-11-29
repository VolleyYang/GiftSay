package com.yangshenglong.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private TextView tv;

    @Override
    int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    void initView() {

        tv = (TextView) findViewById(R.id.tv);
    }

    @Override
    void initData() {

        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
