import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10809 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    
    for(char i = 'a'; i <= 'z'; i++) {
      System.out.print(input.indexOf(i) + " ");
    }
  }
}
