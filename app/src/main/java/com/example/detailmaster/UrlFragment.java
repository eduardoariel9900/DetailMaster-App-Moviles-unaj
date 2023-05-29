package com.example.detailmaster;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class UrlFragment extends Fragment {
    private Button btn;
    private EditText edit;
    MiListener activityCallback;

    public interface MiListener {
        public void onButtonClick(String text);
    }
    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);
        try {
            activityCallback = (MiListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " debe implementar MiListener");
        }
    }


    public void buttonClicked(View view){
        //Notificar al otro fragment con la Url
        activityCallback.onButtonClick(edit.getText().toString());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_url, container, false);

        btn = (Button)view.findViewById(R.id.btn_go);
        edit = (EditText)view.findViewById(R.id.e_url);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
        return view;
    }
}