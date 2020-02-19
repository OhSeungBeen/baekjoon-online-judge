import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4153 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      if(a == 0) break;
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      
      if(a * a + b * b == c * c
          || c * c + b * b == a * a
          || c * c + a * a == b * b){
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}
