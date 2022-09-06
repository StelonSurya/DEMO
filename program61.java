import java.util.Scanner;

public class program61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b ");

        int b = scanner.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("value of a after swaping:" +a);
        System.out.println("value of b after swaping:"+b);


    }
}
