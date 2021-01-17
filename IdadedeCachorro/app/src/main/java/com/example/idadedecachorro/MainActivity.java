package com.example.idadedecachorro;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText editIdade;
    private TextView textResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // para personalizar o actionbar do aplicativo
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        editIdade = findViewById(R.id.editIdade);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcIdade(View view){
        int idade = Integer.parseInt(editIdade.getText().toString());
        int resultado = idade * 7;

        textResultado.setText("A idade verdadeira de seu cachorro é "+ resultado + " anos.");

    }
}
