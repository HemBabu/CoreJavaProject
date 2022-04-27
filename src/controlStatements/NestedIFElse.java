package controlStatements;

public class NestedIFElse {
    public static void main(String[] args) {
        int id=12;
        int passCode=543;
        int phoneNumber=123;
        if(id==12){
            if(passCode==543){
                if(phoneNumber==123){
                    System.out.println("Your are valid User");
                }
                else {
                    System.out.println("YOu are not valid user your phone number is not match");
                }
            }
            else {
                System.out.println("YOu are not valid user your passcode is not match");
            }

        }
        else {
            System.out.println("YOu are not valid user your id is not match");
        }
    }
}
