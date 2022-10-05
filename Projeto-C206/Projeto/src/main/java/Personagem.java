public class Personagem {

    private String nome;
    private double vida;
    private double dano;
    private int nivel;

    public Personagem(String nome, double vida, double dano, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.nivel = nivel;
    }

    public Personagem(){

    }



    void mostraInfo(int contAux){


            System.out.println( "Personagem " + contAux );
            System.out.println("Nome: " + nome);
            
            System.out.println("vida: " + vida);
            System.out.println("dano: " + dano);
            System.out.println("nivel: " + nivel);


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
