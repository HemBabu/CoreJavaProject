package controlStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        char operator='+';
switch (operator){
    case '+': {
        System.out.println("addition selected");
        break;
    }case '-': {
        System.out.println("substraction selected");
        break;
    }case '*': {
        System.out.println("multiplication selected");
        break;
    }case '/': {
        System.out.println("division selected");
        break;
    }
    default:{
        System.out.println("Invalid Options");
        break;
    }
}
    }
}
