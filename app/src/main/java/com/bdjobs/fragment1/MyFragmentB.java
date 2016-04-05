package com.bdjobs.fragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tabriz on 3/29/2016.
 */
public class MyFragmentB extends Fragment {
    TextView textView;
    String data;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.my_fragment_layout_b,container,false);
        if(savedInstanceState == null)
        {

        }
        else
        {
            data = savedInstanceState.getString("text","No Data");
            TextView mytext = (TextView) view.findViewById(R.id.textview);
            mytext.setText(data);
        }
        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.textview);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);
    }

    public void changeText(String data)
    {
        this.data=data;
        textView.setText(this.data);
    }
}
