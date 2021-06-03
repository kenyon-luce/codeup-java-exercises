public class Fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i <= 20; i++){
            c = a; //0 ; 1 ; 2 ; 3 ;
            a = a + b; //0 + 1 = 1 ; 1 + 1 = 2 ; 2 + 1 = 3 ; 3 + 2 = 5 ;
            b = c; // 1 --> 1 ; 1 --> 1 ; 1 --> 2 ; 2 --> 5
            //[0] + 1 = [1] + 0 = [1] + 1 = [2] + 1 = [3] + 2 = [5] + 3 = [8] + 5 = [13]
            System.out.println(b);
        }
    }
}
