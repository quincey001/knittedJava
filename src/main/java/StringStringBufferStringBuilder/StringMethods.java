package StringStringBufferStringBuilder;

public class StringMethods {
    public String convertCharArray(char[] arr){
        String str = new String(arr);
        return str;
    }
    public String[] stringArray(String[] source){
        String[] target = {"ffefef","afefefef","fefafefw"};
        System.out.println("https://www.quora.com/How-can-I-fake-it-until-I-make-it-for-a-software-development-job");
        return source = new String[]{"edd", "fafe", "fefe"};
    }
    public static void main(String[] args){
        String a1 = "name";
        String a2 = "name";
        System.out.println(a1 == a2);// the a1 and a2 objects have the same address in the string constant pool
        String a3 = new String("name");
        System.out.println(a1 == a3);// false


        StringMethods sm = new StringMethods();
        System.out.println(sm instanceof StringMethods);// return true

        if(true){
            System.out.println("about");
        }
        // package java.long -> class number -> short/byte/long/double/float/integer
        // a class has always a constructor (possibly automatically supplied by the java compiler)
        // integer is the name of a class available in the package java.long

        // variables are declared as private so no other class can access it, this is
        // how data hiding is done in java using concept of encapsulation.
        //
        // java long is the package that is imported into every java class by default
        int sizeof = 1;
//        System.out.println(sizeof--);
        System.out.println(--sizeof);
//        System.out.println(--sizeof--); error
    }

}
