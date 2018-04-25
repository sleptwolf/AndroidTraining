package com.sleptwolf.learning7;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {

    private static EditText topid;
    private static EditText btmid;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top, String btm);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopSectionListener) context;
        }
        catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.top_section_layout, container, false);

        topid = (EditText)view.findViewById(R.id.topid);
        btmid = (EditText)view.findViewById(R.id.btmid);
        final Button button = (Button)view.findViewById(R.id.btn);

        button.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v) {
                    buttonClicked(v);
                }
            }
        );

        return view;
    }

    public void buttonClicked(View view){
        activityCommander.createMeme(topid.getText().toString(), btmid.getText().toString());
    }
}
