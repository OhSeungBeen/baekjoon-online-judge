import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2751 {
  
  static int[] mergeSort(int[] arr) {
    if(arr.length < 2) return arr;
    
    int middle = arr.length / 2;
    int[] arr1 = mergeSort(Arrays.copyOfRange(arr, 0, middle));
    int[] arr2 = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));
    
    int[] mergedArr = new int[arr.length];
    int m = 0, i = 0, j = 0;
    while(i < arr1.length && j < arr2.length) {
      if(arr1[i] < arr2[j])
        mergedArr[m++] = arr1[i++];
      else
        mergedArr[m++] = arr2[j++];
    }
    while(i < arr1.length) {
      mergedArr[m++] = arr1[i++];
    }
    while(j < arr2.length) {
      mergedArr[m++] = arr2[j++];
    }
    
    return mergedArr;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] numbers = new int[n];

    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(br.readLine());
    }
    
    numbers = mergeSort(numbers);
    
    for(int number : numbers) {
      System.out.println(number);
    }
  }
}
