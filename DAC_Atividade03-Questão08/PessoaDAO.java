import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PessoaDAO {

    ResultSet rs;
    ArrayList<Pessoa> listaPessoa = new ArrayList<>();


    public void cadastrarPessoa(Pessoa pessoa){

        String sql = "INSERT INTO Pessoa ( nome, idade, profissao ) VALUES ( ?, ? ,?)";

        PreparedStatement ps = null;

        try{
            ps = Coneccao.getConnection().prepareStatement(sql);
            ps.setString(1, pessoa.getNome());            
            ps.setInt(2, pessoa.getIdade());
            ps.setString(3, pessoa.getProfissao());


            ps.execute();
            ps.close();

        }
        catch(SQLException e){
            e.printStackTrace();
        }



    }

    public ArrayList<Pessoa> pegarPessoas(){

        String sql = "SELECT * from Pessoa";

        PreparedStatement ps = null;

        try{
            ps = Coneccao.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){

                Pessoa pessoa = new Pessoa();
                pessoa.setNome(rs.getString("nome"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.setProfissao(rs.getString("profissao"));

                listaPessoa.add(pessoa);

            }

            return listaPessoa;

        }

        catch(SQLException e){
            e.printStackTrace();
            return null;
        }


    }

    public void imprimirPessoas(ArrayList<Pessoa> pessoas) {
        for (Pessoa pessoa : listaPessoa) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Profissão: " + pessoa.getProfissao());
            System.out.println("--------------------------");
        }
    }




}
