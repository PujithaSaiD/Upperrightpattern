import java.util.*;
public class Upperrighttriangle {
    public static void generatepattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i<j){
                    System.out.print("*");
                }
                else{
                    System.out.print(".");  
               }
            }
            System.out.println();
            }
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generatepattern(n);
    }
        
    }
    

    

