import java.util.Arrays;
/**
 * Solucion al taller 6 sobre arrayList
 * 
 * @author Luisa Maria Vasquez 
 */
public class MiArrayList {
        private int size;
        private static final int DEFAULT_CAPACITY = 10;
        private int[] elements;
        
          // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros.
        public MiArrayList() {
           elements= new int [DEFAULT_CAPACITY];
            size =0;
        }
          // Retorna el tamaño de la lista
        public int size() {
          return size;
        }

          // Agrega un elemento e a la última posición de la lista
        public void add(int e) {
            if(size==elements.length){
                 int newLength=2*elements.length;
                 elements= Arrays.copyOf(elements,  newLength);
                 size++;
                 elements[size-1]=e;            
            }else{
                 size++; 
                 elements[size-1]=e;
                  
            }
             
        }

          // Retorna el elemento que se encuentra en la posición i de la lista
        public int get(int i)  {
            if(i>=size){
               System.out.println("No hay un elemento en la posicion requerida");
            }else{
                return elements[i];
            }
            return 0 ;
        }

          // Agrega un elemento e en la posición index de la lista
        public void add(int index, int e) {
            if(index>=size){
                System.out.println("Indice fuera de limite, puede insertar un numero maximo en la posicion "+(size-1));
            }else if (elements[index]!=0){
                int[] part1 = Arrays.copyOfRange(elements,  0,  index);
                int[] elem={e};
                int[] part2= Arrays.copyOfRange(elements,  index, size);
                int longitud = elements.length+1;
                elements= new int[longitud ];   
                int end=0;
                for(int i =0;i<part1.length;i++){
                    elements[i]=part1[i];  
                    end=i;
                }
                elements[end+1]=e;
                int j=0;
                for(int i =end+2;i<(part1.length+part2.length+1);i++){
                    elements[i]=part2[j];  
                    j++;
                }
                size++;
            }else if(elements[index]==0){
                size++; 
                 elements[index]=e;
                
            }
            
             
        }
}

