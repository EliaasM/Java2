/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author campitos
 */
public class ProbarConstructores2 {
    public static void main(String[] args) {
       Animal a1=new Animal("perro");
       Animal a2=new Animal(20);
       
        System.out.println("El animal es un "+a1.nombre);
        System.out.println("El peso del animal "+a2.peso);
    }
}
