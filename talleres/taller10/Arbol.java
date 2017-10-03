/**
 * Solucion al taller 10 , esta case incluye la implementacion de arbol, el metodo imprimir inorden 
 * y el metodo que genera el codigo para GraphViz
 * 
 * @author Luisa Maria Vasquez
 * @version 03/10/2017
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
	     if(a.left !=null ){ imprimirInordenAux(a.left);}     
	     System.out.println(" "+a.getData());
	     if(a.right != null){imprimirInordenAux(a.right);}
	   }
	   
	public void imprimirInorden(){
	      if(raiz !=null){
	       imprimirInordenAux(raiz);
	   }
	   }
	   
	   public String metodoGraphViz(){
	     String s ="";
	    s = s + "digraph finite_state_machine { \n rankdir=TB; \n  node [shape = circle]; ";
	        if(raiz !=null){
	        s= GraphVizAux(raiz,s);
	       }
	        s+= "}";
	        return s;
     }
     
     public String GraphVizAux(Nodo a, String s  ){
          if(a.left != null){
              s= s+ a.getData() + " -> "+ a.left.getData()+"; \n";
              s= GraphVizAux(a.left,s);
            }else if(a.right!= null && a.left==null){
                s=s+ a.getData()+"null" + " [shape=point];  \n";
                s=s + a.getData() + " -> "+ a.getData()+"null ; \n";
            }
            
            if(a.right != null){
              s= s+ a.getData() + " -> "+ a.right.getData()+"; \n";
              s= GraphVizAux(a.right,s);
            }else if(a.left != null && a.right==null){
                s=s+ a.getData()+"null" + " [shape=point]; \n";
                s=s + a.getData() + " -> "+ a.getData()+"null ; \n";
            }
            
            return s;
        }
    }