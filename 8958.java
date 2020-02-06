import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < n; i++) {
      int point = 1;
      int total = 0;
      String str = br.readLine();
      
      for(int j = 0; j < str.length(); j++) {
        if(str.charAt(j) == 'O') {
          total += point++;
          continue;
        } 
        point = 1;
      }
      System.out.println(total);
    }
  }
}
