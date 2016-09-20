
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ee_t03_pilasycolas;

import java.io.*;

/**
 *
 * @author Saul
 */

public class Test {
	
	PilaNormal<String> pila = new PilaNormal<String>(); ColaNormal<String> cola = new ColaNormal<String>();
	
	public void leer(){		
		
		File file = new File("datos.txt");
		try{
	BufferedReader in = new BufferedReader(new FileReader(file));
	String w;
	w = in.readLine(); 
		if(w.equals("0")){ 
System.out.println("Pila:");
		w = in.readLine(); 
		while(w != null){

			if(w.substring(0,1).equals("0"))
			pila.push(w.substring(2,3));
			else{
			if(w.equals("1")) 
System.out.println(pila.pop());
			else
	if(w.equals("2")) 
			System.out.println(pila.peek());
				else
System.out.println("No existe la instrucción.");
		}
			w = in.readLine(); 
				}		
				in.close(); 
			}
		}
                
                
                
                
    catch (FileNotFoundException e1) {
		 System.err.println("El archivo: " + file + " no existe");
	    } 
          catch (IOException e2){
	      e2.printStackTrace();
	    }
	}
	
	public void leer2(){
		
		File file = new File("datos2.txt");
		try{
	BufferedReader in = new BufferedReader(new FileReader(file));
			String w;
			w = in.readLine(); 
	if(w.equals("1")){ 
		System.out.println("Cola:");
w = in.readLine(); 
	while(w != null){
            
		if(w.substring(0,1).equals("0")) 
						
	cola.insertar(w.substring(2,3));
					else
		if(w.equals("1"))
							
				System.out.println(cola.retirar());
					w = in.readLine(); 
				}
	in.close(); 
			}
		}
                
                
                
                
                
                
                catch (FileNotFoundException e1) {
		      System.err.println("El archivo: " + file + " no existe");
	    } 
                catch (IOException e2){
	      e2.printStackTrace();
	    }
	}
	public static void main(String[] args){
		Test x = new Test();
		
		x.leer();
		System.out.println();
		x.leer2();
		
	}
}
