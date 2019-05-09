import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
input(11);
    }



    public static void input(int j){
int i = 1;
Scanner scanner = new Scanner(System.in);
int sum = 0;
        while (i < j){


            System.out.println("Enter number#" + i + ":");

            boolean hasNextInt = scanner.hasNextInt();

        if  (hasNextInt) {
            int number = scanner.nextInt();
sum+=number;
//                System.out.println(number);
            }
            else {

                System.out.println("Invalid Number");

            }
            scanner.nextLine();
            i++;
        }
scanner.close();
        System.out.println(sum);

    }
}







