package com.bdjobs.fragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Tabriz on 3/29/2016.
 */
public class MyFragment extends Fragment implements View.OnClickListener
{
    Button button;
    int counter=0;
    Communicator communicator;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.my_fragment_layout,container,false);
        if (savedInstanceState == null)
        {
            counter = 0;
        }
        else
        {
            counter = savedInstanceState.getInt("counter",0);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        button = (Button) getActivity().findViewById(R.id.button);
        communicator = (Communicator) getActivity();
        button.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }

    @Override
    public void onClick(View v)
    {
        counter++;
        communicator.respond("The button was clicked " + counter + " times");

    }
}
