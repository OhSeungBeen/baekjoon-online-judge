import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1002 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < testCase; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int r1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int r2 = Integer.parseInt(st.nextToken());

      double rDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));

      if(x1 == x2 && y1 == y2 && r1 == r2) {
        System.out.println(-1);
      } else if(rDistance > r1 + r2 || (x1 == x2 && y1 == y2 && r1 != r2) || rDistance < Math.abs(r2 - r1)) {
        System.out.println(0);
      } else if(rDistance == r1 + r2 || rDistance == Math.abs(r2 - r1)) {
        System.out.println(1);
      } else {
        System.out.println(2);
      }
    }
  }
}
