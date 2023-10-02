
package test;

import domain.Persona;


public class TestArreglosObject {
    public static void main(String[] args) {
           Persona personas[] = new Persona[3];
           
           personas[0] = new Persona("Luis");
           personas[2] = new Persona("Karina");
           
           System.out.println("persona 0 = " + personas[0] );
           
           // iterar un arreglo de tipo object
           for(int i = 0; i < personas.length; i++) {
               System.out.println("personas" + i + ", "+ personas[i]);
           
           }
    }
}
