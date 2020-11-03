/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pep
 */
public class GenericsMain {
    
    
    
    /**
     * Escribe un método que retorne el ultimo elemento de una lista
     */
    public static <T> T ultimo(List<T> lista) {
        // ...
        return null;
    }
    
    
    /**
     * Escribe una método que retorne la media de una lista de Double
     */
    public static double media(List<Double> lista) {
        return 0.0;
    }
    
    
    /**
     * Escribe un método que retorne la cadena mas larga de una lista de String
     */
    
    /**
     * Escribe un método que retorne el maximo de una lista de enteros
     */
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        List<String> lista1 = new ArrayList<>();
        
        lista1.add("Marta");
        lista1.add("Eva");   
        lista1.add("Joan");   
        lista1.add("Carles");   
        lista1.add("Pep");   

        if (lista1.isEmpty()) {
            System.out.println("Lista es buida");
        } else {
            System.out.println("Lista te " + lista1.size() + " elements.");
        }
        
        lista1.remove("Carles");
//        
//        for (int i = 0; i < lista1.size(); i++) {
//            System.out.println(lista1.get(i));
//        }
        
        for(Iterator<String> it = lista1.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        
        List<String> l2 = lista1.subList(0, lista1.size()/ 2);
        
    }
    
}















