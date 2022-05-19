import java.util.Scanner;

public class CTExercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the age: ");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("You can't vote");
        } else if (age <= 65) {
            System.out.println("You should vote");
        } else {
            System.out.println("You can vote, if you want to");
        }
    }
}
