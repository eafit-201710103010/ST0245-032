/**
 * Implementacion de la clase Nodo del taller 10
 * 
 * @author Luisa Maria Vasquez Gomez
 * @version 03/10/2017
 */
public class Nodo
{
    protected Nodo left,right;
    private String data;
    
    public Nodo(String d){
        data=d;
    }
    
    public void setCont(String a ){
     data=a;
    }
    
    public String getData(){
        return data;
    }
}