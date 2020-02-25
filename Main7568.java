import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7568 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] xy = new int[n][2];
    int ranks[] = new int[n];
    
    StringTokenizer st = null;
    for(int i = 0; i < xy.length; i++) {
      ranks[i] = 1;
      st = new StringTokenizer(br.readLine());
      xy[i][0] = Integer.parseInt(st.nextToken());
      xy[i][1] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i < xy.length; i++) {
      for(int j = 0; j < xy.length; j++) {
        if(xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1])
          ranks[i]++;
      }
    }
    
    for(int rank : ranks) {
      System.out.print(rank + " ");
    }
  }
}
