

import java.util.Arrays;
import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 * Solucion al ejercicio 1.1 del laboratorio 1 de Estructuras de datos y algoritmos 1
 * @author Santiago Escobar, Sebastian Giraldo y Luisa Maria Vasquez ( Codigo base: Mauricio Toro)  
 * @version 03/09/2017
 */
public class Laboratory1
{    
    
     
      
     
      /**
     * Método que suma todos los elementos de un arreglo 
     * @param A El parámetro A es el arreglo cuyos elementos serán sumados 
     * @param n El parámetro n es el índice del elemento que será sumado  
     * @return La suma total de los elementos del arreglo
     */
    public static int ArraySum(int[] A, int n){          
        int sum;

        if(A.length==0){
            return sum=0;
        }
        if (n == 0){
            sum = A[0];
        }else{ 
            sum = A[n] + ArraySum(A,n-1);
        }
      
        return sum;
    }
  
    /**
     * Método que busca el elemento más grande del arreglo 
     * @param A El parámetro A es el arreglo en el cual se buscará el elemento mayor 
     * @param n El parámetro n es el índice del elemento que se está analizando  
     * @return El elemento más grande del arreglo
     */
    public static int ArrayMax(int[] A, int n){
        int max;
        if(A.length==0){
            return max=0;
        }
        if (n == 0){
            max = A[0];
        }else{
            max = Math.max(A[n],ArrayMax(A, n-1));
        }
        return max;
    }
  
    /**
     * Método que busca el número de la serie de Fibonacci que corresponde al índice dado 
     * @param n El parámetro n es el índice del cual se desea saber el valor en la serie de Fibonacci 
     * @return El número correspondiente al índice dado en la serie de Fibonacci 
     */
    public static int Fibonnacci(int n){ 
        int result;
        if (n == 0 || n == 1){
          result = n;
        }else{
            result = Fibonnacci(n-1) + Fibonnacci(n-2);
        } 
        return result;
    }
    
    /**
     * Método que genera un arreglo aleatorio de tamaño n 
     * @param n El parámetro n es el tamaño del cual se quiere generar el arreglo 
     * @return Un arreglo con valores aleatorios de tamaño n  
     */
    public static int[] generarArregloDeTamanoN(int n){
        int max = 5000;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i =0; i<n; i++){
            array[i] = generator.nextInt(max);
        }
        return array;
    }
    
     /**
     * Método que toma el tiempo para ArraySum
     * @param n El parámetro n es el tamaño del cual se quiere generar un arreglo aleatorio y encontrar la suma de sus elementos  
     * @return El tiempo que tomó hallar la suma de los elementos del arreglo 
     */
    public static long tomarTiempoSum(int n){
        int[]a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        int b= ArraySum(a, a.length-1);
        long estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("ArraySum: "+b+" Tiempo: "+estimatedTime);
        return estimatedTime;
    }
    
   /**
     * Método que toma el tiempo para ArrayMax
     * @param n El parámetro n es el tamaño del cual se quiere generar un arreglo aleatorio y encontrar el elemento mayor  
     * @return El tiempo que tomó hallar el elemento mayor del arreglo
     */
    public static long tomarTiempoMax(int n){
        int[]a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        int b=ArrayMax(a, a.length-1);
        long estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("ArrayMax: "+b+" Tiempo: "+estimatedTime);
       return estimatedTime;
    }
    
    /**
     * Método que toma el tiempo para Fibonacci
     * @param n El parámetro n es el índice del cual se desea saber el valor en la serie Fibonacci
     * @return El tiempo que tomó hallar el valor en el í´ndice dado de la serie Fibonacci 
     */
    public static long tomarTiempoFib(int n){
        long startTime = System.currentTimeMillis();
        int b=Fibonnacci(n);
        long estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("Fibonnacci: "+b+" Tiempo: "+estimatedTime);
        return estimatedTime;
    }
    
    /**
     * Método que prueba los métodos que toman el tiempo para otros métodos 
     */
    public static void main(String[] args){
        int tamaño=5000;
        tomarTiempoSum(tamaño);
        tomarTiempoMax(tamaño);
        tomarTiempoFib(tamaño);
    } 
}

