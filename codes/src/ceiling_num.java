public class ceiling_num {
    public static int binary(int[] arr , int target){
        int start =0;
        int end = arr.length;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else return mid;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {5,5,5,5,7,8};
        int target =5;
        int ans = binary(arr,target);
        System.out.println(ans);
    }
}
