package beraberderscalismakeyfi;

import java.util.Stack;

public class BeraberDersCalismaKeyfi {
    
    public static void main(String[] args) {
        
        Stack<Character> s = new Stack();
        char x2[] = {'e', 'm', 'o', 'g', 'o'};
        char x2k[] = new char[5];
        
        for (int i = 0; i < x2.length; i++) {
            s.push(x2[i]);
        }
        
        for (int i = 0; i < x2.length; i++) {
            x2k[i] = s.pop();
        }
        
        for (int i = 0; i < x2.length; i++) {
            
            if (x2[i] != x2k[i]) {
                System.out.println("Polindrom değil");
                break;
            }
        }

    }
    
}
