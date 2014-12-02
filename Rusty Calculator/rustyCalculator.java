import java.util.Stack;

public class Answer {  
    public static String answer(String str) {
                
        Stack<Character> stack = new Stack<Character>();
        String rpn = "";
        
        for(char c : str.toCharArray()) {
            switch(c) {
            case '+':
                // Better check if there is a higher order operation
                while(!stack.empty() && stack.peek() == '*') {
                    rpn+=stack.pop();
                }
                stack.push(c);
                break;
            case '*':
                stack.push(c);
                break;
            default:
                rpn+=c;
                break;
            }
        }
        
        //All done, let's get our remaining operators
        while(!stack.isEmpty())
            rpn+=stack.pop();
        return rpn;     
    }
}