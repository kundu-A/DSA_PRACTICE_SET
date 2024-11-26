import java.util.*;
public class ValidParenthesis_Stack {
    public static boolean isValid(String str){
        char[] chars=str.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (char ele : chars) {
            if(ele=='(' || ele=='{' || ele=='['){
                stack.push(ele);
                continue;
            }
            else if(stack.empty())
                return false;
            
            char top=stack.pop();
            if(top=='(' && ele!=')')
                return false;
            if(top=='{' && ele!='}')
                return false;
            if(top=='[' && ele!=']')
                return false;
        }
        return (stack.empty()==true);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String which contain (),{},[] : ");
        String str=sc.nextLine();
        System.out.println("Is the given String valid? "+isValid(str));
        sc.close();
    }
}
