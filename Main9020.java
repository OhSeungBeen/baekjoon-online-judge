import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  
  static boolean isPrime(int n) {
    if(n == 1)
      return false;
    
    int nSqrt = (int)Math.sqrt(n);
    for(int i = 2; i <= nSqrt; i++) {
      if(n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    
    int MinPrimeNumber = Integer.MAX_VALUE;
    int PrimeNumber = 0, PrimeNumber2 = 0;
    for(int i = 0; i < testCase; i++) {
      int n = Integer.parseInt(br.readLine());
      for(int j = 2; j <= n / 2; j++) {
        if(isPrime(j)) {
          if(isPrime(n - j)) {
            if(n - j - j < MinPrimeNumber) {
              PrimeNumber = j;
              PrimeNumber2 = n - j;
            }
          }
        }
      }
      System.out.println(PrimeNumber + " " + PrimeNumber2);
    }
  }
}
