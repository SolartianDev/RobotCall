
package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author mont_
 */
public class MainStream {
    public static void main(String[] args) {
        
        // Instancia de una lista normal
        List<String> paises = new ArrayList();
        String pais = "COLOMBIA";
        paises.add("USA");
        paises.add("ECUADOR");
        paises.add(2, pais);
        paises.add("VENEZUELA");
        paises.add(3,"ARGENTINA");
        paises.add("ECUADOR");
        paises.add("ECUADOR");
        
    List<String> paisesFiltrados =  paises.stream()
                .filter(p ->p.contains("A"))
                .filter(p-> p.endsWith("A"))
                .collect(Collectors.toList());
        
    
        System.out.println(paises);
        
        
        //instancia de un Stream
        Stream<String> paises2 = Stream.of("COLOMBIA","USA","ECUADOR");
        Stream<String> paises3 = paises.stream();
        
   
        List<String> elementosFiltrados=    paises2
                .filter(p ->p.contains("A"))
                .filter(p-> p.endsWith("IA"))
                .collect(Collectors.toList());
        
        System.out.println(elementosFiltrados);
        
        System.out.println(paisesFiltrados);
        
      
    }
  
   
}
