public class ControlFlowExercises {
    public static void main(String[] args){
//        ****************EXERCISE 1*****************

//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            //don't concatenate single quotes
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while(i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while(i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while(i < 1000000);

//        for(long i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

        for(long i = 2; i < 1000000; i *= i){
            System.out.println(i);
        }
    }
}
