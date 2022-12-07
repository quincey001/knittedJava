package StringStringBufferStringBuilder;

public class StringFormatOutput {
    public static void main(String[] args){
        /**
         * using %s as the printf specifier in the text string to format every text include upper-case and lower-case text
         * using %S to format upper-case text
         * using %n to specify where to include a line break.
         * put a negative number after % to left-justify the text
         *
         */
        String s1 = "java";
        String s2 = "100";
        System.out.printf("%s%n", s1);//java
        System.out.printf("%-1s %n", s1);//
        System.out.printf("| %-8s | %-6s | %4s |%n", "Floating", "double",  "0064");//| Floating | double | 0064 |

        /**
         * %-s alight the text to the left, with string casing preserved.
         * %20s allocate 20 spaces to display the right-aligned text
         * %-10S allocate 20 spaces to display the left-aligned text and use upper-case
         */
        System.out.printf("| %-5s | %-4s | %8s |%n", "Ccccc", "nnnn", "bbbb");//| Ccccc | nnnn |     bbbb |
        // if %-4s number, string is aaaa, list the text from left side of the allocated space. |a|a|a|a|
        // if %5s number, string is aaaa, align the text from right side of the allocated space. ||a|a|a|a|


        /**
         * use %D to format the digit
         * add an optional + flag to cause positive numbers to display a positive sign.
         * use 0 flag to zero-pad the number to fill up the space specified by the width.
         */
        int  above = -98765;
        long below =  54321L;
        System.out.printf("%,d :: %+d", above, below);//-98,765 :: +54321

    }
}
