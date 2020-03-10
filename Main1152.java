import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1152 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine().trim();
    if(input.isEmpty()) {
      System.out.print(0);
      return;
    }
    System.out.print(input.split(" ").length);
  }
}
