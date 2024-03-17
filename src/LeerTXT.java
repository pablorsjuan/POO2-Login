import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class LeerTXT {
    public static String leer(String nombreArchivo){
        String linea="";
        try {
            String nomArchivo="usuarios.txt";
            FileReader fileReader=new FileReader(nomArchivo);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            linea= bufferedReader.readLine();
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e){
            System.out.println("Error de lectura:\n"+e);
        }
        return linea;
    }
}
