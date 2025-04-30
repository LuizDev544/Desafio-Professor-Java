import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class parte2 {

    public static void main(String[] args) {

        // erro de classe
        try {
            Class.forName("pedro");
        } catch (ClassNotFoundException e) {
            System.out.println("nao encontrei");
        }

        // erro de arquivo
        File file = new File("arquivo.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException  e) {
            // TODO Auto-generated catch block
            System.out.println("arquivo nao encontrado");

        } catch (IOException e){
            System.out.println("arquivo corrompido");
        }finally{
            System.out.println("Programa finalizado");
        }
    }

}