public class Fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < 100; i++){
            c = a;
            a = a + b;
            b = c;
            //[0] + 1 = [1] + 0 = [1] + 1 = [2] + 1 = [3] + 2 = [5] + 3 = [8] + 5 = [13]
            // a + b = c + a =
            System.out.println(b);
        }
    }
}
