/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;
import javax.swing.*;
/**
 *
 * @author Saul
 */
public class PilaNormal<T> {
	
	public ListaLigada<T> pila = new ListaLigada<T>();
    
               public void push(T dato){
        pila.agregarFinal(dato);
    }
    
    public T pop(){
        return pila.eliminaFinalDevolv();
    }
    
   public T peek(){
               ee_t03_pilasycolas.Nodo<T> tempo = pila.getInicio();
        if(tempo == null)
           return null;
           
  try{
      
            while(tempo.getSiguiente() != null)
                  tempo = tempo.getSiguiente();
        }
  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Lista vacía");
            
        }
        return tempo.getDato();
    }
    
    public Boolean isVacia(){
        return pila.getInicio() == null;
    }
}
