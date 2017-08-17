package EmailAddress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


/**
 * Created by goekh on 25.07.2017.
 */
public class Agency {

       private Vector<CustomerEmailAddress> customerEmailAddresses  = new Vector<CustomerEmailAddress>();

    public String readTextFile(){

        String text="";
        String textfile = "C:\\Users\\goekh\\Desktop\\TestAutomation\\src\\main\\resources\\Customers.txt";
        Scanner scanner = new Scanner(textfile);
        FileReader fr;
        BufferedReader br;


        try {
            fr = new FileReader(textfile);
            br = new BufferedReader(fr);

            // Textzeilen der Datei einlesen
            String zeile="";

            zeile = br.readLine();

            while (zeile != null ) {
                text = zeile + "\n"; // schreiben in den String text aus der Textdatei
                //Bei += wird der alte wert nicht gelöscht, mit = wird der alte wert einfach üebrschrieben
                zeile = br.readLine();

                /****** hier müssen ID,NAME und EMAIL noch sinngemäß in die ArrayList eingespeichert werden! ****/
                String[]parts = text.split(",");

                String id=parts[0];
                String name=parts[1];
                String email=parts[2];

                //zur Sicherheit eine Ausgabe
                System.out.println(id);

                this.addCustomers(new CustomerEmailAddress(id,name,email));

                                      }
            fr.close();
        }
        catch (IOException e){
            System.out.println("Fehler beim Lesen der Datei !");
            System.out.println(e.toString());
        }
        return text;
    }


    public void addCustomers(CustomerEmailAddress customerEmailAddress){
        this.customerEmailAddresses.addElement(customerEmailAddress);
    }

    public CustomerEmailAddress findCustomer(String id){
        for(int i = 0;i<this.customerEmailAddresses.size();i++){
            if(this.customerEmailAddresses.get(i).getId().equals(id)) {
                System.out.println("customer found: "
                        + "Name : " + this.customerEmailAddresses.get(i).getName()
                        + " Email : "+this.customerEmailAddresses.get(i).getEmail());
                return this.customerEmailAddresses.get(i);
            }
        }
        System.out.println("no customer found!");
        return null;
    }



}
