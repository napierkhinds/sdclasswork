package unit_2;

public class ternary {
    public static void main(String[] args) {

        int mark = 67;
       int passmark = 50;
        String result;

        if(mark >= passmark){
           result = "Pass";
        }
        else{
            result = "Fail";
        }
        System.out.println(result);
    }
}
