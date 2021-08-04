package com.masai.a1063aug_fragmentscommunicationandbackstack_we1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {

    private TextView mTvName;
    private TextView mTvAge, mTvGrade, mTvPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initViews();
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        Model model = (Model) getIntent().getSerializableExtra("model");
        mTvName.setText(model.getName());
        mTvAge.setText(model.getAge() + "");
        mTvGrade.setText(model.getGrade());
        mTvPercentage.setText(model.getPercentage());

    }

    private void initViews() {
        mTvAge = findViewById(R.id.tvStudentAge);
        mTvGrade = findViewById(R.id.tvStudentGrade);
        mTvName = findViewById(R.id.tvStudentName);
        mTvPercentage = findViewById(R.id.tvStudentPercentage);
    }
}