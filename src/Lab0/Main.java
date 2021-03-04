package Lab0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Size userSize = null;
        Scanner leitor = new Scanner(System.in);
        System.out.println("""
                Insira o caráter do tamanho de bebida desejado
                 S - Pequeno
                 M - Médio
                 L - Grande""");
        while (userSize == null) {
            char user = leitor.next().charAt(0);
            switch(user) {
                case 'S' -> userSize = Size.SMALL;
                case 'M' -> userSize = Size.MEDIUM;
                case 'L' -> userSize = Size.LARGE;
                default -> System.out.println("Tamanho incorreto");
            }
        }
        userSize.displayOrderInfo();

    }


}
