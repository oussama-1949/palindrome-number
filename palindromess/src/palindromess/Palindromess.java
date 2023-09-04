/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromess;

/**
 *
 * @author Hello
 */
public class Palindromess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String original = "coco";
        String reverse = "";
        
        for (int i = original.length() - 1 ; i >= 0 ; i--){
            
            // 3 ; 3 
            
            reverse += original.charAt(i);
            
            // d dc dcb dcba 
            System.out.println(reverse);
        }
        
        boolean palindrome = true ; 
        for (int i = 0 ; i < original.length();i++){
            
            if (original.charAt(i)  != reverse.charAt(i)){
                palindrome = false ; 
            }
            
        }
        
        if (palindrome){
            System.out.println("palindrome ! ");
        }
        else  {
            System.err.println("Not a Palindrome");
        }




    }
    
}
