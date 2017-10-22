import java.util.*;
/**
 * Solucion al Lab 5 , esta case incluye la implementacion de BinaryTree, el metodo imprimir inorden 
 * y el metodo que genera el codigo para GraphViz
 * 
 * @author Luisa Maria Vasquez
 * @version 03/10/2017
 */
public class BinaryTree
{
   /**
    * Nodo raiz del arbol binario
    */
    private Node raiz;
    
    /**
    * Tamaño del arbol , es decir , su numero de nodos
    */
   private int size;
   
    /**
    * Constructor por omision
    */
      public BinaryTree(){
       raiz=null;
       size=0;
    } 
    
    /**
    * Constructor que recibe un nombre y lo asigna como raiz al arbol
    * @param a Nombre con el que se inicializara el arbol  
    */
     public BinaryTree(String a){
       raiz=new Node(a);
       size=1;
    }
	
    /**
     * Metodo que imprime el arbol con un recorrido post-orden
     */
	public void recursivePrint()
	{
		recursivePrintAUX(raiz);
	}
	
	/**
    * Metodo auxiliar de recurivePrint
    * @param Node Nodo que se esta imprimiendo actualmente
    */
	private void recursivePrintAUX(Node Node)
	{
		if (Node != null)
		{
			recursivePrintAUX(Node.left);
			recursivePrintAUX(Node.right);
			System.out.println(Node.getData());
		}

	}
	
	/**
    * Metodo que retorna la altura de un arbol
    * @return Altura del arbol
    */
	public int maxheight(){
	   return maxheightAUX(raiz);
	}
	
	/**
    * Metodo que retorna el mayor de dos numeros 
    * @param i Numero 1
    * @param j Numero 2
    * @return El mayor de los dos numeros
    */
	private int max2(int i, int j){
		if (i > j)
			return i;
		return j;
	}
	
	/**
    * Metodo auxiliar de maxheight 
    * @param nodo Nodo actual 
    * @return Altura total del arbol
    */
	private int maxheightAUX(Node node){
		if (node == null)
				return 0;
		else 
				return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
	}
	
	
	
	/**
    * Metodo que adiciona a la derecha de un nodo otro que se recibe como parametro, en este caso como se trata
    * de un arbol genealogico y los hombres van a la derecha se le llama addFather 
    * @param a Nodo al cual se le agregara un hijo derecho
    * @param b Nodo a ser agregado
    */
	public void addFather(Node a, Node b ){
	    a.right=b;  
	    size++;
	    }
	    
	/**
    * Metodo que adiciona a la izquierda de un nodo otro que se recibe como parametro, en este caso como se trata
    * de un arbol genealogico y las mujeres van a la izquierda se le llama addMother 
    * @param a Nodo al cual se le agregara un hijo izquierdo
    * @param b Nodo a ser agregado
    */
	    public void addMother(Node a ,Node b){
	     a.left=b;  
	     size++;
	   }
	 
	/**
    * Metodo que retorna el nodo raiz del arbol
    * @return Nodo raiz
    */   
	public Node getRaiz(){
	    return raiz;
	 }
	 
	/**
    * Metodo que retorna el tamaño (numero de nodos) del arbol
    * @return Tamaño del arbol
    */ 
	 public int getSize(){
	   return size;
    }
    
    /**
    * Metodo que busca si un elemento esta o no en el arbol
    * @param s Nombre a buscar en el arbol
    * @return Si se encuentra o no en el arbol
    */
    public boolean buscar(String s ){
        return buscarAux(raiz,s);
    }  
    
    /**
    * Metodo auxiliar de buscar 
    * @param a Nodo actual
    * @param b Nombre buscado 
    * @return Si el nombre se encuentra o no en el arbol 
    */
    public boolean buscarAux(Node a, String b){
        if(a==null)return false;
        if(a.getData()==b)return true;
        else return buscarAux(a.left,b) || buscarAux(a.right,b);
    }
    
    /**
    * Metodo que dado un nombre retorna el objeto completo que se encuentra en el arbol
    * @param a Nombre a buscar 
    * @return Nodo perteneciente al nombre 
    */ 
     public Node getNode(String a){
        return getNodeAux(raiz,a);
    }
    
    /**
    * Metodo auxiliar de getNode
    * @param a Nodo actual en el que se esta buscando
    * @param b Nombre buscado
    * @return Nodo perteneciente al nombre 
    */ 
    public Node getNodeAux(Node a , String b){
        if(a==null){return null;}
        if(a.getData()==b){ return a;}
        if(getNodeAux(a.right,b)==null)return getNodeAux(a.left,b);
        else return getNodeAux(a.right,b);
    }
    
    /**
    * Metodo que encuentra el nombre de la abuela materna de cualquier persona en un arbol genealogico ,
    * si no se encuentra retorna la cadena vacia 
    * @param a Nombre de quien se quiere saber la abuela materna
    * @return Nombre de la abuela materna
    */ 
    public String getGrandMother(String a){
        Node n=getNode(a);
        if(n==null)return "";
        if(n.left !=null && n.left.left != null){
        return n.left.left.getData();
      }else {
          return "";
        }
    }
    
    /**
    * Metodo que imprime el arbol en recorrido in-orden
    */ 
     public void imprimirInorden(){
	      if(raiz !=null){
	       imprimirInordenAux(raiz);
	   }
	}
	 
	/**
    * Metodo auxiliar de imprimirInorden
    * @param a Nodo que se imprime actualmente
    */ 
     public void imprimirInordenAux(Node a){
	     if(a.left !=null ){ imprimirInordenAux(a.left);}     
	     System.out.println(" "+a.getData());
	     if(a.right != null){imprimirInordenAux(a.right);}
	   }
	   
	  
    }
