public class Fibonacci {
    public static void main(String[] args){
        long a = 0;
        long b = 1;
        long c;
        for (long i = 0; i <= 50; i++){
            c = a; //0 ; 1 ; 2 ; 3 ;
            a = a + b; //0 + 1 = 1 ; 1 + 1 = 2 ; 2 + 1 = 3 ; 3 + 2 = 5 ;
            b = c; // 1 --> 1 ; 1 --> 1 ; 1 --> 2 ; 2 --> 5
            //[0] + 1 = [1] + 0 = [1] + 1 = [2] + 1 = [3] + 2 = [5] + 3 = [8] + 5 = [13]
            System.out.println(b);
        }
    }
}
