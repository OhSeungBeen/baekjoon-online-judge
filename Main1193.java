import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1193 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int line = 0;
    int i = 1;
      
    while(i <= n) {
      i += 1 + line++;
    }
    
    int numerator = n - (i- line) + 1;
    int denominator = line - numerator + 1;
    
    if(sequence % 2 == 0) {
      System.out.println(numerator + "/" + denominator);
    } else {
      System.out.println(denominator + "/" + numerator);
    }
  }
}
