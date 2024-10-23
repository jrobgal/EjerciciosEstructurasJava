import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n = 1, num = 0;
        float suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero: ");
        num = sc.nextInt();
        while(n <= num) {
            suma = 1 + 1/n;
            n++;
        }
        System.out.print("Suma: %.2f" + suma);
    }
}
