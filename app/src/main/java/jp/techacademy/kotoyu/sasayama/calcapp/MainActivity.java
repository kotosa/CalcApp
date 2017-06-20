package jp.techacademy.kotoyu.sasayama.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText m_EditText1;
    EditText m_EditText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // イベントリスナーへの登録
        Button button_plus = (Button) findViewById(R.id.plus);
        button_plus.setOnClickListener(this);

        Button button_minus = (Button) findViewById(R.id.minus);
        button_minus.setOnClickListener(this);

        Button button_multiply = (Button) findViewById(R.id.multiply);
        button_multiply.setOnClickListener(this);

        Button button_divide = (Button) findViewById(R.id.divide);
        button_divide.setOnClickListener(this);

        m_EditText1 = (EditText) findViewById(R.id.editText1);
        m_EditText2 = (EditText) findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", m_EditText1.getText().toString());
        intent.putExtra("VALUE2", m_EditText2.getText().toString());
        intent.putExtra("OPERATOR", v.getId());
        startActivity(intent);
   }

}
