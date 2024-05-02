package week4;
import java.util.Scanner;
public class person {
  protected String name;
  protected String address;

  public person() // method
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan nama :");
    name = input.nextLine();
    System.out.println("Masukan Alamat :");
    address = input.nextLine();

  }

  public void displayHobby()
  {
    System.out.println("Hobi : Bermain Musik");
  }
}
