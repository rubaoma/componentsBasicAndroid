package com.rubdev.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    private RadioButton radioMasculino, radioFeminino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editnome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

        //checkBox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        radioMasculino = findViewById(R.id.radioMasculino);
        radioFeminino = findViewById(R.id.radioFeminino);



    }

    public void radioButton(){
        String texto = "";
        if( radioMasculino.isChecked()){
            String opcao = radioMasculino.getText().toString();
            texto = opcao + " selecionado";
        }
        if( radioFeminino.isChecked()){
            String opcao = radioFeminino.getText().toString();
            texto = opcao + " selecionado";
        }
        textoResultado.setText(texto);
    }


    public void  checkbox() {

        String texto = "";
        if( checkVerde.isChecked()){
            String corSelecionada = checkVerde.getText().toString();
            texto = corSelecionada+" selecionado -";
            //texto = "Verde selecionado - ";
        }
        if( checkBranco.isChecked()){
            texto = texto + "Branco selecionado - ";
        }
        if( checkVermelho.isChecked()){
            texto = texto + "Vermelho selecionado - ";
        }

        textoResultado.setText( texto );
    }


    public void enviar(View view){
            radioButton();
        //checkbox();
        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("nome: "+ nome + " email:"+ email);
        */
    }

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");

    }
}
