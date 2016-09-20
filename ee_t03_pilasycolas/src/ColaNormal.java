package ee_t03_pilasycolas;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saul
 */
public class ColaNormal<T> {
	
	private ListaLigada<T> cola = new ListaLigada<T>();
    
    public void insertar(T dato){
        cola.agregarFinal(dato);
    }
    
    public T retirar(){
        return cola.eliminaInicioDevolviendo();
    }
}
