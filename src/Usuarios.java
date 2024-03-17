import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Usuarios {
    static Boolean validarUsuario(String user,String password){
        Boolean bnd=false;
        String usuarios= LeerTXT.leer("usuarios.txt");
        String[] usuarioClave=usuarios.split(";");
        String[] us;
        //Map<String,String> diccionario = new HashMap<>();
        for (int i = 0; i < usuarioClave.length; i++) { //Aqui queda mejor un map
            us=usuarioClave[i].split(",");
            if (us[0].equals(user) && us[1].equals(password)){
                bnd=true;
            }
        }
        return bnd;
    }
}
