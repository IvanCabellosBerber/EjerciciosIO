import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Tots {

    public static void main(String[] args) throws Exception {
        BufferedReader br1;
        BufferedReader br2;
        BufferedWriter bw;

        try {
            br1 = new BufferedReader(new FileReader("parells.txt"));
            br2 = new BufferedReader(new FileReader("senars.txt"));
            bw = new BufferedWriter(new FileWriter("tots.txt"));

            String nl = System.getProperty("line.separator");
            String par; String impar;

            for (int i = 0; i <= 500; i = i+2) {
                par = br1.readLine();
                impar = br2.readLine();
                
                if (par != null) bw.write(par + nl);
                if (impar != null) bw.write(impar + nl);
            }

            br1.close(); br2.close(); bw.close();

        } catch (IOException e){
            throw new Exception("No se puede abrir");
        }

    }

}
