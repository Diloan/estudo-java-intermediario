package estudo.java.detran.loiane62;

import java.io.*;

import java.util.Scanner;
public class PalindromString  
{  
public static void main(String a[]) throws Exception  
{  
       String strn;  
       int flag=0;  
       System.out.println("Enter the string:");  
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
       strn=br.readLine();  
       System.out.println("Result string is:");  
       //write your logic here  

        StringBuilder invertida = new StringBuilder();
        invertida.reverse();



       //end  
       if(strn.equals(invertida))  {
           System.out.print("palindrome");  
       }else{   
           System.out.print("not a palindrome2");  

    }  
}
}
 











