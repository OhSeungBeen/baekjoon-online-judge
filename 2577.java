import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
    int cnts[] = new int[10];
    String[] strArray = String.valueOf(n).split("");
    
    for(String str : strArray) {
      cnts[Integer.parseInt(str)]++;
    }
    
    for(int cnt : cnts) {
      System.out.println(cnt);
    }
  }
}
