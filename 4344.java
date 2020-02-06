import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int testCase = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < testCase; i++) {
      String[] strArray = br.readLine().split(" ");
      double n = Integer.parseInt(strArray[0]);
      
      double sum = 0;
      double count = 0;
      
      for(int j =1; j < n + 1; j++) {
        sum += Integer.parseInt(strArray[j]);
      }
      for(int j =1; j < n + 1; j++) {
        if(Integer.parseInt(strArray[j]) > sum /n) {
          count++;
        }
      }
      System.out.printf("%.3f%s\n", count / n * 100,"%");
    }
  }
}
