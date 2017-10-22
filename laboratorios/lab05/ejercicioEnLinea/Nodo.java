public class Nodo {

        public Nodo left=null;
        public Nodo right=null;
        public int data;

        public Nodo(int d) {
            
            data = d;
        }
        
        public void destRight(){
            right=null;
        }
        
        public void destLeft(){
            left=null;
        }
    }