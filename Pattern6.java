public class Pattern6 {
    public static void printstar(int n){
        for(int row=1;row<=n;row++){
            for(int space=0;space<(n-row);space++){
                System.out.print(" ");
            }
                for(int col=1;col<=row;col++){
                    System.out.print("*");
                }
                System.out.println();
                
            }
            System.out.println();
            
        }

    
    public static void main(String[] args) {
        printstar(5);
    }
    
}
