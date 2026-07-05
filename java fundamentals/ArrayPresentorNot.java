public class ArrayPresentorNot{
    public static void main(String[] args){
        int[] arr={20,10,30,40,50};
        int search = 76;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == search){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}