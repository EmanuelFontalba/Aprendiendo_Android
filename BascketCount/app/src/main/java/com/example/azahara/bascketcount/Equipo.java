package com.example.azahara.bascketcount;

public class Equipo {
    private int resultado;
    private int faltas;

    public Equipo(){
        setResultado(0);
        setFaltas(0);
    }

    public int getResultado(){
        return this.resultado;
    }

    private void setResultado(int resultado){
        this.resultado=resultado;
    }

    public int getFaltas(){
        return this.faltas;
    }

    private void setFaltas(int faltas){
        this.faltas=faltas;
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

    public void falta(){
        setFaltas(getFaltas()+1);
    }
}
