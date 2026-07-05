import java.util.Scanner;
public class Colorcode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char code = sc.next().charAt(0);
        switch(code){
            case 'B':
                System.out.println("Blue");
                break;
                 case 'G':
                System.out.println("Green");
                break;
                    case 'R':
                    System.out.println("Red");
                    break;
                       case 'W':
                        System.out.println("White");
                        break;
                        default:
                            System.out.println("Invalid");
        }
        sc.close();
    }
}