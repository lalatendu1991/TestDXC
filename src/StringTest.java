public class StringTest {
    public void foo() {}
    protected void fun1(){}
    int i=10;
    public String type = "a ";
    public static void main(String args[]){
        String str="abc";
        String str1="abc";

        String s1 = "abc";
        String s2 = s1;
        s1 =s1+ "d";
        System.out.println("s1:"+s1);

        String str2=str1;
        System.out.println(str2.equals(str1));
        System.out.println(str2==str);

        short s = 0;

       int x = 07;
        //int z = 08;
        int z = 112345;
        s += z;
        System.out.println("s:"+s);
    }
}
