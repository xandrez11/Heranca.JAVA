import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Exibir Funcionário");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner);
                    break;
                case 2:
                    exibirFuncionario();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    private static void cadastrarFuncionario(Scanner scanner) {
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.next();
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();
        System.out.println("Escolha o cargo do funcionário:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Diretor");
        int cargo = scanner.nextInt();
        Funcionario funcionario;
        switch (cargo) {
            case 1:
                Gerente g=new Gerente();
                System.out.println("Digite o departamento do gerente:");
                String departamento = scanner.next();
                funcionario = new Gerente(nome, salario, departamento);
                g.calcularBonus();
                System.out.println(g.getSalario());
                break;

            default:
                System.out.println("Cargo inválido!");
                return;
        }
        funcionario.cadastrar();
    }

    private static void exibirFuncionario() {
        Funcionario[] funcionarios = Funcionario.getFuncionarios();
        if (funcionarios.length == 0) {
            System.out.println("Não há funcionários cadastrados!");
        } else {
            System.out.println("Funcionários cadastrados:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }
}