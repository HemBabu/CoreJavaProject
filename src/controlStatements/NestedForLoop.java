package controlStatements;

public class NestedForLoop {
    public static void main(String[] args) {
        int i,n=10;
        for(i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
}
