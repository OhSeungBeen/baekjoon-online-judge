import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    for(int i = 0; i < testCase; i++) {
      String[] strArray = br.readLine().split(" ");
      int r = Integer.parseInt(strArray[0]);
      for(int j = 0; j < strArray[1].length(); j++) {
        for(int k = 0; k < r; k++) {
          System.out.print(strArray[1].charAt(j));
        }
      }
      System.out.println();
    }
  }
}
