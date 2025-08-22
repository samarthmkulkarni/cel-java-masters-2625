package Functions;

public class CalculatorFunction {

//  a and b are Parameters
    static int addIntegers(int a,int b)
    {
        int sum = a + b ;
        return sum;
    }

    static int subIntegers(int a,int b)
    {
        int sub = a - b;
        return sub;
    }

    static int mulIntegers(int a,int b)
    {
        int mul = a*b;
        return mul;
    }

    static int divIntegers(int a,int b)
    {
        int div = a/b;
        return div;
    }

    static int modIntegrs(int a,int b)
    {
        int rem = a % b;
        return rem;
    }


    public static void main(String[] args) {
        System.out.println("=====ADDITION======");
        int result;
        // 10,20 - arguments

        result = addIntegers(10,20);  // result = 30;

        System.out.println(result);

        // 50,60  - arguments
        result = addIntegers(50,60);
        System.out.println(result);


        // 70,80 - arguments
        result = addIntegers(70,80);
        System.out.println(result);


        System.out.println("=====SUB======");

        int sub;

        // 30,40 - arguments

        sub = subIntegers(30,40);
        System.out.println(sub);

        // 60,50 - arguments

        sub = subIntegers(60,50);
        System.out.println(sub);

        System.out.println("=====MUL======");

        int mul;

        // 10,20
        int num1=10;
        int num2=20;
        mul = mulIntegers(num1,num2);
        System.out.println(mul);

        // 5,2
        mul = mulIntegers(5,2);
        System.out.println(mul);

        System.out.println("=====DIV======");
        // 20,10

        int div;
        div = divIntegers(20,10);
        System.out.println(div);

        System.out.println("=====MOD======");

        // 20,10
        int rem;
        rem = modIntegrs(20,10);
        System.out.println(rem);

    }

}
