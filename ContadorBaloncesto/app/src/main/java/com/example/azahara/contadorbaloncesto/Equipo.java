package com.example.azahara.contadorbaloncesto;


public class Equipo {
    private int resultado;

    Equipo(){
        setResultado(0);
    }

    private void setResultado(int resultado){
        this.resultado=resultado;
    }

    public int getResultado(){
        return resultado;
    }

    public void triple(){
        setResultado(getResultado()+3);
    }

    public void doble(){
        setResultado(getResultado()+2);
    }

    public void uno(){
        setResultado(getResultado()+1);
    }

    public void reset(){
        setResultado(0);
    }

    public void masUno(){
        setResultado(getResultado()+1);
    }

    public void menosUno(){
        setResultado(getResultado()-1);
    }
}
