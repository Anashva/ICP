package ICP;

import java.util.*;
public class Basic_Calculator_II {
    public int calculate(String s) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        char operator='+';
        int number=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                number=(number*10)+(ch-'0');
            }
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i==s.length()-1){
                if(operator=='-'){
                    st.push(-number);
                }
                else if(operator=='+'){
                    st.push(+number);
                }
                else if(operator=='*'){
                    st.push(st.pop()*number);
                }
                else if (operator=='/'){
                    st.push(st.pop()/number);
                }
                operator=ch;
                number=0;
            }
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
