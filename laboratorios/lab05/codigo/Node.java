/**
 * Implementacion de la clase Node del Laboratorio 5
 * 
 * @author Luisa Maria Vasquez Gomez, Sebastian Giraldo y Santiago Escobar
 * @version 21/10/2017
 */
public class Node
{
    /**
     * Nodo izquierdo y derecho 
     */
    protected Node left,right;
    /**
     *  Cadena correspondiente al nodo
     */
    private String data;
    
    /**
     * Constructor que recibe un String y lo asigna como dato al nodo
     */
    public Node(String d){
        data=d;
    }
    
    /**
     * Cambiar el contenido del string
     * @param a Contenido nuevo
     */
    public void setCont(String a ){
     data=a;
    }
    
    /**
     * Retorna el contenido del nodo
     * @return Contenido del nodo
     */
    public String getData(){
        return data;
    }
}
