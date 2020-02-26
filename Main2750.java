import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2750 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] numbers = new int[n];
    
    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(br.readLine());
    }
    
    for(int i = 0; i < numbers.length; i++) {
      for(int j = 0; j < numbers.length - 1 - i; j++) {
        if(numbers[j] > numbers[j+1]) {
          int temp = numbers[j+1];
          numbers[j+1] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
    
    for(int number : numbers) {
      System.out.println(number);
    }
  }
}
