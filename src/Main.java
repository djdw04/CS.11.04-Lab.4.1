import java.util.Stack;
public class Main {
    public static Object parenthesesCheck(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static String reverseInteger(int num) {
        String numString = Integer.toString(num);
        String last = "";
        char a;
        a = ' ';
        for (int i = numString.length()-1; i > -1; i--) {
            a = numString.charAt(i);
            last = last + a;
        }
        return last;
    }
    public static String encryptThis(String str){
        int a =0;
        int b=0;
        String sub= "";
        for(int i = 0; i < str.length(); i++){
            a++;
            if(str.charAt(i) == ' '){
                char d = str.charAt(b);
                int e = d;
                sub = sub + e + str.substring(a-2, a-1) + str.substring(b+2, a-2) + str.substring(b+1, b+2) + " ";
                b = a;
            }
        }
        char d = str.charAt(b);
        int e = d;
        if(str.length()-b < 4){
            sub = sub + e + str.substring(b+2, str.length()) + str.substring(b+1, b+2);
        }
        else{
            sub = sub + e + str.substring(str.length()-1, str.length()) + str.substring(b, str.length()-2) + str.substring(b, b+1);
        }
        return sub;
    }

    public static String decipherThis(String str){
        int a =0;
        String l = "";
        int b=0;
        String sub= "";
        for(int i = 0; i < str.length(); i++){
            a++;
            if(str.charAt(i) == ' '){
                if(!Character.isDigit(str.charAt(b+2))){
                    int c = Integer.parseInt(str.substring(b, b+2));
                    char d = (char)c;
                    sub = sub + d + str.substring(a-2, a-1) + str.substring(b+3, a-2) + str.substring(b+2, b+3) + " ";
                }
                if(Character.isDigit(str.charAt(b+2))){
                    int c = Integer.parseInt(str.substring(b, b+3));
                    char d = (char)c;
                    sub = sub + d + str.substring(a-2, a-1) + str.substring(b+4, a-2) + str.substring(b+3, b+4) + " ";
                }
                b = a;
            }
        }
        int e = str.charAt(b+2);
        if(!Character.isDigit(str.charAt(b+2))){
            e = Integer.valueOf(str.substring(b, b+2));
            char c = (char)e;
            sub = sub + c + str.substring(str.length()-1, str.length()) + str.substring(b+2, str.length()-1);
        }
        if(Character.isDigit(str.charAt(b+2))) {
            e = Integer.valueOf(str.substring(b, b+3));
            char c = (char) e;
            sub = sub + c + str.substring(str.length()-1, str.length()) + str.substring(b+3, str.length()-1);
        }
        return sub;
    }
}
// 1. parenthesesCheck


// 2. reverseInteger


// 3. encryptThis


// 4. decipherThis


