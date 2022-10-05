import java.util.ArrayList;
import java.util.Collections;
public class Conta {

    private String Nome;
    private String Senha;
    public String email;
    ArrayList <Personagem> personagens;


    public Conta(String nome, String senha, String email) {
        Nome = nome;
        Senha = senha;
        this.email = email;
        personagens = new ArrayList<>();
    }

    void addPersonagem(Personagem personagem){

        personagens.add(personagem);
    }

    void mostraPersonagens(){

        for (int i = 0; i < personagens.size(); i++) {

                personagens.get(i).mostraInfo(i);
                System.out.println("");


        }

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
