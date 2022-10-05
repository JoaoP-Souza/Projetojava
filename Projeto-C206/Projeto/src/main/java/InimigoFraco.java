public class InimigoFraco extends Inimigo{


    public InimigoFraco(String nome, double vida, int id) {
        super(nome, vida, id);
    }

    @Override
    public void setDanoIn(int id){
        dano =20+ (id*5);
    }


}

