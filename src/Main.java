import java.util.Scanner;
public class Main { //Bonificación: esto con interfaz gráfica
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digitie usuario");
        String u= scanner.next();
        System.out.println("Digitie contraseña");
        String c= scanner.next();
        if(Usuarios.validarUsuario(u,c)){
            InicioAdmin.loggear(u);
        }else{
            System.out.println("Usuario o clave incorrecta");
        }
    }
}