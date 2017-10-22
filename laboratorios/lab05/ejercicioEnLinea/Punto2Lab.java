import java.util.*;
/**
 * Solucion al ejercicio 2.1 del laboratorio 2 
 * 
 */
public class Punto2Lab
{
    public static void main(String [] args){
        posOrden();
    }
    
    public static void posOrden(){
        BinarySearchTree tree=new BinarySearchTree();
        System.out.println("Ingrese el arbol en preorden, al terminar ingrese un numero negativo");
        leerElementos(tree);
         System.out.println("El recorrido del arbol en Pos-orden es:");   
        imprimirPosorden(tree);
       
    }
    
    public static void leerElementos(BinarySearchTree tree){
        Scanner  s=new Scanner(System.in);
                int  i = s.nextInt();
        if(i<0){}
        else {
            tree.insert(i);
            leerElementos(tree);
        }
        
    }
    
       public static void imprimirPosorden(BinarySearchTree a){
	      if(a.root !=null){
	       imprimirPosordenAux(a.root);
	   }
	}
 
     public static  void imprimirPosordenAux(Nodo a){
	     if(a.left !=null ){ imprimirPosordenAux(a.left);}  
	     if(a.right != null){imprimirPosordenAux(a.right);}
	     System.out.println(" "+a.data);
	     
	   }
}
