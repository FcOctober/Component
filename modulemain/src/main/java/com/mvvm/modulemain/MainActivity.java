package com.mvvm.modulemain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mvvm.librarybase.contract._Test;
import com.mvvm.librarybase.router.RouterActivityPath;
import com.mvvm.librarybase.router.RouterFragmentPath;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.goldze.mvvmhabit.bus.RxBus;
import me.goldze.mvvmhabit.bus.RxSubscriptions;

/**
 * @author fuchao
 * @date 2019-04-25.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("MainActivity");
        setContentView(textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //采用ARouter+RxBus实现组件间通信
                    ARouter.getInstance().build(RouterActivityPath.Test.PAGER_MAIN).navigation();
//                Disposable subscribe = RxBus.getDefault().toObservable(_Test.class)
//                        .subscribe(new Consumer<_Test>() {
//                            @Override
//                            public void accept(_Test t) throws Exception {
//                                //登录成功后重新刷新数据
//                                initData();
//                                //解除注册
//                                RxSubscriptions.remove(subscribe);
//                            }
//                        });
//                RxSubscriptions.add(subscribe);
        }
        });
    }
}
