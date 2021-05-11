package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String editText;
    private String editText2;

    private String editText(String s) {
    }

    private String editText2(String s) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText = findViewById(R.id.et_texto);
        this.editText2 = findViewById(R.id.et_texto2);
    }

    public void onClickBtnMostrar(View v) {
      EditText editText = findViewById(R.id.et_texto);
      EditText editText2 = findViewById(R.id.et_texto2);

      Toast.makeText(MainActivity. this, editText2.getText().toString() + " " + editText.getText(), Toast.LENGTH_LONG).show();

    }

    public void onClickBtnLimpar (View v) {
      String editText(" ") ;
      String editText2(" ");

    }



}