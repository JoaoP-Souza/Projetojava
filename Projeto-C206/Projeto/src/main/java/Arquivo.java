import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public static void escrever(Personagem p) {

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {

            os = new FileOutputStream("Arquivo.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("lista");
            bw.newLine();
            bw.write(p.getNome() + "\n");
            bw.write(p.getNivel() + "\n");
            bw.write(p.getVida() + "\n");
            bw.write(p.getDano() + "\n");

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }


    public static ArrayList<Personagem> ler() {

        ArrayList<Personagem> personagens = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try {

            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null) {
                if (linhaLer.contains("lista")) {
                    Personagem p = new Personagem();
                    p.setNome(br.readLine());
                    p.setNivel(Integer.parseInt(br.readLine()));
                    p.setVida(Integer.parseInt(br.readLine()));
                    p.setDano(Integer.parseInt(br.readLine()));
                    personagens.add(p);
                    System.out.println("");
                }
                linhaLer = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }


        return personagens;
    }
}

