package StringStringBufferStringBuilder;

public class StringBufferStringBuilder {
    /**
     * 1 - String objects are unchangeable object in java, if you change a string, it
     * will create another string object.
     * 2 - the StringBuffer object is mutable in java, it is used to change and
     * modify string objects.
     *     1) the disadvantage is that all public methods for string buffer are synchronized.
     *     so you can use StringBuffer with multiple threads without any problems.
     *     [synchronization: when something is synchronized, then multiple threads can access,
     *     and modify it without any problems or side effect]
     *     2) StringBuffer provides thread safety but at a performance cost.
     *
     * 3 - In most of the scenarios, we don't use string in a multi-thread environment,
     *     so StringBuilder is introduced as similar as StringBuffer except thread safety and synchronization.
     *     1) StringBuilder has better performance than the StringBuffer, otherwise, use StringBuffer for
     *     thread operations.
     *     2) when you need a modifiable string and only one thread is accessing, you can use StringBuilder.
     *     
     */
    public static String m1(String s1){
        s1 = s1 + "lebron";
//        System.out.println(s1);
        return s1;
    }
    public static StringBuilder m2(StringBuilder s2){
        s2.append("lebron");
        return s2;
    }
    public static StringBuffer m3(StringBuffer s3){
        s3.append("lebron");
        return s3;
    }
    public static void main(String[] ags){
        String s1 = "chris";
        m1(s1);
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("chris");
        m2(s2);
        System.out.println(s2);
        StringBuffer s3 = new StringBuffer("chris");
        m3(s3);
        System.out.println(s3);

        /**
         *
         */
        String str = "java";
        System.out.println(str.replace("a","o"));
        System.out.println(str);
    }

}
