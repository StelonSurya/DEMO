import java.util.Scanner;

public class program62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int a = scanner.nextInt();
        if((a&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
