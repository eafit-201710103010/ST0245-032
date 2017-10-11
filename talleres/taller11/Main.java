/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        System.out.println("Prueba insertando valores");
        b.insert(50);
        b.insert(70);
        b.insert(60);
        b.insert(80);
        b.insert(12);
        b.insert(8);
        b.insert(5);
        b.insert(9);
        b.insert(20);
        b.insert(21);

        b.dibujar();

        System.out.println("Prueba eliminando el valor 12");
        b.delete(12);
        b.dibujar();

        System.out.println("Prueba buscar el 9 y después el 12");
        System.out.println(b.search(9));
        System.out.println(b.search(12));
    }
}
