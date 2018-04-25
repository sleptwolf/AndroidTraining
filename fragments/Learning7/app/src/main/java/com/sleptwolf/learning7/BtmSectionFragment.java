package com.sleptwolf.learning7;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BtmSectionFragment extends Fragment {

    private static TextView textView;
    private static TextView textView2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.btm_section_layout, container, false);

        textView = (TextView)view.findViewById(R.id.textView);
        textView2 = (TextView)view.findViewById(R.id.textView2);

        return view;
    }

    public void setMemeText(String top, String btm){
        textView.setText(top);
        textView2.setText(btm);
    }


}
