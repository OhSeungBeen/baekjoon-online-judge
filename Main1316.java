import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1316 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    int result = testCase;

    for(int i = 0; i < testCase; i++) {
      String input = br.readLine();
      boolean[] alphabets = new boolean[26];
      
      alphabets[input.charAt(0) - 97] = true;
      for(int j =1; j < input.length(); j++) {
        if(input.charAt(j) != input.charAt(j-1)) {
          if(alphabets[input.charAt(j) - 97]) {
            result--;
            break;
          }
          alphabets[input.charAt(j) - 97] = true;
        }
      }
    }
    System.out.println(result);
  }
}
