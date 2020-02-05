import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    boolean[] chk = new boolean[42];
    int cnt = 0;
    
    for(int i = 0; i < 10; i++) {
      int remainder = Integer.parseInt(br.readLine()) % 42;
      
      if(!chk[remainder]) {
        cnt++;
        chk[remainder] = true;
      }
    }
    System.out.println(cnt);
  }
}
