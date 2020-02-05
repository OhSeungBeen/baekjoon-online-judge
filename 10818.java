import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    String[] array = br.readLine().split(" ");
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for(String str : array) {
      int temp = Integer.parseInt(str);
      
      if(temp < min)
        min = temp;
      
      if(temp > max)
        max = temp;
    }
    System.out.println(min + " " + max);
    
  }
}
