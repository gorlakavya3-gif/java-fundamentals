public class LargeandSmall{
    public static void main(String[] args){
        int[] arr = {10,5,2,40,80,39};
        int large1 = Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>large1){
                large2 = large1;
                large1 = arr[i];
            } else if(arr[i]>large2){
                large2 = arr[i];
            }
            if(arr[i]<small1){
                small2 = small1;
                small1 = arr[i];
            }else if(arr[i]<small2){
                small2 = arr[i];
            }
        }
            System.out.println(large1);
            System.out.println(large2);
            System.out.println(small1);
            System.out.println(small2);
    }
}