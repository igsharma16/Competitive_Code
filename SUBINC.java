import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

public class SUBINC {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            FastReader fc = new FastReader();
            int T = fc.nextInt();
            while(T-- > 0 ){
                int N = fc.nextInt();
                int[] arr = readArray(N , fc);
                long count = 1 ,sum = 0;
                for(int i = 0 ; i < N - 1 ; i++){
                    if(arr[i+1] >= arr[i]){
                        count++;
                    }else{
                        sum += (count *(count - 1)) / 2;
                        count = 1;
                    }
                    sum += (count *(count - 1)) / 2;
                    System.out.println(sum + N);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    private static int[] readArray(int n ,FastReader fc){
        int[] k = new int[n];
        for(int i = 0 ; i < n ; i++){
            k[i] = fc.nextInt();
        }
        return k;
    }
}


class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
        }

    String next(){
        while(st == null || !st.hasMoreElements()){
            try{
                st =  new StringTokenizer(br.readLine());
            } catch(IOException e){
                e.printStackTrace();
            }
           
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }

    Long nextLong(){
        return Long.parseLong(next());
    }

    double nextDouble(){
        return Double.parseDouble(next());
    }

    String nextLine(){
        String str = "";
        try{
            str = br.readLine();
        } catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }
}