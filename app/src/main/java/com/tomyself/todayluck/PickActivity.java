package com.tomyself.todayluck;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

public class PickActivity extends AppCompatActivity {
    int num_1, num_2, num_3, num_4, num_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);

        this.getSupportActionBar().hide();

        ImageButton btn_home = findViewById(R.id.btn_home);

        Button btn_1_1 = findViewById(R.id.problem1_1);
        Button btn_1_2 = findViewById(R.id.problem1_2);
        Button btn_1_3 = findViewById(R.id.problem1_3);
        Button btn_1_4 = findViewById(R.id.problem1_4);
        Button btn_1_5 = findViewById(R.id.problem1_5);

        Button btn_2_1 = findViewById(R.id.problem2_1);
        Button btn_2_2 = findViewById(R.id.problem2_2);
        Button btn_2_3 = findViewById(R.id.problem2_3);
        Button btn_2_4 = findViewById(R.id.problem2_4);
        Button btn_2_5 = findViewById(R.id.problem2_5);

        Button btn_3_1 = findViewById(R.id.problem3_1);
        Button btn_3_2 = findViewById(R.id.problem3_2);
        Button btn_3_3 = findViewById(R.id.problem3_3);
        Button btn_3_4 = findViewById(R.id.problem3_4);
        Button btn_3_5 = findViewById(R.id.problem3_5);

        Button btn_4_1 = findViewById(R.id.problem4_1);
        Button btn_4_2 = findViewById(R.id.problem4_2);
        Button btn_4_3 = findViewById(R.id.problem4_3);
        Button btn_4_4 = findViewById(R.id.problem4_4);
        Button btn_4_5 = findViewById(R.id.problem4_5);

        Button btn_5_1 = findViewById(R.id.problem5_1);
        Button btn_5_2 = findViewById(R.id.problem5_2);
        Button btn_5_3 = findViewById(R.id.problem5_3);
        Button btn_5_4 = findViewById(R.id.problem5_4);
        Button btn_5_5 = findViewById(R.id.problem5_5);

        Button btn_okay = findViewById(R.id.btn_okay);

        TextView Result_Text = findViewById(R.id.Result_Text);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_1_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_1=1;
                btn_1_1.setBackgroundColor(Color.BLUE);
                btn_1_2.setBackgroundColor(Color.WHITE);
                btn_1_3.setBackgroundColor(Color.WHITE);
                btn_1_4.setBackgroundColor(Color.WHITE);
                btn_1_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_1_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_1=2;
                btn_1_1.setBackgroundColor(Color.WHITE);
                btn_1_2.setBackgroundColor(Color.BLUE);
                btn_1_3.setBackgroundColor(Color.WHITE);
                btn_1_4.setBackgroundColor(Color.WHITE);
                btn_1_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_1_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_1=3;
                btn_1_1.setBackgroundColor(Color.WHITE);
                btn_1_2.setBackgroundColor(Color.WHITE);
                btn_1_3.setBackgroundColor(Color.BLUE);
                btn_1_4.setBackgroundColor(Color.WHITE);
                btn_1_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_1_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_1=4;
                btn_1_1.setBackgroundColor(Color.WHITE);
                btn_1_2.setBackgroundColor(Color.WHITE);
                btn_1_3.setBackgroundColor(Color.WHITE);
                btn_1_4.setBackgroundColor(Color.BLUE);
                btn_1_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_1_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_1=5;
                btn_1_1.setBackgroundColor(Color.WHITE);
                btn_1_2.setBackgroundColor(Color.WHITE);
                btn_1_3.setBackgroundColor(Color.WHITE);
                btn_1_4.setBackgroundColor(Color.WHITE);
                btn_1_5.setBackgroundColor(Color.BLUE);
                return false;
            }
        });


        btn_2_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_2=1;
                btn_2_1.setBackgroundColor(Color.BLUE);
                btn_2_2.setBackgroundColor(Color.WHITE);
                btn_2_3.setBackgroundColor(Color.WHITE);
                btn_2_4.setBackgroundColor(Color.WHITE);
                btn_2_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_2_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_2=2;
                btn_2_1.setBackgroundColor(Color.WHITE);
                btn_2_2.setBackgroundColor(Color.BLUE);
                btn_2_3.setBackgroundColor(Color.WHITE);
                btn_2_4.setBackgroundColor(Color.WHITE);
                btn_2_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_2_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_2=3;
                btn_2_1.setBackgroundColor(Color.WHITE);
                btn_2_2.setBackgroundColor(Color.WHITE);
                btn_2_3.setBackgroundColor(Color.BLUE);
                btn_2_4.setBackgroundColor(Color.WHITE);
                btn_2_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_2_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_2=4;
                btn_2_1.setBackgroundColor(Color.WHITE);
                btn_2_2.setBackgroundColor(Color.WHITE);
                btn_2_3.setBackgroundColor(Color.WHITE);
                btn_2_4.setBackgroundColor(Color.BLUE);
                btn_2_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_2_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_2=5;
                btn_2_1.setBackgroundColor(Color.WHITE);
                btn_2_2.setBackgroundColor(Color.WHITE);
                btn_2_3.setBackgroundColor(Color.WHITE);
                btn_2_4.setBackgroundColor(Color.WHITE);
                btn_2_5.setBackgroundColor(Color.BLUE);
                return false;
            }
        });


        btn_3_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_3=1;
                btn_3_1.setBackgroundColor(Color.BLUE);
                btn_3_2.setBackgroundColor(Color.WHITE);
                btn_3_3.setBackgroundColor(Color.WHITE);
                btn_3_4.setBackgroundColor(Color.WHITE);
                btn_3_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_3_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_3=2;
                btn_3_1.setBackgroundColor(Color.WHITE);
                btn_3_2.setBackgroundColor(Color.BLUE);
                btn_3_3.setBackgroundColor(Color.WHITE);
                btn_3_4.setBackgroundColor(Color.WHITE);
                btn_3_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_3_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_3=3;
                btn_3_1.setBackgroundColor(Color.WHITE);
                btn_3_2.setBackgroundColor(Color.WHITE);
                btn_3_3.setBackgroundColor(Color.BLUE);
                btn_3_4.setBackgroundColor(Color.WHITE);
                btn_3_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_3_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_3=4;
                btn_3_1.setBackgroundColor(Color.WHITE);
                btn_3_2.setBackgroundColor(Color.WHITE);
                btn_3_3.setBackgroundColor(Color.WHITE);
                btn_3_4.setBackgroundColor(Color.BLUE);
                btn_3_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_3_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_3=5;
                btn_3_1.setBackgroundColor(Color.WHITE);
                btn_3_2.setBackgroundColor(Color.WHITE);
                btn_3_3.setBackgroundColor(Color.WHITE);
                btn_3_4.setBackgroundColor(Color.WHITE);
                btn_3_5.setBackgroundColor(Color.BLUE);
                return false;
            }
        });


        btn_4_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_4=1;
                btn_4_1.setBackgroundColor(Color.BLUE);
                btn_4_2.setBackgroundColor(Color.WHITE);
                btn_4_3.setBackgroundColor(Color.WHITE);
                btn_4_4.setBackgroundColor(Color.WHITE);
                btn_4_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_4_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_4=2;
                btn_4_1.setBackgroundColor(Color.WHITE);
                btn_4_2.setBackgroundColor(Color.BLUE);
                btn_4_3.setBackgroundColor(Color.WHITE);
                btn_4_4.setBackgroundColor(Color.WHITE);
                btn_4_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_4_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_4=3;
                btn_4_1.setBackgroundColor(Color.WHITE);
                btn_4_2.setBackgroundColor(Color.WHITE);
                btn_4_3.setBackgroundColor(Color.BLUE);
                btn_4_4.setBackgroundColor(Color.WHITE);
                btn_4_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_4_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_4=4;
                btn_4_1.setBackgroundColor(Color.WHITE);
                btn_4_2.setBackgroundColor(Color.WHITE);
                btn_4_3.setBackgroundColor(Color.WHITE);
                btn_4_4.setBackgroundColor(Color.BLUE);
                btn_4_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_4_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_4=5;
                btn_4_1.setBackgroundColor(Color.WHITE);
                btn_4_2.setBackgroundColor(Color.WHITE);
                btn_4_3.setBackgroundColor(Color.WHITE);
                btn_4_4.setBackgroundColor(Color.WHITE);
                btn_4_5.setBackgroundColor(Color.BLUE);
                return false;
            }
        });


        btn_5_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_5=1;
                btn_5_1.setBackgroundColor(Color.BLUE);
                btn_5_2.setBackgroundColor(Color.WHITE);
                btn_5_3.setBackgroundColor(Color.WHITE);
                btn_5_4.setBackgroundColor(Color.WHITE);
                btn_5_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_5_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_5=2;
                btn_5_1.setBackgroundColor(Color.WHITE);
                btn_5_2.setBackgroundColor(Color.BLUE);
                btn_5_3.setBackgroundColor(Color.WHITE);
                btn_5_4.setBackgroundColor(Color.WHITE);
                btn_5_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_5_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_5=3;
                btn_5_1.setBackgroundColor(Color.WHITE);
                btn_5_2.setBackgroundColor(Color.WHITE);
                btn_5_3.setBackgroundColor(Color.BLUE);
                btn_5_4.setBackgroundColor(Color.WHITE);
                btn_5_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_5_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_5=4;
                btn_5_1.setBackgroundColor(Color.WHITE);
                btn_5_2.setBackgroundColor(Color.WHITE);
                btn_5_3.setBackgroundColor(Color.WHITE);
                btn_5_4.setBackgroundColor(Color.BLUE);
                btn_5_5.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        btn_5_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num_5=5;
                btn_5_1.setBackgroundColor(Color.WHITE);
                btn_5_2.setBackgroundColor(Color.WHITE);
                btn_5_3.setBackgroundColor(Color.WHITE);
                btn_5_4.setBackgroundColor(Color.WHITE);
                btn_5_5.setBackgroundColor(Color.BLUE);
                return false;
            }
        });

        btn_okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int Result;
                int score=0;

                btn_1_1.setBackgroundColor(Color.WHITE);
                btn_1_2.setBackgroundColor(Color.WHITE);
                btn_1_3.setBackgroundColor(Color.WHITE);
                btn_1_4.setBackgroundColor(Color.WHITE);
                btn_1_5.setBackgroundColor(Color.WHITE);

                btn_2_1.setBackgroundColor(Color.WHITE);
                btn_2_2.setBackgroundColor(Color.WHITE);
                btn_2_3.setBackgroundColor(Color.WHITE);
                btn_2_4.setBackgroundColor(Color.WHITE);
                btn_2_5.setBackgroundColor(Color.WHITE);

                btn_3_1.setBackgroundColor(Color.WHITE);
                btn_3_2.setBackgroundColor(Color.WHITE);
                btn_3_3.setBackgroundColor(Color.WHITE);
                btn_3_4.setBackgroundColor(Color.WHITE);
                btn_3_5.setBackgroundColor(Color.WHITE);

                btn_4_1.setBackgroundColor(Color.WHITE);
                btn_4_2.setBackgroundColor(Color.WHITE);
                btn_4_3.setBackgroundColor(Color.WHITE);
                btn_4_4.setBackgroundColor(Color.WHITE);
                btn_4_5.setBackgroundColor(Color.WHITE);

                btn_5_1.setBackgroundColor(Color.WHITE);
                btn_5_2.setBackgroundColor(Color.WHITE);
                btn_5_3.setBackgroundColor(Color.WHITE);
                btn_5_4.setBackgroundColor(Color.WHITE);
                btn_5_5.setBackgroundColor(Color.WHITE);

                Result = random.nextInt(5)+1;
                if(Result==num_1) score++;

                Result = random.nextInt(5)+1;
                if(Result==num_2) score++;

                Result = random.nextInt(5)+1;
                if(Result==num_3) score++;

                Result = random.nextInt(5)+1;
                if(Result==num_4) score++;

                Result = random.nextInt(5)+1;
                if(Result==num_5) score++;

                Result_Text.setText("\n\n\n"+score+"개 맞추셨습니다!\n->오늘 뭐 해보시는게 어떠세요?\n\n\n");

                num_1=0;
                num_2=0;
                num_3=0;
                num_4=0;
                num_5=0;
            }
        });

    }
}
