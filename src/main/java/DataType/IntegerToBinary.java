package DataType;

public class IntegerToBinary {
    /**
     * 1 - base 10 integer convert to hex(16进制数)
     * Integer.toHexString(int i);
     * 2 - base 10 integer convert to octal(8进制数)
     * Integer.toOctalString(int i);
     *
     * 3- base 10 integer convert to binary
     * Integer.toBinaryString(int i);
     */
    public static void main(String[] args){
        int in = 16;
        String inhex = Integer.toHexString(in);
        String inoctal = Integer.toOctalString(in);
        String inBinary = Integer.toBinaryString(in);
        System.out.println(inhex + " "+ inoctal +" " + inBinary);//13 23 10011

        /**
         * 1 - octal convert to base 10
         * Integer.valueOf("FFF", 16).toString();
         * 2 - binary convert to base 10
         * Integer.valueOf("010001", 2).toString();
         */
        System.out.println(Integer.valueOf("FFFF", 16).toString());
        System.out.println(Integer.valueOf("011111", 8).toString());
    }
}
