package com.example.afagames;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Exemplo de como acessar uma ImageView programaticamente
        ImageView image1 = findViewById(R.id.image1);
        // Aqui você pode adicionar lógicas, como um clique na imagem ou alterar o conteúdo programaticamente.
    }
}
