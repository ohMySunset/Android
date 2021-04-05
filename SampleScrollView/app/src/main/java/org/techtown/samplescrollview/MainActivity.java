package org.techtown.samplescrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 레이아웃에 정의된 뷰 객체 참조
        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView);
        scrollView.setHorizontalScrollBarEnabled(true); // 수평스크롤바 사용 가능 설정
        // 리소스의 이미지 참조
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.bear1);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();
        // 이미지 리소스 설정 및 크기 지정
        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;

    }

    public void onButton1Clicked(View v){
        changeImage();
    }

    private void changeImage() {

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.bear2);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
}