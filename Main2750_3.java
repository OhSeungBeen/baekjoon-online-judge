import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2750_3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] numbers = new int[n];

    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(br.readLine());
    }
    
    int minIndex;
    int temp;
    for(int i = 0; i < numbers.length - 1; i++) {
      minIndex = i;
      for(int j = i + 1; j <numbers.length; j++ ) {
        if(numbers[minIndex] > numbers[j]) {
          minIndex = j;
        }
      }
      temp = numbers[i];
      numbers[i] = numbers[minIndex];
      numbers[minIndex] = temp;
    }
    
    for(int number : numbers) {
      System.out.println(number);
    }
  }
}
