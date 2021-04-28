public class StringsLec {

    public static void main(String[] args){
        String myname = "Kenyon";
        String myname2 = myname;
        String myname3 = myname2;
        String lowercaseken = "kenyon";

        System.out.println("(myname == myname2) = " + (myname.equals(myname2)));
        System.out.println("(myname2 == myname3) = " + (myname2.equals(myname3)));
        System.out.println("(myname == myname3) = " + (myname.equals(myname3)));

        System.out.println("(lowercaseken == myname) = " + (lowercaseken.equals(myname)));
    }
}
