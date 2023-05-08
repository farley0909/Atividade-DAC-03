import java.util.Scanner;

public class Main {

    Scanner scan;
    public static void main(String[] args){


        new Main();

    }

    public Main(){
        int escolha = 0;

        Controle c = new Controle();
        scan = new Scanner(System.in);

        do{
            System.out.println("Programa de cadastro de Pessoas\n");
            System.out.println("Comandos:");
            System.out.println("1 - Cadastrar Pessoas");
            System.out.println("2 - Listar Pessoas salvas");
            System.out.println("3 - encerrar");
            escolha = scan.nextInt();

            if(escolha == 1){
                System.out.println("Programa de cadastro de Pessoas\n");
                scan.nextLine(); // Consumir o \n do buffer do Scanner

                System.out.print("Digite o nome da pessoa:");
                String nome = scan.nextLine();

                System.out.print("Digite a idade da pessoa:");
                int idade = scan.nextInt();
                scan.nextLine(); // Consumir o \n do buffer do Scanner

                System.out.print("Digite a profissão da pessoa:");
                String profissao = scan.nextLine();

                Pessoa p = new Pessoa(nome, idade, profissao);
                c.inserirNoBanco(p);

                System.out.println("Pessoa cadastrada com sucesso!");
            }

            else if(escolha == 2){
               c.listarPessoasSalvas();
            }

            else{
                escolha = 3;
                System.out.println("Programa encerrado.");
            }
            
        }while(escolha != 3);
        
    }

    


}

