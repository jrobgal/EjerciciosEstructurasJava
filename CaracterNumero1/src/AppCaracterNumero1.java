public class AppCaracterNumero1 {
    public static void main(String[] args) throws Exception {
        char car1;
        System.out.print("Introduzca carácter: ");
        car1 = (char) System.in.read(); // lee un carácter
        if (car1 >= '0' && car1 <= '9')
            System.out.println("Es un número");
        else
            System.out.println("No es un número");
    }
}
