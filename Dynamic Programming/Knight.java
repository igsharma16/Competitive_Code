import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.ParserCallback;

import java.util.ArrayList;

public class Knight{
    public static void main(String[] args){
        
        Position p = new Position();
        p.get();
        p.display();

        Move m = new Move(Point.K.getX() , Point.K.getY() , p.getN());
        m.max();
        m.display();
        
    }
    public static Scanner inp = new Scanner(System.in);
}

class Position{
    int N;
    static String q = "KP";
    static char Kch = q.charAt(0);
    static char Pch = q.charAt(1);
    public static ArrayList<char[]> store = new ArrayList<char[]>();
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

    public int getN(){
        return N;
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

class Move{
    
ArrayList<Integer> a = new ArrayList<Integer>();


public Move(int x , int y , int N){
    
    state(x + 1 , y + 2 , N);
    state(x + 2 , y + 1 , N);
    state(x + 1 , y - 2 , N);
    state(x + 2 , y - 1 , N);  
}



int total = 0;
    public void state(int x , int y , int N){

            if(x >= N || y >= N){
                a.add(total);
                total--;
                return;
        }
            
        if(Position.store.get(y)[x] == Position.Pch){
            total++;
        }
        
                      
        state(x + 1 , y + 2 , N);
        state(x + 2 , y + 1 , N);
        state(x + 1 , y - 2 , N);
        state(x + 2 , y - 1 , N);     
        
        
    }

    int max = 0;
    void display(){
        System.out.println(max);
    }

    
    void max(){
        for(Integer b : a){
            if(b > max){
                max = b;
            }
        }
    }
}

