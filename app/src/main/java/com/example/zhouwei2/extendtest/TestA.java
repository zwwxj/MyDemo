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

	
	public void combine(){
		Log.e("测试A:","合并的测试");
	}
	
	public void new_branch(){
		Log.e("test","new_branch")
	}

    public void roll(){
		Log.e("test","roll")
	}
   public void roll01(){
		Log.e("test","roll")
	}
 public void roll02(){
		Log.e("test","roll02")
	}




}
