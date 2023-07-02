import java.util.ArrayList;
import java.util.Scanner;

public class Main{


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        PessoaDAO pessoaDAO = new PessoaDAO();

        while(true){

            int escolha = 0;

            System.out.println("Programa de salvar pessoas.....\n");
            System.out.println("1 - Salvar pessoas no banco.");
            System.out.println("2 - Ve pessoas salvas.");
            System.out.println("3 - Encerrar programa.");
            System.out.print("\nDigite sua escolha:");

            escolha = scan.nextInt();
            

            if(escolha == 1){

                String nome = "",profissao = "";
                int idade = 0;

                System.out.println("\nCadastro de Pessoa");
                System.out.print("Digite o nome da Pessoa:");
                scan.nextLine();
                nome = scan.nextLine();
                System.out.print("Digte a idade da Pessoa:");
                idade = scan.nextInt();
                System.out.print("Digte a profissao da Pessoa:");
                scan.nextLine();
                profissao = scan.nextLine();

                Pessoa pessoa = new Pessoa(nome,idade,profissao);
                pessoaDAO.cadastrarPessoa(pessoa);


            }

            else if(escolha ==2){

                System.out.println("Pessoas cadastradas:");
                System.out.println("--------------------------");

                ArrayList<Pessoa> pessoas = pessoaDAO.pegarPessoas();

                pessoaDAO.imprimirPessoas(pessoas);

            }

            else if(escolha == 3){
                scan.close();
                break;

            }

            else{
                System.out.println("\nComando nao encontrado.\n");
            }

        }

    }


}

//criar tabela no banco
/*
 * 
 * CREATE TABLE pessoa (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(50),
  idade INTEGER,
  profissao VARCHAR(50)
);
 * 
 */