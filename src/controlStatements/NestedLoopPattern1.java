package controlStatements;

public class NestedLoopPattern1 {
    public static void main(String[] args) {
        int n=7;
        int i;
        for(i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}
