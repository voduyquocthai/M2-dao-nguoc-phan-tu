import java.util.ArrayList;

import java.util.Arrays;
import java.util.Stack;

public class MyStackTest {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));

        String string = "Hello World";

        Stack<String> stack1 = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            stack1.push(String.valueOf(string.charAt(i)));
        }
        int x = string.length();
        string = "";
        for (int i = 0; i < x; i++) {
            string += stack1.pop();
        }
        System.out.println(string);
    }
}
