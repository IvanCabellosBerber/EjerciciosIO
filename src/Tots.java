import java.io.*;

public class Tots {

    public static void main(String[] args) throws Exception {
        BufferedReader br = null;

        try {
            File fileParells = new File("parells.txt");
            br = new BufferedReader(new FileReader(fileParells));

        } catch (Exception e){
            throw new Exception("No se puede abrir");
        }

    }

}
