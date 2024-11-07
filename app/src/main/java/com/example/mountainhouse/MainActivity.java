package com.example.mountainhouse;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView likeCountTextView;
    private View likeButton;
    private View dislikeButton;
    private int likeCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        likeCountTextView = findViewById(R.id.like_count);
        likeButton = findViewById(R.id.like_button);
        dislikeButton = findViewById(R.id.dislike_button);

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount++;
                updateLikeCount();
            }
        });

        dislikeButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (likeCount > 0) {
                   likeCount--;
               }
               updateLikeCount();
           }
        });
    }

    private void updateLikeCount() {
        likeCountTextView.setText(likeCount + " polubień");
    }
}