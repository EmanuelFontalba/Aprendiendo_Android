package com.example.azahara.calculator;

public class Calculadora {
    private float resultado;

    Calculadora(){
        setResultado(0);
    }

    public float getResultado(){
        return resultado;
    }

    private void setResultado(float resultado){
        this.resultado = resultado;
    }

    public void suma(float v1){
        setResultado(getResultado()+v1);
    }

    public void resta(float v1){
        setResultado(getResultado()-v1);
    }

    public void multiplicacion(float v1){
        setResultado(getResultado()*v1);
    }

    public void division(float v1){
        setResultado(getResultado()/v1);
    }

    public void cambioSigno(){
        setResultado(getResultado()*-1);
    }

    public void porcentage(float v1){
        setResultado((getResultado()*v1)/100);
    }
}
