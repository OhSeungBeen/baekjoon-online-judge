import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3053 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double r = Double.parseDouble(br.readLine());
    System.out.printf("%7f\n", Math.PI * r * r);
    System.out.printf("%7f", 2 * r * r);
  }
}
