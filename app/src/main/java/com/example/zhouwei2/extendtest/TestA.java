package com.example.zhouwei2.extendtest;

import android.util.Log;

/**
 * Created by zhouwei2 on 2018/12/27.
 */

public class TestA {
    public TestA() {
        A();
        B();
    }

    public void B() {
        Log.e("测试A:","这是A类的方法B");
    }

    public void A(){
        Log.e("测试A:","这是A类的方法A");
    }
}
