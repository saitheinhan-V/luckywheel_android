package com.example.luckywheel.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import rubikstudio.library.LuckyWheelView;
import rubikstudio.library.model.LuckyItem;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.luckyWheel)
//    LuckyWheelView luckyWheelView;
//    @BindView(R.id.btnPlay)
//    Button btnPlay;

    List<LuckyItem> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ButterKnife.bind(this);
        Button btnPlay = findViewById(R.id.btnPlay);
        LuckyWheelView luckyWheelView = findViewById(R.id.luckyWheel);
        TextView tvPlay = findViewById(R.id.tvPlay);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = new Random().nextInt(data.size() - 1) + 0;
                luckyWheelView.startLuckyWheelWithTargetIndex(random);
            }
        });

        tvPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = new Random().nextInt(data.size() - 1) + 0;
                luckyWheelView.startLuckyWheelWithTargetIndex(random);
            }
        });

        luckyWheelView.setLuckyRoundItemSelectedListener(new LuckyWheelView.LuckyRoundItemSelectedListener() {
            @Override
            public void LuckyRoundItemSelected(int index) {
                Toast.makeText(MainActivity.this,"Selected value is "+data.get(index).topText,Toast.LENGTH_LONG).show();
            }
        });


        LuckyItem luckyItem1 = new LuckyItem();
        luckyItem1.topText = "100 ks";
//        luckyItem1.icon = R.drawable.test1;
        luckyItem1.color = 0xf44f39f4;
        data.add(luckyItem1);

        LuckyItem luckyItem2 = new LuckyItem();
        luckyItem2.topText = "200 ks";
//        luckyItem2.icon = R.drawable.test2;
        luckyItem2.color = 0xf4cc98df;
        data.add(luckyItem2);

        LuckyItem luckyItem3 = new LuckyItem();
        luckyItem3.topText = "300 ks";
//        luckyItem3.icon = R.drawable.test3;
        luckyItem3.color = 0xf49a6a85;
        data.add(luckyItem3);

        //////////////////
        LuckyItem luckyItem4 = new LuckyItem();
        luckyItem4.topText = "400 ks";
//        luckyItem4.icon = R.drawable.test4;
        luckyItem4.color = 0xf44f39f4;
        data.add(luckyItem4);

        LuckyItem luckyItem5 = new LuckyItem();
        luckyItem5.topText = "500 ks";
//        luckyItem5.icon = R.drawable.test5;
        luckyItem5.color = 0xf4cc98df;
        data.add(luckyItem5);

        LuckyItem luckyItem6 = new LuckyItem();
        luckyItem6.topText = "600 ks";
//        luckyItem6.icon = R.drawable.test6;
        luckyItem6.color = 0xf49a6a85;
        data.add(luckyItem6);
        //////////////////

        //////////////////////
        LuckyItem luckyItem7 = new LuckyItem();
        luckyItem7.topText = "700 ks";
//        luckyItem7.icon = R.drawable.test7;
        luckyItem7.color = 0xf44f39f4;
        data.add(luckyItem7);

        LuckyItem luckyItem8 = new LuckyItem();
        luckyItem8.topText = "800 ks";
//        luckyItem8.icon = R.drawable.test8;
        luckyItem8.color = 0xf4cc98df;
        data.add(luckyItem8);


        LuckyItem luckyItem9 = new LuckyItem();
        luckyItem9.topText = "900 ks";
//        luckyItem9.icon = R.drawable.test9;
        luckyItem9.color = 0xf49a6a85;
        data.add(luckyItem9);

        luckyWheelView.setData(data);
        luckyWheelView.setRound(3);
        luckyWheelView.setTouchEnabled(false);


    }
}