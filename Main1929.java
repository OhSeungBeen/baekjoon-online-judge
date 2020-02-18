import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1929 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    boolean isPrimeNumber = true;
    for(int i = m; i <= n; i++) {

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
        System.out.println(i);
      }
      isPrimeNumber = true;
    }
  }
}
