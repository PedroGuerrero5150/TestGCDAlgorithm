import java.util.Random;

public class Caso implements Comparable<Caso>{
  
  private int m;
  private int n;
  private int gcd;
  private int contadorInteracciones;
  
  //contructor
  Caso ()
  {
    m = genRandomNumber ();
    n = genRandomNumber ();
    gcd = 0;
    contadorInteracciones = 0;
  }
  
  //setters y getters
  public void setM (int m)
  {
   this.m = m;
  }
  
  public void setN (int n)
  {
   this.n = n;
  }
  
  public void setGCD (int gcd)
  {
   this.gcd = gcd;
  }
  
  public void setContadorInteracciones (int interacciones)
  {
   this.contadorInteracciones = interacciones;
  }

 
  public int getM ()
  {
   return m;
  }
  
  public int getN ()
  {
   return n;
  }
  
  public int getGCD ()
  {
   return gcd;
  }
  
  public int getContadorInteracciones ()
  {
   return contadorInteracciones;
  }

  //funciones varias
  
  public int genRandomNumber ()
  {
      Random rand = new Random();
      int upperbound = 100000000;
      int int_random = rand.nextInt(upperbound);
      
      return int_random;
  }
  
  @Override
  public String toString()
  {
   return "GCD: " + gcd + "; m: " + m +"; n: " + n +"; Interacciones: " + contadorInteracciones;
  }
  
  public int gcd (int m, int n)
  {
        int r = m % n;
        contadorInteracciones++;
        //System.out.println(1+" "+contadorInteracciones);

        
        while(r != 0)
        {
           m = n;
      	  n = r;
           r = m % n;
           contadorInteracciones++;
           //System.out.println(2+" "+contadorInteracciones);
        }
        

     return n;
   } 

  
  //compareCasos
  
  public int compareTo(Caso compareCaso)
  {
     int compareInteracciones = compareCaso.getContadorInteracciones();
     return this.contadorInteracciones - compareInteracciones;//ascending order
  }
  
 
}