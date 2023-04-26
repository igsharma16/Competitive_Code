import java.util.Scanner;
import java.util.ArrayList;

public class Knight{
    public static void main(String[] args){
        
        Position p = new Position();
        p.get();
        p.display();
        
    }
    public static Scanner inp = new Scanner(System.in);
}

class Position{
    int N;
    String q = "KP";
    char Kch = q.charAt(0);
    char Pch = q.charAt(1);
    ArrayList<char[]> store = new ArrayList<char[]>();
    public static Point K;
        
    public Position(){
        N = Knight.inp.nextInt();       
    }
    
    public void get(){
        for(int i = 0 ; i < N ; i++){
        String p = Knight.inp.next();
            char[] z = p.toCharArray();
            for(int k = 0 ; k < p.length(); k++){
                if(z[k] == Kch){
                     K = new Point(k , i);
                     K.display();
                }
                    }
            store.add(z);
        }
    }

    public void display(){
        for(char[] e : store){
            System.out.println(e);
        }
    }
        
}

class Point{

    int x;
    int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void display(){
        System.out.println(x + " " + y);    
    }
    
}

