import java.util.Scanner;

public class main {
public static void main(String[] args) {
    Scanner J = new Scanner(System.in);

    System.out.print("Enter Name: ");
    String name = J.nextLine();

    System.out.print("Enter Address: ");
    String address = J.nextLine();

    System.out.print("Enter Age: ");
    Integer age = J.nextInt();

    System.out.println("Name: " + name);
    System.out.println("Address: " + address);
    System.out.println("Age: " + age);

}
}