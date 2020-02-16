import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < testCase; i++) {
      int floor = Integer.parseInt(br.readLine());
      int number = Integer.parseInt(br.readLine());
      int apt[][] = new int[floor + 1][number];
      
      for(int j = 0; j < number; j++) {
        apt[0][j] = j + 1;
      }
      
      for(int k = 1; k < apt.length; k++) {
        for(int l = 0; l < number; l++) {
          for(int f = 0; f <= l; f++) {
            apt[k][l] += apt[k-1][f];
          }
        }
      }
      System.out.println(apt[floor][number - 1]);
    }
  }
}
