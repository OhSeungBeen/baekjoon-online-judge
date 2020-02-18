import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4948 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      int n = Integer.parseInt(br.readLine());
      if(n == 0) break;
      
      int sum = 0;
      boolean isPrimeNumber = true;
      for(int i = n + 1; i <= 2 * n; i++) {

        if(i == 1)
          continue;

        int sqrt = (int)Math.sqrt(i) + 1;

        for(int j = 2; j < sqrt; j++) {
          if(i % j == 0) {
            isPrimeNumber = false;
            break;
          }
        }

        if(isPrimeNumber) {
          sum++;
        }
        isPrimeNumber = true;
      }
      System.out.println(sum);
    }
  }
}
