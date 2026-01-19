package Infinity_Champions_Program;

public class Stack_Implementation_Array {
    private int[] arr;
    private int idx=-1;
    public Stack_Implementation_Array(){
        arr=new int[5];
    }
    public Stack_Implementation_Array(int n){
        arr=new int[n];
    }
    public int size(){
        return idx+1;
    }
    public void push(int val){
        if(isfull()){
            System.out.println("occur overflow");
            return;
        }
        idx++;
        arr[idx]=val;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=arr[idx];
        idx--;
        return val;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int val=arr[idx];
        return val;
    }
    public boolean isfull(){
        return idx==arr.length-1;
    }
    public boolean isEmpty(){
        return idx==-1;
    }
}
