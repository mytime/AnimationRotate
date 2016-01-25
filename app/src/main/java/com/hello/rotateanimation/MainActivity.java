package com.hello.rotateanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;

/**
 * 旋转动画效果
 */
public class MainActivity extends AppCompatActivity {


    //旋转属性
    private RotateAnimation ra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //实例化旋转对象，旋转幅度0-360度
//        ra= new RotateAnimation(0,360);
        ra= new RotateAnimation(0,360,
                Animation.RELATIVE_TO_SELF,0.5f, //去自身一半
                Animation.RELATIVE_TO_SELF,0.5f);
        //持续时间1秒，不设值无效果
        ra.setDuration(1000);


        findViewById(R.id.btnRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //方法一
                //v.startAnimation(ra);

                //方法二
                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.ra));
            }
        });
    }
}
