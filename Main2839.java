import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int bigPackage = 0;
    int smallPackage = 0;

    if(n % 5 == 0) {
      System.out.println(n / 5);
    }else {
      while(n > 0) {
        n -= 3;
        smallPackage++;
        if(n % 5 == 0) {
          bigPackage = n / 5;
          n = 0;
          break;
        }
      }
      System.out.println((n == 0) ? bigPackage + smallPackage : -1);
    }
  }
}
