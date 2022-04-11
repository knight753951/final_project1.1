package com.example.final_project;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
public class WelcomeActivity extends AppCompatActivity {


    //启动界面，停留三秒

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


      new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1500);

    }

    //实现渐变。
//@Override
//protected void onCreate(Bundle savedInstanceState) {
//// TODO 自动生成的方法存根
//    super.onCreate(savedInstanceState);
//
//    final View view =View.inflate(this, R.layout.activity_welcome,null);     //将启动界面的xml文件转换为view
//
//    setContentView(view);
//
//    AlphaAnimation aa=new AlphaAnimation(0.3f, 1f);           //设置动画效果
//    aa.setDuration(3000);
//    view.startAnimation(aa);
//
//    aa.setAnimationListener(new Animation.AnimationListener() {
//
//
//        @Override
//        public void onAnimationEnd(Animation animation) {
//// TODO 自动生成的方法存根
//            Intent intent= new Intent(WelcomeActivity.this,MainActivity.class);         //设置监听,
//            startActivity(intent);
//            finish();
//        }
//
//
//        @Override
//        public void onAnimationStart(Animation animation) {
//// TODO 自动生成的方法存根
//
//        }
//
//
//        @Override
//        public void onAnimationRepeat(Animation animation) {
//// TODO 自动生成的方法存根
//
//        }
//    });
//
//}


}

