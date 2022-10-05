public class InimigoForte extends Inimigo{


    public InimigoForte(String nome, double vida, int id) {
        super(nome, vida, id);
    }

    @Override
    public void setDanoIn(int id){
        dano =20+ (id*10);
    }


}
