package ICP;

import java.util.*;
public class Next_Greater_Element_II {
    public int[] nextGreaterElements(int[] nums) {
        return next(nums);
    }
    public static int[] next(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<2*arr.length;i++){
            while(!st.isEmpty() && arr[i%arr.length]>arr[st.peek()]){
                ans[st.pop()]=arr[i%arr.length];
            }
            if(i<arr.length){
                st.push(i);
            }
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}
