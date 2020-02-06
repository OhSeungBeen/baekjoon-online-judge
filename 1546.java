import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    float max = Integer.MIN_VALUE;
    float sum = 0;
    
    String[] strArray = br.readLine().split(" ");
    for(String str : strArray) {
      int temp = Integer.parseInt(str);
      if(max < temp) {
        max = temp;
      }
    }
    for(int i = 0; i < strArray.length; i++) {
      float temp = Integer.parseInt(strArray[i]);
      sum += temp / max * 100;
    }
    System.out.println(sum / n);
  }
}
