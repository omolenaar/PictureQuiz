package com.example.android.picturequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private int currentImageIndex = 0;
    private int [] mImageNames;
    private ImageView mImageView;
    private Button mNextButton;
    private Button mPrevButton;
    private Button mCheckButton;
    private RadioGroup mGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.animalImage);
        mGroup = findViewById(R.id.animals);
        mCheckButton = findViewById(R.id.checkButton);
        mPrevButton = findViewById(R.id.prevButton);
        mNextButton = findViewById(R.id.nextButton);
        mImageNames = new int[]{R.drawable.image1, R.drawable.image2, R.drawable.image3};

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImageIndex++;
                if (currentImageIndex >= mImageNames.length){
                    currentImageIndex = 0;
                }
                mImageView.setImageResource(mImageNames[currentImageIndex]);

            }
        });

        mPrevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImageIndex--;
                if (currentImageIndex < 0) {
                    currentImageIndex = 2;
                }
                mImageView.setImageResource(mImageNames[currentImageIndex]);
        }

        });
    }


}
