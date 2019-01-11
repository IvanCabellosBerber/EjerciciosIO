import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.WriteAbortedException;

public class Parells {

    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        System.out.print("Dime como se llamará tu nuevo fichero: ");
        String nombreFichero = sc.next();
        */

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("parells.txt"));
            short num = 0;
            while (num <= 500){
                bw.write(String.valueOf(num) + "\n");
                num = (short) (num + 2);
            }
            bw.close();
        } catch (WriteAbortedException e){
            System.out.println("No se ha podido escribir");
        } catch (IOException e){
            System.out.println("No se puede abrir/crear");
        }

    }

}
