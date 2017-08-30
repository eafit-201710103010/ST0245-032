/*
* Solucion al taller 7 de estructuras de datos y algoritmos
* Realizado por: Luisa Maria Vasquez
*/
public class Listas {

    Nodo inicio;

    public class Nodo {

        int data;
        Nodo siguiente;

        public Nodo(int data) {
            this.data = data;
        }
    }

    public Listas() {
        inicio = null;
    }
    
   
    public void agregar_inicio(int n) {
        Nodo nuevo = new Nodo(n);
        if (inicio != null) {
            nuevo.siguiente = inicio;
            inicio = nuevo;
        } else {
            inicio = nuevo;
        }
    }

    //Implementacion metodo imprimir
    public void imprimir() {
        Nodo aux = inicio;
        while (true) {
            if (aux != null) {
                System.out.println(aux.data);
                aux = aux.siguiente;
            } else {
                break;
            }
        }
    }

    //Implementacion metodo agregar al final ya que agregar al principio ya estaba implementado
    public void agregar_al_final(int n) {
      Nodo nuevo = new Nodo(n);
      if(inicio==null){
          inicio=nuevo;
        }else {
            Nodo aux=inicio;
            while(aux!=null){
                if(aux.siguiente==null){
                    aux.siguiente=nuevo;
                    break;
                }else{
                    aux=aux.siguiente;
                }
                                
            }
        }
   
    }

    //Punto 2-a Imprimir los elementos de la lista en orden inverso
    public void imprimir_inverso(Nodo a) {
        if(a==null){
        }else {
            imprimir_inverso(a.siguiente);
            System.out.println(a.data);
        }
  
    }

    //Punto 2-b Imprimir el valor que se encuentre en la posición n. 
    public void imprimir(int n) {
      
      if(inicio==null){
          System.out.println("No existen nodos en la lista "); 
        }else {
            Nodo aux=inicio;
            boolean encontrado=false;
            int count =0;
            while(count<=n){
                if(count == n){
                    System.out.println(aux.data); 
                    encontrado=true;
                }
                if(aux.siguiente==null  && encontrado==false){
                    System.out.println("No existe informacion en la posicion requerida"); 
                    break;
                }
                aux=aux.siguiente;
                count++;                                
            }
        }
        
    }

    //Punto 2-c Eliminar el nodo del final   
    public void borrarFinal() {
        if(inicio==null){          
        }else {
              Nodo aux=inicio; 
            while(aux.siguiente!= null){
                Nodo temp=aux;
               aux=aux.siguiente;
                if(aux.siguiente==null){
                    temp.siguiente=null;
                    break;
                }            
            }         
        }

    }

    //Punto 2-d Eliminar el primer nodo de una lista 
    public void borrarInicio() {
        inicio = inicio.siguiente;
    }
    
    //Punto 3 Maximo de una lista
    private static int maximoAux(Nodo nodo) {
      if(nodo==null){
          return 0;
        }else {
            Nodo aux = nodo;
           int max=nodo.data;
            while(aux != null){
               if (aux.data>max){
                   max=aux.data;
                }
                aux=aux.siguiente;                                   
            }
            return max;
        }
    }
    public static int maximo(Listas lista) {
      return maximoAux(lista.inicio);
    }


    //Punto 4 Comparar el contenido de dos listas.
       public boolean comparar(Listas lista) {  
           if(inicio==null && lista.inicio==null){
               return true;
          }else if ((inicio==null && lista.inicio!=null)|| (inicio!=null && lista.inicio==null)) {
            return false;
        }else{ 
              Nodo aux1=inicio;
              Nodo aux2=lista.inicio;
            while(aux1.data==aux2.data){
                aux1=aux1.siguiente;
                aux2=aux2.siguiente;
                     
                if(aux1==null && aux2 ==null){
                    return true;
                }
            }   
            return false;           
        }
      }
      
    public static void main(String[] Lu) {
        Listas l = new Listas();
        System.out.println("Lista 1 ");        
        l.agregar_inicio(4);
        l.agregar_inicio(7);
        l.agregar_inicio(10);
        l.agregar_al_final(28);
        l.imprimir();
        
        System.out.println("Lista 1 inversa");   
        l.imprimir_inverso(l.inicio);
        
        System.out.println("Lista l en la posicion 2 ");
        l.imprimir(2);
        
        System.out.println("Maximo lista l ");
          System.out.println(maximo(l));
        
        System.out.println("Eliminar ultimo elemento");
        l.borrarFinal();
         l.imprimir();
         
         System.out.println("Eliminar primer elemento ");
         l.borrarInicio();
         l.imprimir();
         
          System.out.println("Comparar lista nueva ");
          Listas esta = new Listas();
          esta.agregar_inicio(4);
          esta.agregar_inicio(7);
          esta.agregar_inicio(10);
          esta.agregar_al_final(28);
          esta.borrarFinal();
          esta.borrarInicio();
          System.out.println(esta.comparar(l));       
        
        
    }
}
