import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int max = Integer.MIN_VALUE;
    int order = 0;
    
    for(int i = 0; i < 9; i++) {
      int temp = Integer.parseInt(br.readLine());

      if(temp > max) {
        max = temp;
        order = i + 1; 
      }
    }
    System.out.println(max);
    System.out.println(order);
  }
}
