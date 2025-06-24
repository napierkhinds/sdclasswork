package unit_5;

import javax.swing.JOptionPane;

public class Q8_name_address {
    public static void main (String[] args){

        String choiceAsString;
        int choice;
        String name, address;
        String ageAsString;
        int age;
        String menu = " Welcome to Personal Data Printer \n"
                        + "1. Name + Address + Age \n"
                        + "2. Name + Address \n"
                        + "3. Name + Age \n"
                        + "4. Exit";
        do {
        choiceAsString= JOptionPane.showInputDialog(null, menu);
        choice = Integer.parseInt(choiceAsString);

    switch (choice) {
        case 1:

            name = JOptionPane.showInputDialog(null, "Enter your name");
            address = JOptionPane.showInputDialog(null, "Enter your address");
            ageAsString = JOptionPane.showInputDialog(null, "Enter your age");
            age = Integer.parseInt(ageAsString);

            printDetails(name, address, age);
            break;

        case 2:
            name = JOptionPane.showInputDialog(null, "Enter your name");
            address = JOptionPane.showInputDialog(null, "Enter your address");

            printDetails(name, address);
            break;

        case 3:
            name = JOptionPane.showInputDialog(null, "Enter your name");
            ageAsString = JOptionPane.showInputDialog(null, "Enter your age");
            age = Integer.parseInt(ageAsString);

            printDetails(name, age);

            break;

        case 4:
                //JOptionPane.showMessageDialog(null, "Goobye!");
            break;

        default:
            JOptionPane.showMessageDialog(null, "Invalid choice, please try again");
    }

} while (choice != 4);



    }// end main

    public static void printDetails(String name, String address, int age) {

        JOptionPane.showMessageDialog(null, "Name : " + name + "\nAddress : " + address + "\nAge : " + age);
    }

    public static void printDetails(String name,String address){

        JOptionPane.showMessageDialog(null,"Name : "+name+"\nAddress : "+address);
    }

    public static void printDetails(String name,int age){

        JOptionPane.showMessageDialog(null,"Name : "+name+"\nAge : "+age);
    }

}// end class
