/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
/**
 *
 * @author Student
 */
public class Palindrome {
    
    
 
    private static StringBuilder sb;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("5135315"));  
    }
    
     public static boolean isPalindrome(String str){
         sb = new StringBuilder();
         return str.equals(sb.append(str).reverse().toString()); 
    }   
}
