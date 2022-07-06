import java.util.Scanner;

public class TarefaWrapper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = Integer.valueOf(s.nextInt());
        System.out.println("O numero digitado: " + num);
        long num2 = num;
        System.out.println("Novo Numero Casting Implicito: " + num2);
        short num3 = (short) num2;
        System.out.println("Novo Numero Casting Explicito: " + num3);
    }
}
