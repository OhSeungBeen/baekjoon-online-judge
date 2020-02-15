import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2292 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    if(n == 1) {
      System.out.println(1);
      return;
    }
    
    int result = 1;
    int i = 2;
      
    while(i <= n) {
      i += 6 * result++;
    }
    System.out.println(result);
  }
}
