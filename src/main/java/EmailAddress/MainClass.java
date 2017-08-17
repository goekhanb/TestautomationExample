package EmailAddress;

/**
 * Created by goekh on 23.07.2017.
 */

public class MainClass {

    public static void main(String[] args) {
        Agency agency = new Agency();
        String string =agency.readTextFile();
        System.out.println(string);
        agency.findCustomer("2");


          }
}
