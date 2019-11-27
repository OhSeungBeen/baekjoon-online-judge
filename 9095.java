import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    
    int d[] = new int[11];
    d[0] = 1;
    for(int i = 1; i <= 10; i++) {
      if(i-1 >= 0) 
        d[i] = d[i] + d[i-1];
      if(i-2 >= 0)
        d[i] = d[i] + d[i-2];
      if(i-3 >= 0)
        d[i] = d[i] + d[i-3];
    }
    
    while(t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      System.out.println(d[n]);
    }
  }
}
