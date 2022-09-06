import java.util.ArrayList;
import java.util.Scanner;

public class program63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of  element of  an array :");
        int num = scanner.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        System.out.println("Enter the element of array");
        for (int i = 0; i < num; i++) {
            a.add (scanner.nextInt());
        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if((a.get(i)^a.get(j))==0){
                    a.remove(j);
                }

                }

            }
        System.out.println(a);
        }
    }

