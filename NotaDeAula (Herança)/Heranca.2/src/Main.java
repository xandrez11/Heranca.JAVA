
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Teclado
        Scanner ler = new Scanner(System.in);
        // Produtos
        Smartphone s = new Smartphone();
        Televisao t = new Televisao();

        int escolha;
        int compra;
        int cadastro;
        String buyConfirm;
        String repetir;

        do {
            System.out.println("Bem-vindo(a) a loja ! O que deseja fazer ?");
            System.out.println("1. Comprar\n2. Cadastrar");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Qual produto você quer comprar ?\n1. Televisao\n2. Smartphone");
                    compra = ler.nextInt();

                    switch (compra) {
                        case 1:
                            if (t.getEstoque() > 0) {
                                System.out.println("Este item custa:" + t.getPrice() + ". Vai levar ? (s/n)");
                                buyConfirm = ler.next();

                                if (buyConfirm.equalsIgnoreCase("s")) {
                                    System.out.println("Perfeito ! Dirija-se ao caixa por favor :D");
                                    t.setEstoque(t.getEstoque() - 1);
                                    break;
                                } else if (buyConfirm.equalsIgnoreCase("n")) {
                                    System.out.println("Ok.");
                                    break;
                                } else {
                                    System.out.println("escolha uma opção válida por favor.");
                                    break;
                                }
                            } else {
                                System.out.println("Infelizmente não temos mais este item no estoque :(");
                            }
                            break;

                        case 2:
                            if (s.getEstoque() > 0) {
                                System.out.println("Este item custa:" + s.getPrice() + ". Vai levar ? (s/n)");
                                buyConfirm = ler.next();

                                if (buyConfirm.equalsIgnoreCase("s")) {
                                    System.out.println("Perfeito ! Dirija-se ao caixa por favor :D");
                                    s.setEstoque(s.getEstoque() -1);
                                    break;
                                } else if (buyConfirm.equalsIgnoreCase("n")) {
                                    System.out.println("Ok.");
                                    break;
                                } else {
                                    System.out.println("escolha uma opção válida por favor.");
                                    break;
                                }
                            } else {
                                System.out.println("Infelizmente não temos mais este item no estoque :(");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Qual produto deseja cadastrar ?\n1. Televisão\n2. Smartphone");
                    cadastro = ler.nextInt();

                    switch (cadastro) {
                        case 1:
                            System.out.println("Insira a quantidade a colocar no estoque: ");
                            t.setEstoque(ler.nextInt());
                            System.out.println("Insira o preço: ");
                            t.setPrice(ler.nextDouble());
                            System.out.println("Cadastrado !");
                            break;

                        case 2:
                            System.out.println("Insira a quantidade a colocar no estoque: ");
                            s.setEstoque(ler.nextInt());
                            System.out.println("Insira o preço: ");
                            s.setPrice(ler.nextDouble());
                            System.out.println("Cadastrado !");
                            break;
                    }
            }
            System.out.println("Deseja repetir ? (s/n)");
            repetir = ler.next();
        } while (repetir.equalsIgnoreCase("s"));
    }
}
