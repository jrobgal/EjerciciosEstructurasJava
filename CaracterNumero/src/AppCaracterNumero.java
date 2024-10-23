public class AppCaracterNumero {
    public static void main(String[] args) throws Exception {
        char car1;
        System.out.print("Introduzca carácter: ");
        car1 = (char)System.in.read(); //lee un carácter
        if(Character.isDigit(car1)) //utilizamos el método isDigit de la clase Character
        System.out.println("Es un número");
        else
        System.out.println("No es un número");
    }
}
