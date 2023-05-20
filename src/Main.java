public class Main {
    // modificator de acces
    public static int multiplyTwoNumbers(int numberOne, int numberTwo,int numberThree) {
        //semnatura metodei
        int sum = numberOne + numberTwo;
        return sum;
    }

    public static int multiplyTwoNumbers(int numberOne, int numberTwo, int numberThree, int numberFour) {
        int sum = numberOne + numberTwo + numberThree + numberFour;
        return sum;


    }

    public static void main(String[] args) {
        //apelarea
        int sum = multiplyTwoNumbers(3, 5,5,7);
        int sum2 = multiplyTwoNumbers(6, 9,9,7);
        int sum3 = multiplyTwoNumbers(10, 72,6,6);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println(multiplyTwoNumbers(10,20,30));

    }
}