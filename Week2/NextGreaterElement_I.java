package Infinity_Champions_Program;

import java.util.*;
public class NextGreaterElement_I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] num1=new int[n];
        int[] num2=new int[m];
        int[] arr=nextGreaterElement(num1,num2);
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            mp.put(nums1[i], i);
        }
        int m = nums2.length;
        int[] arr = new int[m];
        Arrays.fill(arr, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < m; i++) {
            while (!st.isEmpty() && nums2[st.peek()] < nums2[i]) {
                arr[st.pop()] = nums2[i];
            }
            st.push(i);
        }
        int n = nums1.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < nums2.length; i++) {
            if (mp.containsKey(nums2[i])) {
                ans[mp.get(nums2[i])] = arr[i];
            }
        }
        return ans;
    }
}
