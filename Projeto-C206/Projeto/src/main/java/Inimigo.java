public abstract class Inimigo {

    private String nome;
    private double vida;
    protected double dano;
    protected int id;//nivel de forca do inimigo

    public Inimigo(String nome, double vida, int id) {
        this.nome = nome;
        this.vida = vida;
        this.id = id;
    }
    public Inimigo(){

    }

    void setDanoIn(int id ){

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
