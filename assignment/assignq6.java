package test;



public class assignq6 {
    public static void main(String[] args) {

        
       
        int n = 25;

        int a = 0;
        int b = 1;

        

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}