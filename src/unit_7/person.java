package unit_7;
import javax.swing.JOptionPane;

public class person {
    private String name;
    private String address;
    private int age;

    public person () {

        name = "Kirt";
        address = "Date";
    }

    public String toString () {
       String output;
       output = "My name is "+this.name+" and I live at "+this.address+" and i am "+this.age+ " years old";

        return output;
    }
    public void printDetails() {

       String output;
       output = toString();

       JOptionPane.showMessageDialog(null, output,"Person Details",JOptionPane.INFORMATION_MESSAGE);
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}



