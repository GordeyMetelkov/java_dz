import java.util.Stack;

public class dz4 {
    public static void main(String[] args) {
        String s = "(){}))";
        Stack <String> res = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (res.empty()) {
                res.push(Character.toString(ch));
            }
            else {
                String check = res.peek();
                if (
                    (check.equals("(") && Character.toString(ch).equals(")")) || 
                    (check.equals("{") && Character.toString(ch).equals("}")) || 
                    (check.equals("[") && Character.toString(ch).equals("]"))
                    ) {
                        res.pop();
                }
                else {
                    res.push(Character.toString(ch));
                }
            }
        }
        if (res.empty()){
            System.out.println("ok");
        }
        else {
            System.out.println("not ok");
        }

    }
    
}
