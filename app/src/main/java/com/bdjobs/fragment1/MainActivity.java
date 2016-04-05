package com.bdjobs.fragment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data)
    {
        android.app.FragmentManager manager  = getFragmentManager();
        MyFragmentB myFragmentB = (MyFragmentB) manager.findFragmentById(R.id.fragment2);
        myFragmentB.changeText(data);
    }
}
