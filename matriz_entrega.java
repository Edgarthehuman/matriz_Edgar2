import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Resolver Matriz 2x2");
            System.out.println("2 - Fórmula de Bhaskara");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    matriz(entrada);
                    break;
                case 2:
                    bhaskara(entrada);
                    break;
                case 3:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        entrada.close();
    }

    // Método Matriz 2x2
    public static void matriz(Scanner entrada) {
        int[][] matriz = new int[2][2];

        System.out.println("Digite os valores da matriz 2x2:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz digitada:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método Bhaskara
    public static void bhaskara(Scanner entrada) {
        double a, b, c, delta, x1, x2;

        System.out.print("Digite valor de a: ");
        a = entrada.nextDouble();

        System.out.print("Digite valor de b: ");
        b = entrada.nextDouble();

        System.out.print("Digite valor de c: ");
        c = entrada.nextDouble();

        delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Delta = " + delta);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}