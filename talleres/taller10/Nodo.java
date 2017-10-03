
/**
 * Write a description of class Nodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
