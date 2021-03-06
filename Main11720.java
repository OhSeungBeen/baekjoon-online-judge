import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11720 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    int result = 0;
    String line = br.readLine();
    for(int i = 0; i < n; i++) {
      result += line.charAt(i) - '0';
    }
    System.out.println(result);
  }
}
