import java.util.*;
import java.io.*;
/**
 * Punto 1 del taller 9 de Estructuras de datos y algoritmos 1 
 * @author Luisa Maria Vasquez Gomez 
 */
public class UnaTablaDeHash
{
    
    private int [] tabla;
    
    public UnaTablaDeHash(){
      tabla=new int [10];
    }
    
    private int funcionHash(String k){     
       int indice = k.charAt(0)/(k.length()*4);
         return indice;
    }
    
    public void put(String k, int v){
        tabla[funcionHash(k)]=v;
    }
    
    public int  get(String k ){
      return tabla[funcionHash(k)];
    }
    
    
}
