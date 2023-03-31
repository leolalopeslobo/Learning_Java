import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter string A: ");
        String A=sc.next();
		System.out.println("Enter string B: ");
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i=0,n;
        System.out.println(A.length()+B.length());
        if(A.length()<B.length()){
            n=A.length();
        } else {
            n=B.length();
        }
        while(i<n){
            if(i==n-1){
                System.out.println("No");
			break;
            }
            else if((int)(A.charAt(i))==(int)(B.charAt(i))){
                i++;
            }
            else if((int)(A.charAt(i))>(int)(B.charAt(i))){
                System.out.println("Yes");
                break;
            } else {
               System.out.println("No"); 
               break;
            }
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1));
        
    }
}