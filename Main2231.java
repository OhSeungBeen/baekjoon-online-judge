import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2231 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int size = String.valueOf(n).length();
    int constructor = 0;
    
    for(int i = n - (9 * size); i < n; i++) {
      int sum = i;
      int temp = i;
      
      while(temp > 0) {
        sum += temp % 10;
        temp /= 10;
      }
      
      if(sum == n) {
        constructor = i;
        break;
      }
    }
    System.out.println(constructor);
  }
}
