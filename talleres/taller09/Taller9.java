import java.util.*;
/**
 * Punto 3,4 y 5 del taller 9 de Estructuras de datos y algoritmos 1 
 * @author Luisa Maria Vasquez Gomez 
 */
public class Taller9
{
	
   
    //pedrito 1
    public static void agregar(Hashtable empresas,String key, String value){
        empresas.put(key,value);
    }
    
    //pedrito 2
    public static void buscar(Hashtable empresas,String key){
       if(empresas.containsKey(key)){
           System.out.println(empresas.get(key));
       }else{
           System.out.println("No existe en la tabla");
       }
    }
    //pedrito 3
    public static boolean contienekey(Hashtable empresas,String key){
       return  empresas.containsKey(key);
    } 
    
    //pedrito 4 
    public static boolean contieneValor(Hashtable empresas,String valor){
       return  empresas.containsValue(valor);
    } 
    
     public static void main(String[] args) {
        Hashtable empresas = new Hashtable();
        agregar(empresas,"Google", "Estados Unidos");
        agregar(empresas,"La locura", "Colombia");
        agregar(empresas,"Nokia", "Finlandia");
        agregar(empresas,"Sony", "Japon");
         
       System.out.println("De que pais es Google? ");
       buscar(empresas,"Google");
       System.out.println("De que pais es Motorola? ");
       buscar(empresas,"Motorola");
     
        
       System.out.println("Hay alguna empresa de India? " + contieneValor(empresas,"India"));
       System.out.println("Hay alguna empresa de Estados Unidos? " + contieneValor(empresas,"Estados Unidos"));

    
   }
}
