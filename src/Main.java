public class Main {
    public static void main(String[] args) {

        factorial(10);
    }

    public static int factorial(int a) {
           if (a == 1){
                 return 1;
             }
        int result = a * factorial(a-1);
        System.out.println(result);
           return result;
    }

}