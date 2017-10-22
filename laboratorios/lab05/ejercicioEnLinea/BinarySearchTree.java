//Realizado por: Luisa María Vásquez Gómez
// Sebastián Giraldo Gómez
//Santiago Escobar Mejía
public class BinarySearchTree {

    public Nodo root;

    public BinarySearchTree() {
        
    }
    
    public void insert(int n){
        insertAux(n,root);
    }
    public void insertAux(int n,Nodo r){
        if(r!=null){
            if(n>=r.data&&r.right==null)r.right=new Nodo(n);
            else if(n>=r.data)insertAux(n,r.right);
            
            if(n<r.data&&r.left==null)r.left=new Nodo(n);
            else if(n<r.data)insertAux(n,r.left);
        }else{
            root=new Nodo(n);
        }
    }

    public boolean search(int n) {
        return searchAux(n,root);
    }
    private boolean searchAux(int n,Nodo r){
        if(r==null)return false;
        if(r.data==n) return true;
        if(n<r.data) return searchAux(n,r.left);
        return searchAux(n, r.right);
    }
    
    
    public void delete(int n) {
        deleteAux(n,root);
    }
    
    private void deleteAux(int n,Nodo r){
        if(r!=null){
        if(r.data==n){
            if(r.left==null&r.right==null)r=null;
            else if(r.left==null)r=r.right;
            else if(r.right==null)r=r.left;
            else{
                r.data=deleteAuxAux(r.left).right.data;
                deleteAuxAux(r.left).destRight();
            }
        }
        if(n<r.data) deleteAux(n,r.left);
        else if(n>r.data) deleteAux(n, r.right);
        }
    }
    
    private Nodo deleteAuxAux(Nodo l){
       if(l.right==null){
           l.right=new Nodo(l.data);
           return l;
       }
        if(l.right.right==null){ 
            return l;
        }else{
            return deleteAuxAux(l.right);
        }  
    }
    
        public void dibujar(){
        System.out.println("digraph G {");
        auxdibujar("",root);
        System.out.println("}");
    }
    
    private void auxdibujar(String a, Nodo root){
        if(root==null){
        }else if(root.left==null&&root.right==null){
             System.out.println("\""+root.data+"\"\n");
        }else if(root.left==null){
            System.out.print("\""+root.data+"\" -> ");
            auxdibujar(a,root.left);
            auxdibujar(a,root.right);
            System.out.println();
        } else if(root.right==null){
            System.out.print("\""+root.data+"\" -> ");
            auxdibujar(a,root.left);
            auxdibujar(a,root.right);
            System.out.println();
        }else{
            System.out.print("\""+root.data+"\" -> ");
            auxdibujar(a,root.left);
            System.out.print("\""+root.data+"\" -> ");
            auxdibujar(a,root.right);
            System.out.println();
        }

    }

}