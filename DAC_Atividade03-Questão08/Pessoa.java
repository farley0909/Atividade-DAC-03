public class Pessoa{

    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome,int idade,String profissao){

        this.nome = nome;
        this.idade = idade;
        this.profissao  = profissao;

    }

    public Pessoa(){

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setIdade(int idade){

        this.idade = idade;

    }

    public void setProfissao(String profissao){

        this.profissao = profissao;

    }

    public String getNome(){

        return this.nome;

    }

    public int getIdade(){

        return this.idade;

    }

    public String getProfissao(){
        return this.profissao;
    }

}