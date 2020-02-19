import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3009 {
  static int findOtherNumber(int arr[]) {
    int otherNumber;
    if(arr[0] == arr[1]) {
      otherNumber = arr[2];
    }else if(arr[0] == arr[2]) {
      otherNumber = arr[1];
    }else {
      otherNumber = arr[0];
    }
    return otherNumber;
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] xArray = new int[3];
    int[] yArray = new int[3];
    
    for(int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      xArray[i] = Integer.parseInt(st.nextToken());
      yArray[i] = Integer.parseInt(st.nextToken());
    }
    
    System.out.println(findOtherNumber(xArray) + " " + findOtherNumber(yArray));
  } 
}
