package DSA.StackQuestiona;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);

//        reverse(st);
//
//        System.out.println(st);

        Stack<Integer> st1 = new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        st = st1;
        st1 = null;
        System.out.println(st);
    }

    public static void reverse(Stack st){
        if(st.isEmpty()){
            return;
        }
        int top = (int) st.pop();
        reverse(st);
        pushTheStringAtBottom(String.valueOf(top), st);
    }

    public static void pushTheStringAtBottom(String data, Stack st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        String top = (String) st.pop();
        pushTheStringAtBottom(data, st);
        st.push(top);
    }
}
