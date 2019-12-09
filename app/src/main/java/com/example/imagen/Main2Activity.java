package com.example.imagen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


      Button btnAnt;
      ImageView vista3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*//traemos la informacion del mapa de bits del MaintActivity 1
        Bundle extras = getIntent().getExtras();
        if (extras == null)
        {
            return;
        }
        int res = extras.getInt("bitmap");
        ImageView view = (ImageView) findViewById(R.id.bitmapToImageView);
        view.setImageResource(res);

        vista3 = (ImageView) findViewById(R.id.vista3);
        vista3.setImageBitmap(view);
*/

        btnAnt= (Button)findViewById(R.id.btn_ant);

        btnAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent anterior= new Intent(Main2Activity.this, MainActivity.class);
                startActivity(anterior);

            }









        });

    }





}
