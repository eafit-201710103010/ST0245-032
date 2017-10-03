
/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol
{
   private Nodo raiz;
      public Arbol(){
       raiz=null;
    }  
     public Arbol(String a){
       raiz=new Nodo(a);
    }
 
    
    public int max2(int i , int j){
        return i>j ? i : j;
    }
     private int maxheightAUX(Nodo Nodo)
	{
		if (Nodo == null)
				return 0;
		else 
				return max2(maxheightAUX(Nodo.left), maxheightAUX(Nodo.right))+1;
	}	
	public int maxheight()
	{
	   return maxheightAUX(raiz);
	}

	private void recursivePrintAUX(Nodo Nodo)
	{
		if (Nodo != null)
		{
			recursivePrintAUX(Nodo.left);
			recursivePrintAUX(Nodo.right);
			System.out.println(Nodo.getData());
		}

	}
	public void recursivePrint()
	{
		recursivePrintAUX(raiz);
	}
	
	public void addRight(Nodo a, Nodo b ){
	    a.right=b;  
	    }
	    
	public void addLeft(Nodo a ,Nodo b){
	     a.left=b;    
	   }
	   
	public Nodo getRaiz(){
	    return raiz;
	 }
	 
	 public void imprimirInordenAux(Nodo a){
	     imprimirInordenAux(a.left);
	     System.out.print(" "+a.getData());
	     imprimirInordenAux(a.right);
	   }
	   
	  public void imprimirInorden(){
	       imprimirInordenAux(raiz);
	   }
}
