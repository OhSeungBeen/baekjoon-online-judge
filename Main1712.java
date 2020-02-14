import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1712 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] inputArray = br.readLine().split(" ");
    int fixedExpenditure = Integer.parseInt(inputArray[0]);
    int variableExpenditure = Integer.parseInt(inputArray[1]);
    int price = Integer.parseInt(inputArray[2]);
    
    if(variableExpenditure >= price) {
      System.out.println(-1);
    }else {
      System.out.println(fixedExpenditure / (price - variableExpenditure) + 1);
    }
  }
}
