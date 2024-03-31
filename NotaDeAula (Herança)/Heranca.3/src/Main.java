
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Telclado
        Scanner ler = new Scanner(System.in);
        // Contas
        ContaCorrente c = new ContaCorrente();
        ContaPoupanca p = new ContaPoupanca();
        // Escolha para o switchCase
        int escolha;
        // Artifícios do switchCase para conta Corrente;
        int escolhaFiltradaCorrente;
        double depositoCorrente;
        // Artifícios do switchCase para conta Poupança
        int escolhaFiltradaPoupanca;
        double depositoPoupanca;

        System.out.println("Olá, seja bem-vindo(a), qual é o seu nome ?");
        String nome = ler.next();
        c.setTitular(nome);
        p.setTitular(nome);
        // Controle de doWhile
        String repetir;
        do {
            System.out.println("Selecione o tipo de conta:\n1. Corrente\n2. Poupança");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("O que deseja fazer ?\n1. Depositar\n2. Sacar\n3. Usar cheque especial\n4. Exibir dados da conta");
                    escolhaFiltradaCorrente = ler.nextInt();

                    switch (escolhaFiltradaCorrente) {
                        case 1:
                            System.out.println("Insira a quantia que deseja depositar:");
                            depositoCorrente = ler.nextDouble();
                            c.setSaldo(c.getSaldo() + depositoCorrente);
                            System.out.println("Depósito realizado com sucesso !");
                            break;

                        case 2:
                            System.out.println("Insira a quantia que deseja sacar:");
                            double quantia = c.sacar(ler.nextInt());
                            if (c.getSaldo() >= quantia) {
                                c.setSaldo(c.getSaldo() - quantia);
                                System.out.println("Saque realizado com sucesso !");
                                break;
                            } else {
                                System.out.println("Não foi possível realizar o saque, você não tem saldo suficiente");
                                break;
                            }

                        case 3:
                            System.out.println("Quanto de cheque especial você deseja ter acesso ?");
                            double concederChequeEspecial = ler.nextDouble();

                            if (concederChequeEspecial <= c.valorChequeEspecial) {
                                c.setValorChequeEspecial(c.valorChequeEspecial - concederChequeEspecial);
                                System.out.println("Valor concedido");
                                break;
                            } else {
                                System.out.println("Valor negado, seu acesso ao cheque especial atualmente é de R$" + c.valorChequeEspecial);
                                break;
                            }

                        case 4:
                            System.out.println(c.exibirDados());
                            break;
                    }
                    break;

                case 2:
                    System.out.println("O que deseja fazer ?\n1. Depositar\n2. Sacar\n3. Calcular rendimentos\n4. Exibir dados da conta");
                    escolhaFiltradaPoupanca = ler.nextInt();

                    switch (escolhaFiltradaPoupanca) {
                        case 1:
                            System.out.println("Insira a quantia que deseja depositar:");
                            depositoPoupanca = ler.nextDouble();
                            p.setSaldo(p.getSaldo() + depositoPoupanca);
                            System.out.println("Depósito realizado com sucesso !");
                            break;

                        case 2:
                            System.out.println("Insira a quantia que deseja sacar:");
                            double quantiaPoupanca = p.sacar(ler.nextInt());
                            if (p.getSaldo() >= quantiaPoupanca) {
                                p.setSaldo(p.getSaldo() - quantiaPoupanca);
                                System.out.println("Saque realizado com sucesso !");
                                break;
                            } else {
                                System.out.println("Não foi possível realizar o saque, você não tem saldo suficiente");
                                break;
                            }

                        case 3:
                            System.out.println(p.calcularRendimento());
                            break;
                        case 4:
                            System.out.println(p.exibirDados());
                    }
            }
            System.out.println("Deseja repetir ? (s/n)");
            repetir = ler.next();
        }  while (repetir.equalsIgnoreCase("s")) ;
    }
}

// Depositar, sacar, usar cheque especial, exibir dados da conta
