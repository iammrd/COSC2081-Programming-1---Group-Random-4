package Customer;

import java.io.*;
import java.util.*;

public class CustomerRegister {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String file = input.nextLine();
        PrintWriter pw = new PrintWriter(new FileWriter(file));
        Customer[] cus = new Customer[100];

        int i = 0;

        do {
            cus[i] = new Customer();

            System.out.println("Customer ID: ");
            String cID = input.nextLine();
            cus[i].setCustomerID(cID);

            System.out.println("Enter the full name: ");
            String name = input.nextLine();
            cus[i].setFullName(name);

            System.out.println("Enter the email: ");
            String eml = input.nextLine();
            cus[i].setEmail(eml);

            System.out.println("Enter the address: ");
            String add = input.nextLine();
            cus[i].setAddress(add);

            System.out.println("Enter the phone number: ");
            String pNum = input.nextLine();
            cus[i].setPhoneNum(pNum);

            System.out.println("Enter the membership: ");
            String mem = input.nextLine();
            cus[i].setMembership(mem);

            System.out.println("Enter the username: ");
            String uname = input.nextLine();
            cus[i].setUserName(uname);

            System.out.println("Enter password: ");
            String pass = input.nextLine();
            cus[i].setPassword(pass);

            pw.println(cID + "," + name + "," + eml + "," + add + "," + pNum + "," + mem + "," + uname + "," + pass);

            i += 1;

            System.out.println("Create another account? Yes/No");
        } while (input.nextLine().charAt(0) == 'Y');
        pw.close();

    }

}