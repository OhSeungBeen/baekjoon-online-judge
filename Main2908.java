import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2908 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputArray = br.readLine().split(" ");
    
    for(int i = 0; i < inputArray.length; i++) {
      inputArray[i] = Character.toString(inputArray[i].charAt(2)) 
          + inputArray[i].charAt(1) 
          + inputArray[i].charAt(0);
    }
    
    System.out.println((inputArray[0].compareTo(inputArray[1]) > 0 ? inputArray[0] : inputArray[1]));
  }
}
