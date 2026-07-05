
public class palindrome{
    public static void main(String[] args){
    int num = 110011;
    int temp = num;
    int reverse = 0;
    while(temp != 0){
        int digit = temp % 10;
        reverse = reverse * 10 + digit;
        temp /= 10;
    }
    if(num == reverse)
        System.out.println("Palindrome");
    else
        System.out.println("Not Palindrome");
}
}