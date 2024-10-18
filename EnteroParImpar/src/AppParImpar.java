import java.util.Scanner;

public class AppParImpar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
