/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package idl.baidu.page;


import android.app.Activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import idl.baidu.com.javacppgradle.R;



public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(this, ">>"+multiply(123,100), Toast.LENGTH_SHORT).show();
        MultiplyDemo multiplyDemo  = new MultiplyDemo();
        int  multi = multiplyDemo.multiply(123,100);

        Toast.makeText(MainActivity.this,String.valueOf(multi),Toast.LENGTH_LONG).show();
        Log.i("MainActivity",String.valueOf(multi));

    }
}
