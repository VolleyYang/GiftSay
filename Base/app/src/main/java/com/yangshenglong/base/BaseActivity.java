package com.yangshenglong.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by yangshenglong on 16/11/22.
 */

//tuisong
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initView();
        initData();
    }
    //设置布局的
    abstract int setLayout();
    //初始化组件
    abstract void initView();
    //初始化数据的方法
    abstract void initData();


    public <T extends View>  T bindView(int id){
        return (T)findViewById(id);
    }
}
