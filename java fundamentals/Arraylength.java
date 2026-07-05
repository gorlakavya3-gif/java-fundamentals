public class Arraylength{
    public static void main(String[] args){
        int[] a = {7,7,7};
        int[] b = {3,8,0};
        int[] result = new int[2];
        result[0] = a[2];
        result[1] = b[2];
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        }
}