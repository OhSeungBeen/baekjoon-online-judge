public class Main {

  public static void main(String[] args) {
    
    boolean isNotSelfNumbers[] = new boolean[10001];
    
    for(int i = 1; i < 10000; i++) {
      int temp = i;
      int n = i;
      while (temp != 0) {
        n += temp % 10;
        temp = temp / 10;
      }
      if(n <= 10000)
        isNotSelfNumbers[n] = true;
    }
    
    for(int i = 1; i < isNotSelfNumbers.length; i++) {
      if(!isNotSelfNumbers[i]) {
        System.out.println(i);
      }
    }
  }
}
