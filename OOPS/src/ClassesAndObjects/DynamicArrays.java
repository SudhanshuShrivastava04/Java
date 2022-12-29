package ClassesAndObjects;

import java.util.Arrays;

public class DynamicArray {
    // we need constructor
    // 2nd we need add function to add the elements
    // 3rd set and get
    // 4th size function to determine the size of the dynamic array
    // 5th IsEmpty function to check whether the array is empty or not
    // 6th remove last function to remove the last element like stacks

    private int data[];
    private int nextindex =0;

    public DynamicArray(){
        data = new int[5];
        nextindex =0; // --->pointer basically
    }
     public void add(int element){
        if (nextindex == data.length){
            resturcture();
        }
        data[nextindex] = element;
        nextindex++;
     }
     public int size(){
        return nextindex;
     }

     public void set(int index , int data){
        if (index>nextindex){
            return;
        }
        else if (index<nextindex) {
            this.data[index] = data;
        }
        else{
            add(data);
        }
     }

     public int get(int index){
        if (index>=nextindex){
            return -1;
        }
        else
            return data[index];
     }

     public void removeLast(){
        set(nextindex-1,0);
        nextindex--;
    }

    public void print(){
        System.out.println(Arrays.toString(data));
    }

     public void resturcture(){
        int temp[] = data;
        data = new int[data.length*2];
        for (int i = 0 ; i < temp.length ; i++){
            data[i] = temp[i];
        }
     }
}
