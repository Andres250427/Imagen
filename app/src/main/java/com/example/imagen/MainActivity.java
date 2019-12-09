package com.example.imagen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    ImageView   imagen;
    Button btnSgte;
    ImageView imagen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       //cargo la imagen seleccionada por el usuario a la primera vista
        imagen = (ImageView) findViewById(R.id.img_imagen1);



        //conversion imagen a BitMap

        final ImageView imgNorm = findViewById(R.id.img_imagen1);
        final ImageView bitmapImageView = findViewById(R.id.img_imagen2);

        Button button = findViewById(R.id.bitmapToImageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitmapImageView.setImageBitmap(imageView2Bitmap(imgNorm));
            }
        });
    }


    private Bitmap imageView2Bitmap(ImageView view){
        Bitmap bitmap = ((BitmapDrawable)view.getDrawable()).getBitmap();
        return bitmap;
    }








    //cargar imagen
    public void onclick(View view) { //con este metodo cargaremos una imagen
        cargarImagen();
    }



    private void cargarImagen() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI); //solicita un accion a otro componente,
        //el action_pick muestra una lista de objetos para que el ususrio escoja una
        intent.setType("image/"); //intent tipo imagen
        startActivityForResult(intent.createChooser(intent,"seleccione una aplicación"),4);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK){
            Uri path = data.getData();
            imagen.setImageURI(path);

        }
    }










    
}
