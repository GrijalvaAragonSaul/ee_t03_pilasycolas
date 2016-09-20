package ee_t03_pilasycolas;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saul
 */
public class ListaLigada<T>{
	
    private Nodo<T> inicio;
       
    public ListaLigada(){
    	inicio = null;
    }
    
    public void agregarInicio(T dato){
        Nodo<T> nuevo = new Nodo<T>(dato);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }
    
    public void agregarFinal(T dato){
        Nodo<T> tempo = inicio;
        if(inicio == null)
           agregarInicio(dato);
        else{
             while(tempo.getSiguiente() != null)
                   tempo = tempo.getSiguiente();
             tempo.setSiguiente(new Nodo<T>(dato));
        }        
    }
    
    public void recorre(){
    	Nodo<T> tempo = inicio;
    	while(tempo != null){
    		System.out.print(tempo.getDato() + "-->");
    		tempo = tempo.getSiguiente();
    	}
    	System.out.print("null");
    }
    
    public void recorrerRecursivo(Nodo<T> f){
    	if(f != null){
    		System.out.println(f.getDato());
    		recorrerRecursivo(f.getSiguiente());
    	}
    }
   
   
    public String toString(){
        Nodo<T> iterator = inicio;
        String w = "";
         while( iterator != null ){ 
             w += iterator.getDato() + " --> ";
             iterator = iterator.getSiguiente(); 
         } 
         w += null;
         return w;
    }
    
    public Nodo<T> getInicio(){
        return inicio;
    }
    
    public T eliminaFinalDevolv(){
        Nodo<T> tempo = inicio, anterior = null;
        try{
            
            if(inicio.getSiguiente() == null)
               inicio = null;
               else{
                
     while(tempo.getSiguiente() != null){
               anterior = tempo;
                       tempo = tempo.getSiguiente();
                    }  
                   
                    anterior.setSiguiente(null);
            }     
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Lista vacía");
        }
        return tempo.getDato();
    }
    
    public T eliminaInicioDevolviendo(){
        Nodo<T> tempo = inicio;
        try{
            if(tempo.getSiguiente() != null)
                inicio = tempo.getSiguiente();
                else
                inicio = null;
        }
        
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Lista vacía");
            
        }
        
        return tempo.getDato();
    }
    
}
