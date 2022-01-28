import java.util.*;

public class TestGCD {

  
  public static void main(String[] args) 
  {
      int numeroCasos = 10000;
      ArrayList <Caso> arregloCasos = new ArrayList <> (numeroCasos);
      
      for (int i=0; i<numeroCasos; i++)
      {
         arregloCasos.add(new Caso());
         
         int m = arregloCasos.get(i).getM();
         int n = arregloCasos.get(i).getN();   
         int gcd = arregloCasos.get(i).gcd(m,n);
         
         arregloCasos.get(i).setGCD(gcd);
               
      }
      
      Collections.sort(arregloCasos);
      
      
      //impresion 
      System.out.println("Menor numero de interacciones: "+arregloCasos.get(0).toString());
      System.out.println("Mayor numero de interacciones: "+arregloCasos.get(numeroCasos - 1).toString());
      System.out.println("Media numero de interacciones: "+arregloCasos.get(numeroCasos /2).toString()); 
      System.out.println("Promedio del arreglo de numero de interacciones: " + promedioInteracciones (arregloCasos, numeroCasos));
      System.out.println("Moda del arreglo de numero de interacciones: " + mostFrequent(arregloCasos, numeroCasos));   
      
     
  }
  
   //algoritmo promedio
   public static float promedioInteracciones (ArrayList <Caso> arregloCasos, int numeroCasos)
   {
      int suma = 0;
      for (Caso c: arregloCasos)
      suma += c.getContadorInteracciones();
      
      return suma/numeroCasos;
   }
   
   //algoritmo moda
    public static int mostFrequent(ArrayList <Caso> arregloCasos, int n) 
    { 
        int max_count = 1, res = arregloCasos.get(0).getContadorInteracciones(); 
        int curr_count = 1; 
          
        for (int i = 1; i < n; i++) 
        { 
            if (arregloCasos.get(i).getContadorInteracciones() == arregloCasos.get(i-1).getContadorInteracciones()) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arregloCasos.get(i-1).getContadorInteracciones(); 
                } 
                curr_count = 1; 
            } 
        } 
      
        
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arregloCasos.get(n-1).getContadorInteracciones(); 
        } 
      
        return res; 
    } 
 
}