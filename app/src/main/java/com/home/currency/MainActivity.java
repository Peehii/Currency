package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.fly.currency.R;

public class MainActivity extends AppCompatActivity {

    private EditText ntd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        ntd = findViewById(R.id.ntd);
    }

    public void go(View view) {
        String n = ntd.getText().toString();
        if (n.equals("")){
            new AlertDialog.Builder(this)
                    .setTitle(R.string.problem)
                    .setMessage(R.string.please_neter_ntd)
                    .setPositiveButton(R.string.ok,null)
                    .show();
        }
        else{
            float ntd = Float.parseFloat(n);
            float result = ntd / 30.9f;
            new AlertDialog.Builder(this)
                    .setTitle(R.string.result)
                    .setMessage(getString(R.string.usd_is) + result)
                    .setPositiveButton(R.string.ok,null)
                    .show();
        }
    }
}
