
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산 >> ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String operator = scanner.next();


        if (operator.equals("+")) {
            System.out.println(num1 + "+" + num2 + "의 계산 결과는 " + (num1+num2));
        } else if (operator.equals("-")) {
            System.out.println(num1 + "-" + num2 + "의 계산 결과는 " + (num1-num2));
        } else if (operator.equals("*")) {
            System.out.println(num1 + "x" + num2 + "의 계산 결과는 " + (num1*num2));
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println(num1 + "/" + num2 + "의 계산 결과는 " + (num1/num2));
            }
        }
        scanner.close();
    }
}