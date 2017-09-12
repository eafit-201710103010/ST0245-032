import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * Solucion al taller 8 de pilas y colas 
 * 
 * @author Luisa Maria Vasquez 
 * @version 12/09/2017
 */
public class Taller8
{
   //Punto 1
    public static Stack<Integer> inversa (Stack<Integer> stack){
       if(stack.empty()){
           return stack;
        }else{
            Stack<Integer> snuevo = new Stack();
            while(!stack.empty()){
                snuevo.push(stack.pop());
            }     
            return snuevo;
        }
        
    }
    
    //Punto 2
    public static void cola (Queue<String> queue){
        if(queue.peek()==null){      
        }else{
         String a = queue.poll();
         System.out.println("Atendiendo a :"+a);
         cola(queue);
        }
    }
    
    //notacion polaca
    public static int polaca  (String string){
        
       String[] a=string.split(" ");
       
        Stack<Integer> s=new Stack();
       for(int i =0;i<a.length;i++){
               if(a[i].equals("+") || a[i].equals("-") || 
            a[i].equals("*") ||a[i].equals("/")){
                    int o1=s.pop();
                    int o2=s.pop();
                     int res=0;
                switch(a[i]){
                    case "+":
                    res=o1+o2;
                    s.push(res);
                    break;
                    
                     case "-":
                    res=o1-o2;
                    s.push(res);
                    break;
                    
                     case "*":
                    res=o1*o2;
                    s.push(res);
                    break;
                    
                     case "/":
                    res=o1/o2;
                    s.push(res);
                    break;
              }
                
            }else{
                s.push(Integer.parseInt(a[i]));
            }
        }
        return s.peek();
    }
    
    
    
    
}
