import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10250 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < testCase; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int h = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      int number = Integer.parseInt(st.nextToken());
      
      if(number % h == 0) {
        System.out.println((h * 100) + (number / h));
      } else {
        System.out.println(((number % h) * 100) + (number / h + 1));
      }
    }
  }
}
