import java.util.Scanner;

public class main {
public static void main(String[] args) {
    Scanner J = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = J.nextLine();

    System.out.print("Enter address: ");
    String address = J.nextLine();

    System.out.print("Enter age: ");
    Integer age = J.nextInt();

    System.out.println(name);
    System.out.println(address);
    System.out.println(age);

}
}