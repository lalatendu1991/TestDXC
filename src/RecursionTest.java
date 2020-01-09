public class RecursionTest extends StringTest{
    public static int recursion(int n){
        if(n==1)
            return 1;
        recursion(n-1);
        return 2;
    }
    RecursionTest(){
        System.out.println(i);
    }
    protected void fun1(){}

    void go()
    {
        type = "b ";
        System.out.print(this.type + super.type);
    }
    public void foo() {}
    public static void main(String args[]){
        recursion(5);
        String str="kjdkad adkhad   adkhad";
        String[] split = str.split("\\s");
        System.out.println("\\s".length());

        RecursionTest r=new RecursionTest();
        r.go();
    }
}
