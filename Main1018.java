import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1018 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    char[][] borad = new char[n][m];
    
    for(int i = 0; i < n; i++) {
      String line = br.readLine();
      for(int j = 0; j < m; j++) {
        borad[i][j] = line.charAt(j);
      }
    }
    
    int min = Integer.MAX_VALUE;
    for(int i = 0; i <= n - 8; i++) {
      for(int k = 0; k <= m - 8; k++) {
        int count = 0;
        int count2 = 0;
        for(int j = i; j < i + 8; j++) {
          for(int l = k; l < k + 8; l++) {
            if((j % 2 == 0) && l % 2 == 0) {
              if(borad[j][l] == 'B') count++;
            }
            if((j % 2 == 0) && l % 2 == 1) {
              if(borad[j][l] == 'W') count++;
            }
            if((j % 2 == 1) && l % 2 == 0) {
              if(borad[j][l] == 'W') count++;
            }
            if((j % 2 == 1) && l % 2 == 1) {
              if(borad[j][l] == 'B') count++;
            }
            
            if((j % 2 == 0) && l % 2 == 0) {
              if(borad[j][l] == 'W') count2++;
            }
            if((j % 2 == 0) && l % 2 == 1) {
              if(borad[j][l] == 'B') count2++;
            }
            if((j % 2 == 1) && l % 2 == 0) {
              if(borad[j][l] == 'B') count2++;
            }
            if((j % 2 == 1) && l % 2 == 1) {
              if(borad[j][l] == 'W') count2++;
            }
          }
        }
        if(min > count)
          min = count;
        if(min > count2)
          min = count2;
      }
    }
    System.out.println(min);
  }
}
