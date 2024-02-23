import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase:");
        String palabra = scanner.nextLine();

        String palabraAlReves = invertirTexto(palabra);
        System.out.println("Palabra al revés: " + palabraAlReves);

        scanner.close();
    }

    public static String invertirTexto(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }
}