import java.sql.Connection;

public class Main {
    private Connection connection;

    public static void main(String[] args) {
        Alunos cadastro = new Alunos();
        boolean executar = true;
        while (executar) {
            cadastro.imprimirMenu();
            String opcao = cadastro.scanner.nextLine();
            switch (opcao) {
                case "1":
                    cadastro.adicionarAlunos();
                    break;

                case "2":
                    cadastro.cpf();
                    break;

                case "3":
                    cadastro.disciplinas();
                    break;

                case "4":
                    cadastro.visualizarCad();
                    break;

                    case "5":
                    cadastro.excluirAluno();
                    break;
                case "6":
                    cadastro.scanner.close();
                    executar = false;
                    break;

                default:
                    System.out.println("Opcao invalida, escolha outra opcao.");
                    break;
            }
        }
    }
}