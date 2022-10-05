import java.util.Scanner;

public class Combate {

    void luta(Personagem p, Inimigo i){
        int aux=0;

        while(p.getVida()>0 || i.getVida()>0) {
            Scanner in = new Scanner(System.in);

            //personagem ataca primeiro
            i.setVida(i.getVida() - p.getDano());
            System.out.println( p.getNome() +" Ataca!! " + i.getNome() + " sofreu " + p.getDano() + " de dano");
            if(i.getVida()>=0)  System.out.println( "Vida atual do  " + i.getNome() + ": " + i.getVida());
            else System.out.println(i.getNome() + " foi derrotado");
            System.out.println(" ");
            in.nextLine();
            if(i.getVida()<0 && p.getVida()>0){
                aux=1;
                break;
            }

            //inimigo ataca
            p.setVida(p.getVida()-i.getDano());
            System.out.println(i.getNome() + "Ataca!! " + p.getNome() + " Sofreu " + i.getDano() + " de dano");
            if(p.getVida()>=0) {
                System.out.println("Vida Atual de " + p.getNome() + ": " +  p.getVida());
            }
            else System.out.println( p.getNome() + " foi derrotado");

            System.out.println(" ");
            in.nextLine();
            if (p.getVida()<0 && i.getVida()>0){
                aux=2;
                break;
            }
            if(p.getVida()<0 && i.getVida()<0){
                aux=3;
                break;
            }

        }

        if (aux==1){
            System.out.println( p.getNome() + " Venceu!!");
        }
        else if(aux==2){
            System.out.println( i.getNome() + " Venceu");
        }
        else{
            System.out.println("Empate");
        }
    }
}
