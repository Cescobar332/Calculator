package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TvPrincipal, Tv1, Tv2, TvOp;
    private Button C, Tres, PIzquierdo, PDerecho, Slash, Siete, Ocho, Nueve, Multiplicar, Cuatro, Cinco, Seis, Restar, Uno, Dos, Sumar, Cero, Punto, FlechaIzq, Igual;

    Float numero1 = 0.0f;
    Float numero2 = 0.0f;
    String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TvPrincipal = findViewById(R.id.tv_principal);
        Tv1 = findViewById(R.id.tv_1);
        Tv2 = findViewById(R.id.tv_2);
        TvOp = findViewById(R.id.tv_op);
        C = findViewById(R.id.buttonC);
        Tres = findViewById(R.id.button3);
        PIzquierdo = findViewById(R.id.buttonllavei);
        PDerecho = findViewById(R.id.buttonllaved);
        Slash = findViewById(R.id.buttonslash);
        Siete = findViewById(R.id.button7);
        Ocho = findViewById(R.id.button8);
        Nueve = findViewById(R.id.button9);
        Multiplicar = findViewById(R.id.buttonx);
        Cuatro = findViewById(R.id.button4);
        Cinco = findViewById(R.id.button5);
        Seis = findViewById(R.id.button6);
        Restar = findViewById(R.id.buttonmenos);
        Uno = findViewById(R.id.button1);
        Dos = findViewById(R.id.button2);
        Sumar = findViewById(R.id.buttonsuma);
        Cero = findViewById(R.id.button0);
        Punto = findViewById(R.id.buttonpunto);
        FlechaIzq = findViewById(R.id.buttonmover);
        Igual = findViewById(R.id.buttonigual);



    }
    public void EscribirCero(View view){
        if(TvPrincipal.getText().toString().equals("0")){
            Tv2.setText("0");
        }else {
            Tv2.setText(Tv2.getText()+ "0");
        }
    }
    public void EscribirUno(View view){
        if(TvPrincipal.getText().toString().equals("1")){
            Tv2.setText("1");
        }else {
            Tv2.setText(Tv2.getText()+ "1");
        }
    }
    public void EscribirDos(View view){
        if(TvPrincipal.getText().toString().equals("2")){
            Tv2.setText("2");
        }else {
            Tv2.setText(Tv2.getText()+ "2");
        }
    }
    public void EscribirTres(View view){
        if(TvPrincipal.getText().toString().equals("3")){
            Tv2.setText("3");
        }else {
            Tv2.setText(Tv2.getText()+ "3");
        }
    }
    public void EscribirCuatro(View view){
        if(TvPrincipal.getText().toString().equals("4")){
            Tv2.setText("4");
        }else {
            Tv2.setText(Tv2.getText()+ "4");
        }
    }
    public void EscribirCinco(View view){
        if(TvPrincipal.getText().toString().equals("5")){
            Tv2.setText("5");
        }else {
            Tv2.setText(Tv2.getText()+ "5");
        }
    }
    public void EscribirSeis(View view){
        if(TvPrincipal.getText().toString().equals("6")){
            Tv2.setText("6");
        }else {
            Tv2.setText(Tv2.getText()+ "6");
        }
    }
    public void EscribirSiete(View view){
        if(TvPrincipal.getText().toString().equals("6")){
            Tv2.setText("6");
        }else {
            Tv2.setText(Tv2.getText()+ "6");
        }
    }
    public void EscribirOcho(View view){
        if(TvPrincipal.getText().toString().equals("8")){
            Tv2.setText("8");
        }else {
            Tv2.setText(Tv2.getText()+ "8");
        }
    }
    public void EscribirNueve(View view){
        if(TvPrincipal.getText().toString().equals("9")){
            Tv2.setText("9");
        }else {
            Tv2.setText(Tv2.getText()+ "9");
        }
    }
    public void Dividir(View view){
        operador = "/";
        GuardarNumero1(view);
        TvOp.setText(operador);
    }
    public void Multiplicar(View view){
        operador = "X";
        GuardarNumero1(view);
        TvOp.setText(operador);
    }
    public void Restar(View view){
        operador = "-";
        GuardarNumero1(view);
        TvOp.setText(operador);
    }
    public void Sumar(View view){
        operador = "+";
        GuardarNumero1(view);
        TvOp.setText(operador);
    }
    public void Limpiar(View view){
        Tv1.setText("");
        Tv2.setText("");
        TvPrincipal.setText("");
        TvOp.setText("");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operador = "";
    }
    public void Borrar(View view){
        String text2 = Tv2.getText().toString();
        Tv2.setText(text2.substring(0, text2.length()-1));
    }
    public void GuardarNumero1(View view){
        numero1 = Float.parseFloat(Tv2.getText().toString());
        String text = Tv2.getText().toString();
        Tv1.setText(text);
        Tv2.setText("");
    }
    public void ResultadoIgual(View view){
        Float result = 0.0f;
        numero2 = Float.parseFloat(Tv2.getText().toString());

        if (operador == "+"){
            result = numero1+numero2;
        } else if (operador == "-") {
            result = numero1 - numero2;
        } else if (operador == "X") {
            result = numero1*numero2;
        } else if (operador == "/") {
            if (numero2 == 0.0f){
                TvPrincipal.setText("No se puede dividir entre 0");
            }else{
                result = numero1/numero2;
            }
        }
        TvPrincipal.setText(result.toString());

    }
    public void LlaveI(View view){
        if(TvPrincipal.getText().toString().equals("(")){
            Tv2.setText("(");
        }else {
            Tv2.setText(Tv2.getText()+ "(");
        }
    }
    public void LlaveD(View view){
        if(TvPrincipal.getText().toString().equals(")")){
            Tv2.setText(")");
        }else {
            Tv2.setText(Tv2.getText()+ ")");
        }
    }
    public void Punto(View view) {
        if (TvPrincipal.getText().toString().equals(".")) {
            Tv2.setText(".");
        } else {
            Tv2.setText(Tv2.getText() + ".");
        }
    }



    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}