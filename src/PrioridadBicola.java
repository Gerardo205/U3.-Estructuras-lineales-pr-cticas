/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerap
 */
public class PrioridadBicola {
    protected int ini;
    protected int fin;
    protected TDA_Prioridad[] vector;
    
    
    public PrioridadBicola(int tamano){
        vector = new TDA_Prioridad[tamano];
        ini = -1;
        fin = -1;
    }
    
    public boolean insertar(char dato, int prioridad){
        if(estaColaLlena()){ 
            return false;
        }   
        fin++; 
        //Colocar caracter según la prioridad en la cola
        vector[fin] = new TDA_Prioridad(prioridad, dato); 
        if(ini == -1){
            ini = 0;
        }
        PriorizarBicola();
        return true;
    }
    protected boolean estaColaLlena(){
        return fin == vector.length-1;
    }
    public boolean eliminar(){
        if(estaColaVacia()){
            return false;
        }     
        if(hayUnSoloDato()){
            ini = -1;
            fin = -1;
            return true;
        }
        ini++;
        return true;
    }
    protected boolean estaColaVacia(){
        return ini == -1 && fin == -1;
    }
    protected boolean hayUnSoloDato(){
        return ini == fin;
    }
    private void PriorizarBicola() {
        if (hayUnSoloDato()) {
            return;
        }
        int T1 = fin;
        int T2 = fin - 1;
        TDA_Prioridad aux = new TDA_Prioridad(0, '0');
        
        while (T1 != ini){
            if (vector[T1].getP() > vector[T2].getP()) {
                aux.setObj(vector[T1]);
                vector[T1].setObj(vector[T2]);
                vector[T2].setObj(aux);
                T2--;
                T1--;
            }else{
                break;
            }
        }
    }
}
