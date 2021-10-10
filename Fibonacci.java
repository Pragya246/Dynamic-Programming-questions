import java.util.*;

/**
 * Fibonacci
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> fibo=new HashMap<Integer,Integer>();
        int n=sc.nextInt();
        
        System.out.println(getFibonacciNumberTopDown(n));
    }
    public static HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
  public static Double getFibonacciNumberTopDown(int n) {
    if(hm.containsKey(n)) 
        return hm.get(n);
    if(n == 0) return 0.0;
    if(n == 1) return 1.0;
    double nthValue =(double)getFibonacciNumberTopDown(n - 1) + getFibonacciNumberTopDown(n - 2);
    hm.put(n, nthValue);
    return nthValue;
  }
}