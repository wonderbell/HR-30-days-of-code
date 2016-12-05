import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
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

class Solution{
    List<Character> stack;
    List<Character> queue;

    Solution(){
        stack = new ArrayList();
        queue = new ArrayList();
    }

    void pushCharacter(char c){
        stack.add(c);
    }

    void enqueueCharacter(char c){
        queue.add(c);
    }

    public char popCharacter() {
        if(stack.size() > 0){
            char c = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return c;
        }

        return ' ';
    }

    public char dequeueCharacter() {
        if(queue.size() > 0){
            char c = stack.get(0);
            stack.remove(0);
            return c;
        }

        return ' ';
    }
}
