
public class Months{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Enter the month in number.");
            return;
        }
        int month = Integer.parseInt(args[0]);
        switch(month){
            case 1:
                System.out.println("January");
                break;
                case 2:
                    System.out.println("Feburary");
                    break;
                    case 3:
                        System.out.println("March");
                        break;
                        case 4:
                            System.out.println("April");
                            break;
                            case 5:
                                System.out.println("May");
                                break;
                                case 6:
                                    System.out.println("June");
                                    break;
                                    case 7:
                                        System.out.println("July");
                                        break;
                                        case 8:
                                            System.out.println("Augest");
                                            break;
                                            case 9:
                                                System.out.println("Sep");
                                                break;
                                                case 10:
                                                    System.out.println("oct");
                                                    break;
                                                     case 11:
                                                        System.out.println("Nov");
                                                        break;
                                                        case 12:
                                                            System.out.println("Dec");
                                                            break;
                                                            default:
                                                                System.out.println("Invaild");
        }
    }
}