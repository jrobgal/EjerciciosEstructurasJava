import java.util.Scanner;
public class AppCaracteresIguales {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char car1, car2;
        System.out.print("Introduzca primer carácter: ");
        car1 = (char) System.in.read(); // lee un carácter
        System.in.read(); // saltar el intro que ha quedado en el buffer
        System.in.read();
        System.out.print("Introduzca segundo carácter: ");
        car2 = (char) System.in.read(); // lee el segundo carácter
                if (car1 == car2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
    }
}
