import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1978 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int notPrimeNumber = 0;
    
    for(int i = 0; i < n; i++) {
      int number = Integer.parseInt(st.nextToken());
      if(number == 1) {
        notPrimeNumber++;
        continue;
      }
      for(int j = 2; j < number; j++) {
        if(number % j == 0) {
          notPrimeNumber++;
          break;
        }
      }
    }
    System.out.println(n - notPrimeNumber);
  }
}
