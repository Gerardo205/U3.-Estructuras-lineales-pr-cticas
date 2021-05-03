/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerap
 */
public class TDA_Prioridad {
    private int p;
    private char dato;
    
    public TDA_Prioridad(int p, char dato) {
        this.dato = dato;
        this.p = p;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }
    public void setObj(TDA_Prioridad obj) {
        this.p = obj.p;
        this.dato = obj.dato;
    }
    @Override
    public String toString(){
        return String.format("%c, %d", dato, p);
    }  
}
