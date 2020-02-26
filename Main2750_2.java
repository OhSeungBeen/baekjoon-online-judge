import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2750_2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] numbers = new int[n];

    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(br.readLine());
    }

    int temp = 0;
    int j = 0;
    for(int i = 1; i < numbers.length; i++) {
      temp = numbers[i];
      for(j = i - 1; j >= 0 && temp < numbers[j]; j--) {
        numbers[j + 1] = numbers[j];
      }
      numbers[j+1] = temp;
    }
    for(int number : numbers) {
      System.out.println(number);
    }
  }
}
