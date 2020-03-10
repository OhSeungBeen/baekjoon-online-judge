import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1157 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] alphabets = new int[26];
    String input = br.readLine().toUpperCase();

    int max = Integer.MIN_VALUE;
    char result = '?';
    
    for(int i = 0; i < input.length(); i++) {
      alphabets[input.charAt(i) - 65]++;
      
      if(alphabets[input.charAt(i) - 65] == max) {
        result = '?';
      } else if(alphabets[input.charAt(i) - 65] > max) {
        result = input.charAt(i);
        max = alphabets[input.charAt(i) - 65];
      }
    }
    System.out.println(result);
  }
}
