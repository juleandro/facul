import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Alunos {
    Scanner scanner = new Scanner(System.in);
    Aulas aulas = new Aulas();
    void adicionarAlunos(){
        List<String[]> lista = new ArrayList<>();
        aulas.connect();
        aulas.createTable();
        while(true) {
            String[] nome ={"", ""};
            System.out.println("Digite o nome do cliente");
            nome[0] = scanner.nextLine();
            //saída do loop
            if (nome[0].equalsIgnoreCase("fim")) {
                break;
            }
            System.out.println("Digite a idade do cliente");
            nome[1] = scanner.nextLine();
            lista.add(nome);
        }
        aulas.insertAlunos(lista);
        aulas.close();
    }

    void cpf(){
        aulas.connect();
        aulas.queryClients();
       aulas.close();
    }

    void disciplinas(){
        aulas.connect();
        aulas.atualizarMenores();
        aulas.close();
    }

    void visualizarCad(){
        aulas.connect();
        aulas.deleteClient();
        aulas.close();
    }

    void excluirAluno(){
        aulas.connect();
        aulas.deleteClient();
        aulas.close();
    }

    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir nome e sobrenome");
        System.out.println("2- Inserir CPF");
        System.out.println("3- Mostrar disciplinas");
        System.out.println("4- Visualizar cadastro");
        System.out.println("5- Excluir Aluno");
        System.out.println("6- Sair");
    }
}
