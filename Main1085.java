import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1085 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    
    int minDistance = Integer.MAX_VALUE;
    
    if(minDistance > x)
      minDistance = x;
    if(minDistance > y)
      minDistance = y;
    if(minDistance > w - x)
      minDistance = w - x;
    if(minDistance > h - y)
      minDistance = h - y;
    
    System.out.println(minDistance);
  }
}
