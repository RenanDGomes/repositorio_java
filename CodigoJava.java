import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int totalValor = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Boa noite, " + nome);
        System.out.println("Aqui está nossos lanches: ");
        System.out.println("Cachorro Quente  |  100  |  15,00");
        System.out.println("Bauru Simples    |  101  |  10,00");
        System.out.println("Bauru com Ovo    |  102  |  12,00");
        System.out.println("Hambúrger        |  103  |  15,00");
        System.out.println("Cheeseburguer    |  104  |  16,00");
        System.out.println("Qual lanche você deseja, " + nome + "?");
        int cod = sc.nextInt();
        sc.nextLine(); /*para dar buff e não parar no enter*/
        while (cod < 100 || cod > 104){
            System.out.println("O código é inválido, insira um código existente");
            cod = sc.nextInt();
        }
        String lanche = "";
        int valorLanche = 0;

        if (cod == 100) {
            lanche = "Cachorro Quente";
            valorLanche = 15;
        } else if (cod == 101) {
            lanche = "Bauru";
            valorLanche = 10;
        } else if (cod == 102) {
            lanche = "Bauru com ovo";
            valorLanche = 12;
        } else if (cod == 103) {
            lanche = "Hamburguer";
            valorLanche = 15;
        } else if (cod == 104) {
            lanche = "CheeseBurguer";
            valorLanche = 16;
        }
        totalValor += valorLanche;
        System.out.println("Seu pedido é " + lanche + ", ele custa " + valorLanche);
        System.out.println("Você deseja algo mais? ");
        String novoPedido = sc.nextLine();

        while (novoPedido.equals("sim")) {
            System.out.println("Qual lanche você deseja? Diga-me o código!");
            int novoCod = sc.nextInt();
            sc.nextLine();
            while (novoCod < 100 || novoCod > 104) {
                System.out.println("O código é inválido, insira outro código");
                novoCod = sc.nextInt();
                sc.nextLine();
            }
            if (novoCod == 100) {
                lanche = "Cachorro Quente";
                valorLanche = 15;
            } else if (novoCod == 101) {
                lanche = "Bauru";
                valorLanche = 10;
            } else if (novoCod == 102) {
                lanche = "Bauru com ovo";
                valorLanche = 12;
            } else if (novoCod == 103) {
                lanche = "Hamburguer";
                valorLanche = 15;
            } else if (novoCod == 104) {
                lanche = "CheeseBurguer";
                valorLanche = 16;
            }
            totalValor += valorLanche;
            System.out.println("Seu pedido é " + lanche + ", ele custa " + valorLanche);
            System.out.println("Você deseja algo mais? (sim ou não)");
            novoPedido = sc.nextLine();
        }
        System.out.println("Seu pedido total é R$" + totalValor + ",00. Ok, aguarde seu pedido ficar pronto!");

    }
}

