import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        boolean flag  =true;
        Conta c = new Conta("Joao Paulo", "1234", "Joao@mail.com");
        Combate comb = new Combate();

        Inimigo[] inimigo = new Inimigo[3];
        InimigoForte in1 = new InimigoForte("Kpiroto", 300,  5);

        InimigoFraco in2 = new InimigoFraco("Fraco D+", 60,  2);

        InimigoFraco in3 = new InimigoFraco("Nao tao fraco", 125,  5);

        in1.setDanoIn(in1.getId());//funcao para setar o dano de acordo com o id (nivel) do inimigo
        in2.setDanoIn(in2.getId());
        in3.setDanoIn(in3.getId());

        while (flag) {
            System.out.println("1- Adicionar novo personagem: ");
            System.out.println("2- Mostrar informaçoes dos seus personagens: ");
            System.out.println("3- Iniciar um combate");
            System.out.println("4- Sair do jogo");
            System.out.println("Sua opção: ");

            int op = in.nextInt();

            switch (op){
                case 1:
                    in.nextLine();

                    Personagem personagem = new Personagem();


                    System.out.println("Digite o nome do personagem: ");
                    personagem.setNome(in.nextLine());


                    System.out.println("Digite o nivel: ");
                    personagem.setNivel(in.nextInt());

                    personagem.setVida(100+ personagem.getNivel()*10);
                    personagem.setDano(20+ personagem.getNivel()*5);
                    c.addPersonagem(personagem);
                    Arquivo.escrever(personagem);

                    break;
                case 2:
                    c.mostraPersonagens();
                    break;
                case 3:


                    System.out.println("escolha o personagem que vai lutar informando seu numero ");
                    int cont= in.nextInt();
                    System.out.println("Agora escolha um numero entre 1 e 3 para determinar seu inimigo");
                    int escolheInimigo = in.nextInt();

                    if(escolheInimigo>=1 && escolheInimigo<=3){

                        if(escolheInimigo==1) comb.luta(c.personagens.get(cont), in1);

                        if(escolheInimigo==2) comb.luta(c.personagens.get(cont), in2);

                        if(escolheInimigo==3) comb.luta(c.personagens.get(cont), in3);
                    }
                    else System.out.println("Escolha um numero valido!! ");
                    break;

                case 4:


                    System.out.println("Você saiu!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }
    }
}
