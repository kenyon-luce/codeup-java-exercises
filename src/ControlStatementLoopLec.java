public class ControlStatementLoopLec {
    public static void main(String[] args){
        //Boolean Expressions
        //In Java, an extra '=' is not needed in an expression because value types have to be explicitly stated already
        System.out.println("(5 == 5) = " + (5 == 5));
        System.out.println("(5 < 6) = " + (5 < 6));
        System.out.println("(5 > 6) = " + (5 > 6));

        System.out.println("('y' == 'y') = " + ('y' == 'y'));

        boolean isAdmin = true;
        System.out.println("(isAdmin == false) = " + (isAdmin == true));

        //Logical Operators
        boolean isLoggedIn = false;
        boolean isOwner = false;
        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden administrator portal? " + (isAdmin && isLoggedIn));
        System.out.println("(isOwner || isAdmin) = " + (isOwner || isAdmin) + ". should I let this person the ability to edit their post? " + (isOwner || isAdmin));

        System.out.println("(!isLoggedIn) = " + (!isLoggedIn) + ". Am I not logged in? " + (!isLoggedIn));
        //etc...

        int y = 2;
        int x = 3;
        // a single logical operator ( "|", "&" ) evaluate both expressions in Java

        if(false & (++x == y)){
            System.out.println("x = " + x);
            System.out.println("Equal!");
        } else {
            System.out.println("x = " + x);
            System.out.println("Unequal.");
        }
        String str1 = "Kenyon";
        String str2 = "Kenyon";

        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str1.equal(str)) = " + (str1.equals(str2)));
    }
}
