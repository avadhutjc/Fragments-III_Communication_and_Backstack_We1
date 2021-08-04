package com.masai.a1063aug_fragmentscommunicationandbackstack_we1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class StudentPersonalDetailsFragment extends Fragment {
    private EditText mEtName, mEtAge;
    private Button mBtnNext;
    private CommunicationListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_student_personal_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (CommunicationListener) context;
    }

    private void initViews(View view) {
        mBtnNext = view.findViewById(R.id.btnNext);
        mEtAge = view.findViewById(R.id.etStudentAge);
        mEtName = view.findViewById(R.id.etStudentName);
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEtName.getText().toString();
                int Age = Integer.parseInt(mEtAge.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putInt("age", Age);
                if (listener != null) {
                    listener.launchPerformanceFragment(bundle);
                }
            }
        });
    }
}