
package test;


public class TestArreglos {
    public static void main(String[] args) {
           
        int edades[] = new int[3];
            // Un arreglo herede de la clase Object por lo que tenemos que utilizar 
            // la palabra new
        System.out.println(edades);
        
        // Modificar los elemntos del arreglo
        // Accedemos a cada uno de los elementos del arreglo
        edades[0] = 1;
        // Accedemos al valor del elemento 0
        System.out.println("edades 0  = " + edades[0] );
        
        edades[1] = 100;
        System.out.println("edades 1  = " + edades[1] );
        edades[2] = 345;
        System.out.println("edades 2  = " + edades[2] );
        
        // Vamos a iterar los elementos dentro del arreglo
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemento" + i + " :" + edades[i]);
        }

        // Sintaxis resumida
        String frutas[] = {"Melon", "Naranja", "Platano", "Uva", "Papaya"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas elemento:" + i + " :" + frutas[i]);
        }
        
        
    }
    
}
