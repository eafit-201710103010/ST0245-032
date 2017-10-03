
/**
 * Write a description of class Ejemplos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejemplos
{
   public static void main (String [] args){
       String nombre="Wilkenson";
       Arbol gen =new Arbol(nombre);
       Nodo mama = new Nodo("Joaquina");
       Nodo papa = new Nodo("Sufranio");
       gen.addRight(gen.getRaiz(),papa);
       gen.addLeft(gen.getRaiz(),mama);
       Nodo abuelom=new Nodo("Eustaquio");
       Nodo abuelam=new Nodo("Eustaquia");
       gen.addRight(mama,abuelom);
       gen.addLeft(mama,abuelam);
       Nodo abuelop=new Nodo("Piolin");
       Nodo abuelap=new Nodo("Piolina");
       gen.addRight(papa,abuelop);
       gen.addLeft(papa,abuelap);
       
       Nodo abuelamm=new Nodo("Florinda");
       gen.addLeft(abuelam,abuelamm);
       
       Nodo abuelomm=new Nodo("Jovin");
       gen.addLeft(abuelom,abuelomm);
       
       Nodo abuelapp=new Nodo("Wilberta");
       gen.addLeft(abuelap,abuelapp);
       
        Nodo abuelopp=new Nodo("Usnavy");
       gen.addLeft(abuelop,abuelopp);
       gen.recursivePrint();
       
       
    }
}
