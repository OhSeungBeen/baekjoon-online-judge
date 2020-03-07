import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1065 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int result = 0;
    
    if(n < 100) {
      result = n;
    } else {
      result = 99;
      for(int i = 100; i <= n; i++) {
        int n1 = i % 10;
        int n2 = i / 10 % 10;
        int n3 = i / 100 % 10;
        
        if(n3 - n2 == n2 - n1)
          result++;
      }
      if (n == 1000) result--;
    }
    System.out.println(result);
  }
}
