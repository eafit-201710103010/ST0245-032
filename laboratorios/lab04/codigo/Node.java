public class Node {
    /**
     * Dato que contiene el nodo
     */
    protected int data;
    
     /**
     * Nodo siguiente 
     */
    protected Node next;
    public Node(int data)
    {
    	next = null;
    	this.data = data;
    }
	
}