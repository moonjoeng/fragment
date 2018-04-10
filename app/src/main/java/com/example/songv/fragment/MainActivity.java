package com.example.songv.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        linearLayout=findViewById(R.id.linear);*/

        if (linearLayout!=null){
            if (savedInstanceState!=null){
                return;
            }
        }

        FragmentA firstFragment = new FragmentA();//프레그먼트 생성
        firstFragment.setArguments(getIntent().getExtras());
        //프레그먼트 매니저로 트랜잭션 시작, 컨테이너에 first 추가함
        getFragmentManager().beginTransaction().add(R.id.linear, firstFragment).commit();
    }

    public void selectFragment(View view){
        Fragment fr = null; //hello!

        switch (view.getId()){
            case R.id.button1:
                fr=new FragmentA();
                break;
            case R.id.button2:
                fr=new FragmentB();
                break;
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.linear, fr);
        ft.addToBackStack(null);
        ft.commit();
    }

   /* public void onClick1(View v){

    }*/
}
