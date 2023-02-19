// SUMTRIAN problem of codechef (Dynamic Programming)

import java.io.*;
public class Triangle {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        try {
        T = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < T ; i++){
                int N = Integer.parseInt(br.readLine());
                int M[][] = new int[N+1][N+1];
                String data[] = null;
                for(int j = 1 ; j <= N ; j++){
                    data = (br.readLine()).split(" ");
                    for(int k = 1; k < j + 1; k++){
                        M[j][k] = Integer.parseInt(data[k-1]);
                    }
                }
                
                for(int r = N ; r > 0 ;  r--){
                    for(int c = 1 ; c < r; c++){
                        if(M[r][c] > M[r][c+1]){
                            M[r-1][c] += M[r][c];
                        }
                        else
                        M[r-1][c] += M[r][c+1];
                    }
                }

                System.out.println(M[1][1]);
            
            }
            
            }
            
            catch (Exception e) {
                // TODO: handle exception
                e.setStackTrace(null);
        }
    }
}


