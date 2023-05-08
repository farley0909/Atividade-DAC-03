import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter; 


public class Controle {


    public void inserirNoBanco(Pessoa p){


        try{

            File arquivo = new File("banco.txt");
            if(!arquivo.exists()){
                arquivo.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo,true));

            String nome = p.getNome();
            int idade = p.getIdade();
            String profissao = p.getProfissao();

            if (arquivo.length() > 0) {
                bw.newLine();
            }
            
            bw.write(nome);
            bw.newLine();

            if(idade != 0){
                bw.write(""+ idade);
                bw.newLine();
            }
           
            if(profissao != null){
                bw.write(profissao);
            }

            bw.close();
        }

        catch(Exception e){

        }

    }

    public void listarPessoasSalvas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("banco.txt"));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                if (count % 3 == 0) {
                    System.out.println("Nome: " + line);
                } else if (count % 3 == 1) {
                    System.out.println("Idade: " + line);
                } else {
                    System.out.println("Profissão: " + line);
                    System.out.println("-------------");
                }
                count++;
            }
            br.close();
        } catch (Exception e) {

        }
    }
    

}
