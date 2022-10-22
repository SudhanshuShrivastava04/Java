public class smallest_letter {
    public static char smallestnum(char[] arr , char target ){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end - start)/2;
            if (target>arr[mid]){
                start = mid+1;
            }
            else
                end = mid-1;
        }
        return arr[start% arr.length];
    }

    public static void main(String[] args) {
        char[] arr = {'a','e','i', 'q'};
        char target = 'z';
        char ans = smallestnum(arr,target);
        System.out.println(ans);
    }
}