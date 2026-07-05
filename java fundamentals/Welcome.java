
public class Welcome {
    public static void main(String[] args){
       if(args.length == 1){
        System.out.println("Please pass one command line arugment");
        return;
       } 
       System.out.println("Welcome"+args[0]);
    }
}