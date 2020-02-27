import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2751_2 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    ArrayList<Integer> numbers = new ArrayList<>();

    for(int i = 0; i < n; i++) {
      numbers.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(numbers);
    
    for(int number : numbers) {
      System.out.println(number);
    }
  }
}
