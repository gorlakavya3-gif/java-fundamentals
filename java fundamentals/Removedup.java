public class Removedup{
    public static void main(String[] args){
        int[] arr = {12,40,27,38,74,27};
        System.out.println("Array after removing:");
        for(int i = 0; i<arr.length;i++){
           boolean duplicate = false;
            for(int j = 0; j<i;j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                System.out.print(arr[i]+" ");
    
            }
        }
    }
}