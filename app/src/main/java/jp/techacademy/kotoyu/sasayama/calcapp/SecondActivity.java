package jp.techacademy.kotoyu.sasayama.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView m_TextView;
    float m_Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");
        int operateId = intent.getIntExtra("OPERATOR",0);

        if(operateId == R.id.plus){
            m_Answer = Float.valueOf(value1) + Float.valueOf(value2);
        }else if(operateId == R.id.minus){
            m_Answer = Float.valueOf(value1) - Float.valueOf(value2);
        }else if(operateId == R.id.multiply){
            m_Answer = Float.valueOf(value1) * Float.valueOf(value2);
        }else if(operateId == R.id.divide){
            m_Answer = Float.valueOf(value1) / Float.valueOf(value2);
        }else
        {
            Log.d("test","ここには来ない");
        }

        m_TextView = (TextView) findViewById(R.id.textView);
        m_TextView.setText(String.valueOf(m_Answer));

    }
}
