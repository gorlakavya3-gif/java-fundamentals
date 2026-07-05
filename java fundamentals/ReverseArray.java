public class ReverseArray{
    public static void main(String[] args){
        if(args.length != 4){
            System.out.println("Enter the 4 numbers.");
            return;
        }
        int[][] arr = {
            {Integer.parseInt(args[0]),
            Integer.parseInt(args[1])},
            {Integer.parseInt(args[2]),
            Integer.parseInt(args[3])}};
            System.out.println("Given array");
            System.out.println(arr[0][0]+" "+arr[0][1]);
            System.out.println(arr[1][0]+"  "+arr[1][1]);
            System.out.println("Reverse Array");
            System.out.println(arr[1][1]+" "+arr[1][0]);
            System.out.println(arr[0][1]+ " "+arr[0][0]);
        }
    }