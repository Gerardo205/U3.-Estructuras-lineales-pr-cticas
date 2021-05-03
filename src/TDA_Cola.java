/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerap
 */
public class TDA_Cola extends PrioridadBicola {
    public TDA_Cola (int tamano){
        super(tamano);
    }
    public boolean insertarPorIni(char dato, int prioridad){
      if(bicolaLlena()){
          return false;
      }
      if(estaColaVacia()){
          ini=0;
          fin=0;
      }else{
      ini--;}
      vector[ini]= new TDA_Prioridad(prioridad ,dato);
      PriorizarBicola();
      return true;
    }
    public boolean eliminarPorFin(){
        if(estaColaVacia()) return false;
        if(hayUnSoloDato()){
            ini=-1;
            fin=-1;
        }else{
        fin--;}
        return true;
    }
    public boolean bicolaLlena(){
        return ini==0;
    }
    private void PriorizarBicola() {
        if (ini==fin) {
            return;
        }
        int T1 = ini;
        int T2 = ini + 1;
        TDA_Prioridad aux= new TDA_Prioridad(0, 'o');
        
        while (T1 != fin){
            if (vector[T1].getP()<= vector[T2].getP()) {
                aux.setObj(vector[T2]);
                vector[T2].setObj(vector[T1]);
                vector[1].setObj(aux);
                T1 = T2++;
            }else{
                break;
            }
        }
    }
    public int getIni(){
        return ini;
    }
    
    public int getFin(){
        return fin;
    }
    public TDA_Prioridad getValor(int pos){
        return vector[pos];
    }
}
