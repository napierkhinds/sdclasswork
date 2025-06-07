package unit_2;

public class ternary {
    public static void main(String[] args) {

        int mark = 67;
       int passMark = 50;
        String result;

       /* if(mark >= passMark){
           result = "Pass";
        }
        else{
            result = "Fail";
        }
        */

        result = (mark >= passMark) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
