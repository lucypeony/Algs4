import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Palindrome1 {
    // Write your code here.
    Stack<Character> stack=new Stack<Character>();
    Queue<Character> queue=new LinkedList<Character>();
    
    public void pushCharacter(char ch){
        stack.push(ch);
    }//pushCharacter
    
    public void enqueueCharacter(char ch){
        queue.add(ch);
    }//enqueueCharacter
    
    public char popCharacter(){
        if(!stack.empty())
            return stack.pop();
        else
            return ' ';
    }//pop
    
    public char dequeueCharacter(){
        return queue.remove();
    }//dequeue
    
    
    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Palindrome1 p = new Palindrome1();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            //System.out.println(p.popCharacter()+"   "+p.dequeueCharacter());
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}