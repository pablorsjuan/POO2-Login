import java.time.*;
public class InicioAdmin {
    public static void main(String[] args) {
        loggear("hola");
    }
    static void loggear(String usuario){
        //System.out.println("Hola Admin "+usuario);
        String ingreso = LocalDate.now()+"-"+LocalTime.now()+"-"+usuario;
        EscribirTXT.escribir(ingreso);
    }
}
