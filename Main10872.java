import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10872 {
  
  static int getFactorial(int n) {
    if(n == 1) 
      return n;
    return n * getFactorial(--n);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.println(n == 0 ? 1 : getFactorial(n));
  }
}
