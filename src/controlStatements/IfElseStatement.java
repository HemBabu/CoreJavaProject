package controlStatements;

public class IfElseStatement {
    public static void main(String[] args) {
        String user="admin";
        String pass="pass";
        System.out.println("before if else statement");
        if (user == "admin" && pass == "pass") {
            System.out.println("Password and user name matched");

        }
        else {
            System.out.println("Either password or user name is invalid");
        }
        System.out.println("Out of the if else if else statement ");
    }
}
