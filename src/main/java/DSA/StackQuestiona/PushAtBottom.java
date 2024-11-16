package DSA.StackQuestiona;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args){

        Stack<String> st = new Stack<>();
        String bottom_element = "I";

        st.push("am");
        st.push("learnig");
        st.push("Stack");

        pushTheStringAtBottom(bottom_element, st);

        System.out.println(st);
        System.out.println(bottom_element);

//        Stack<String> temp = new Stack<>();
//
//        while(!st.isEmpty()){
//            temp.add(st.peek());
//            st.pop();
//        }
//
//        st.add(bottom_element);
//
//        while(!temp.isEmpty()){
//             st.add(temp.peek());
//             temp.pop();
//        }
//
//        System.out.println(st);

    }

    public static void pushTheStringAtBottom(String data, Stack<String> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        String top = st.pop();
        pushTheStringAtBottom(data, st);
        st.push(top);
    }
}
