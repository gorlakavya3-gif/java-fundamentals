public class BigNumber{
    public static void main(String[] args){
        if(args.length != 9){
            System.out.println("Enter the nine integer numbers.");
            return;
        }
        int[] arr = new int[9];
        int max =  Integer.parseInt(args[0]);
        for(int i = 0;i<arr.length;i++){
            arr[i] = Integer.parseInt(args[i]);
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Given array.");
        for(int i = 0;i<9;i++){
            System.out.print(arr[i]+" ");
            if((i+1) % 3 == 0){
                System.out.println();
            }
        }
        System.out.println(max);
    }
}