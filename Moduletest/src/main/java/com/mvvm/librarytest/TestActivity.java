package com.mvvm.librarytest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mvvm.librarybase.router.RouterActivityPath;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * @author fuchao
 * @date 2019-04-25.
 */
@Route(path = RouterActivityPath.Test.PAGER_MAIN)
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("TestActivity");
        setContentView(textView);
    }
}
