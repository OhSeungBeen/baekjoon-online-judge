import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2581 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    boolean isPrimeNumber = true;
    int minPrimeNumber = 0;
    int sum = 0;
    
    for(int i = m; i <= n; i++) {
      if(i == 1)
        continue;

      for(int j = 2; j < i; j++) {
        if(i % j == 0)
          isPrimeNumber = false;
      }
      if(isPrimeNumber) {
        sum += i;
        if(minPrimeNumber == 0)
          minPrimeNumber = i;
      }
      isPrimeNumber = true;
    }

    if(sum == 0) {
      System.out.println(-1);
      return;
    }
    System.out.println(sum);
    System.out.println(minPrimeNumber);
  }
}
