import java.util.Scanner;

public class algoritmo {
    public static void main(String[] args) {
        String numero, numeroInvertido;
        numeroInvertido = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba un número de 4 digitos: ");
        numero = input.nextLine();
        for(int i=3; i>=0; i--) {
            numeroInvertido = numeroInvertido + numero.charAt(i);
        }
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}