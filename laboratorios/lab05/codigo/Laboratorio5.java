public class Laboratorio5 {
    
    
    public static void main(String[] args) {
        arbolLuisa();
        arbolSantiago();
        arbolSebastian();
    }

   public static void dibujarArbol(BinaryTree a)
   {
       System.out.println("/* arbolito para http://www.webgraphviz.com/ */"); 
       System.out.println("digraph arbolito {");
       System.out.println("size=\"6,6\";");
       System.out.println("node [color=aquamarine, style=filled];");
       dibujarArbolAux(a.getRaiz());
       System.out.println("}");
   }
   
   public static void dibujarArbolAux(Node nodo)
   {
      if (nodo != null)
         //"x_\n__" -> "xo\n__";
         for(Node n: new Node[] {nodo.left, nodo.right} ){
            if (n != null)
               System.out.println("\"" + nodo.getData() + "\" -> \"" + n.getData() + "\";");
            dibujarArbolAux(n);
        }
   }

  
    /**
     * Arbol genealogico de Luisa Maria Vasquez con  las pruebas de los metodos buscar, 
     * tamaño , imprimir y altura , ademas implementa el metodo dibujarArbol
     */
    public static  void arbolLuisa(){
           
        BinaryTree arbol=new BinaryTree("Luisa");   
        Node mama=new Node("Zulima");
        arbol.addMother(arbol.getRaiz(),mama);  
        Node papa=new Node("Gustavo");        
        arbol.addFather(arbol.getRaiz(),papa);    
        
        Node abuelam=new Node("Margarita");
        arbol.addMother(mama,abuelam);
        Node abuelom=new Node("Guillermo");
        arbol.addFather(mama,abuelom);
        
        Node bisabuela=new Node("Ana");
        arbol.addMother(abuelam,bisabuela);  
        Node bisabuelo=new Node("Carlos");
        arbol.addFather(abuelam,bisabuelo);
        
        Node bisabuelap=new Node("Bertatulia");
        arbol.addMother(abuelom,bisabuelap);  
        Node bisabuelop=new Node("Rafael");
        arbol.addFather(abuelom,bisabuelop);
        
        Node abuelap=new Node("Juana");
        arbol.addMother(papa,abuelap);
        Node abuelop=new Node("Amador");
        arbol.addFather(papa,abuelop);
        
        Node bisabuelapm=new Node("Rosa");
        arbol.addMother(abuelap,bisabuelapm);  
        Node bisabuelopm=new Node("Emiliano");
        arbol.addFather(abuelap,bisabuelopm);
        
        Node bisabuelapp=new Node("Carmen");
        arbol.addMother(abuelop,bisabuelapp);  
        Node bisabuelopp=new Node("Rubén");
        arbol.addFather(abuelop,bisabuelopp);
        
        System.out.println("Arbol de Luisa");
        
        System.out.println("Probando metodo buscar con \" Amador\" , se espera true , resultado: "+
        arbol.buscar("Amador"));
        
        System.out.println("Probando metodo tamaño  , se espera 15 , resultado: "+
        arbol.getSize());
        
        System.out.println("Probando metodo altura  , se espera 4 , resultado: "+
        arbol.maxheight());
        
        System.out.println("Probando metodo imprimir , se espera que se imprima :");
        System.out.println(" Ana Carlos Margarita Bertatulia Rafael Guillermo Zulima Rosa Emiliano Juana Carmen Ruben Amador Gustavo Luisa ");
        System.out.println("Resultado: ");
        arbol.recursivePrint(); 
        System.out.println();
       dibujarArbol(arbol);
    }
    
    /**
     * Arbol genealogico de Santiago Escobar con  las pruebas de los metodos buscar, 
     * tamaño , imprimir y altura , ademas implementa el metodo dibujarArbol
     */
    public static  void arbolSantiago(){
           
        BinaryTree arbol=new BinaryTree("Santiago");   
        Node mama=new Node("Lydia");
        arbol.addMother(arbol.getRaiz(),mama);  
        Node papa=new Node("Carlos");        
        arbol.addFather(arbol.getRaiz(),papa);    
        
        Node abuelam=new Node("Edilma");
        arbol.addMother(mama,abuelam);
        Node abuelom=new Node("Alberto");
        arbol.addFather(mama,abuelom);

        Node abuelap=new Node("Luz");
        arbol.addMother(papa,abuelap);
        Node abuelop=new Node("Octavio");
        arbol.addFather(papa,abuelop);
        
        Node bisabuelapp=new Node("Rosa");
        arbol.addMother(abuelap,bisabuelapp);  
        Node bisabuelopp=new Node("Antonio");
        arbol.addFather(abuelap,bisabuelopp);
        
        System.out.println("Arbol de Saantiago");
        
        System.out.println("Probando metodo buscar con \" Luz\" , se espera true , resultado: "+
        arbol.buscar("Luz"));
        
        System.out.println("Probando metodo tamaño  , se espera 9 , resultado: "+
        arbol.getSize());
        
        System.out.println("Probando metodo altura  , se espera 4 , resultado: "+
        arbol.maxheight());
        
        System.out.println("Probando metodo imprimir , se espera que se imprima :");
        System.out.println(" Edilma Alberto Lydia Luz Rosa Antonio Octavio Carlos Santiago ");
        System.out.println("Resultado: ");
        arbol.recursivePrint(); 
        System.out.println();
       dibujarArbol(arbol);
    }
    
     /**
     * Arbol genealogico de Sebastian Giraldo con  las pruebas de los metodos buscar, 
     * tamaño , imprimir y altura , ademas implementa el metodo dibujarArbol
     */
    public static  void arbolSebastian(){
           
        BinaryTree arbol=new BinaryTree("Sebastian");   
        Node mama=new Node("Gloria");
        arbol.addMother(arbol.getRaiz(),mama);  
        Node papa=new Node("Humberto");        
        arbol.addFather(arbol.getRaiz(),papa);    
        
        Node abuelam=new Node("Maria");
        arbol.addMother(mama,abuelam);
        Node abuelom=new Node("Francisco(abuelo)");
        arbol.addFather(mama,abuelom);
        
        Node bisabuela=new Node("Maruja");
        arbol.addMother(abuelam,bisabuela);  
        Node bisabuelo=new Node("Ricardo");
        arbol.addFather(abuelam,bisabuelo);
        
        Node bisabuelap=new Node("Clara");
        arbol.addMother(abuelom,bisabuelap);  
        Node bisabuelop=new Node("Francisco(bisabuelo)");
        arbol.addFather(abuelom,bisabuelop);
        
        Node abuelap=new Node("Orbilia");
        arbol.addMother(papa,abuelap);
        Node abuelop=new Node("Otoniel");
        arbol.addFather(papa,abuelop);
        
        Node bisabuelapm=new Node("Ligia");
        arbol.addMother(abuelap,bisabuelapm);  
        Node bisabuelopm=new Node("Luis");
        arbol.addFather(abuelap,bisabuelopm);
        
        Node bisabuelapp=new Node("Ester");
        arbol.addMother(abuelop,bisabuelapp);  
        Node bisabuelopp=new Node("Jesus");
        arbol.addFather(abuelop,bisabuelopp);
        
        System.out.println("Arbol de Sebastian");
        
        System.out.println("Probando metodo buscar con \" Otoniel\" , se espera true , resultado: "+
        arbol.buscar("Otoniel"));
        
        System.out.println("Probando metodo tamaño  , se espera 15 , resultado: "+
        arbol.getSize());
        
        System.out.println("Probando metodo altura  , se espera 4 , resultado: "+
        arbol.maxheight());
        
        System.out.println("Probando metodo imprimir , se espera que se imprima :");
        System.out.println("Maruja Ricardo Maria Clara Francisco(bisabuelo) Francisco(abuelo) Gloria Ligia Luis Orbilia Ester Jesus Otoniel Humberto Sebastian  ");
        System.out.println("Resultado: ");
        arbol.recursivePrint(); 
        System.out.println();
       dibujarArbol(arbol);
    }
    
     /**
     * Arbol genealogico de Wilkenson tomado del taller 10 y se le añadieron las pruebas del metodo
     * que obtiene el nombre de la abuela materna 
     */
    public static void arbolWilkenson(){
        
         String nombre="Wilkenson";
       BinaryTree  gen =new BinaryTree (nombre);
       Node mama = new Node("Joaquina");
       Node papa = new Node("Sufranio");
       gen.addFather(gen.getRaiz(),papa);
       gen.addMother(gen.getRaiz(),mama);
       Node abuelom=new Node("Eustaquio");
       Node abuelam=new Node("Eustaquia");
       gen.addFather(mama,abuelom);
       gen.addMother(mama,abuelam);
       Node abuelop=new Node("Piolin");
       Node abuelap=new Node("Piolina");
       gen.addFather(papa,abuelop);
       gen.addMother(papa,abuelap);     
       Node abuelamm=new Node("Florinda");
       gen.addMother(abuelam,abuelamm);  
       Node abuelomm=new Node("Jovin");
       gen.addFather(abuelom,abuelomm);     
       Node abuelapp=new Node("Wilberta");
       gen.addMother(abuelap,abuelapp);     
        Node abuelopp=new Node("Usnavy");
       gen.addFather(abuelop,abuelopp);  
       
       System.out.println("La abuela de Wilkenson es : "+gen.getGrandMother("Wilkenson"));
       System.out.println("La abuela de Sufranio es : "+gen.getGrandMother("Sufranio"));     
       System.out.println("La abuela de Joaquina es : "+gen.getGrandMother("Joaquina"));
    }
}