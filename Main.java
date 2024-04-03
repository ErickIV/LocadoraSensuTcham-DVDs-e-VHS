import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("\nDVD LOCADORA");
            System.out.println("-----------------------------");
            System.out.println("1 - Cadastrar Amigos");
            System.out.println("2 - Cadastrar DVDs");
            System.out.println("3 - Registrar Emprestimos");
            System.out.println("4 - Devolver DVD");
            System.out.println("5 - Listar Emprestimos");
            System.out.println("6 - Sair");
            System.out.println("-----------------------------");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastraAmigos(sc);
                    break;
                case 2:
                    cadastraDVDs(sc);
                    break;
                case 3:
                    registraEmprestimo(sc);
                    break;
                case 4:
                    devolveDVD(sc);
                    break;
                case 5:
                    listarEmprestimos();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 6);

        sc.close();
    }

    private static void cadastraAmigos(Scanner sc) {
        // Implement the cadastraAmigos method
    }

    private static void cadastraDVDs(Scanner sc) {
        // Implement the cadastraDVDs method
    }

    private static void registraEmprestimo(Scanner sc) {
        // Implement the registraEmprestimo method
    }

    private static void devolveDVD(Scanner sc) {
        // Implement the devolveDVD method
    }

    private static void listarEmprestimos() {
        // Implement the listarEmprestimos method
    }
}
