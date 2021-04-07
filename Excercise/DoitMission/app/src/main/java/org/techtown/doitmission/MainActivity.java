package org.techtown.doitmission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);

        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                moveUp();
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                moveDown();
            }
        });

        moveUp();

    }

    private void moveDown() {

        imageView1.setImageResource(0);
        imageView2.setImageResource(R.drawable.bear1);

        imageView1.invalidate();
        imageView2.invalidate();

    }

    private void moveUp() {

        imageView1.setImageResource(R.drawable.bear1);
        imageView2.setImageResource(0);

        imageView1.invalidate();
        imageView2.invalidate();
    }

}