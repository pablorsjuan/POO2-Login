import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FRMPrincipal extends JFrame implements ActionListener {
    //todo############-Atributos-############
    static FRMPrincipal ventana;
    static FRMInicio ventanaInicio;
    //static JButton;
    static ImageIcon imgUser;
    static JLabel llUser,llUsuario,llContrasena,llNotiFalse;
    static JButton btnIngresar;
    static JTextField txUsuario, txContrasena;
    static int vWidth=600, vHeight=400;
    //todo############-Action Listener-############
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnIngresar)){
            String user=txUsuario.getText();
            String password=txContrasena.getText();
            if (Usuarios.validarUsuario(user,password)){
                ventanaInicio.setVisible(true);
                this.setVisible(false);
                InicioAdmin.loggear(user);
            } else {
                llNotiFalse.setText("Usuario o contraseña no validos");
            }
        }
    }
    //todo############-Constructor-############
    public FRMPrincipal(){
        //Creación de ventanas extranjeras
        ventanaInicio=new FRMInicio();
        ventanaInicio.getContentPane().setBackground(Color.DARK_GRAY);

        //Creación de elementos
        imgUser=new ImageIcon(".\\img\\user.png");
        llUser=new JLabel(imgUser);
        llUser.setBounds(20,10,imgUser.getIconWidth(),imgUser.getIconHeight());
        llUsuario=new JLabel("Usuario");
        llUsuario.setBounds(200,10,100,30);
        llUsuario.setForeground(Color.WHITE);
        txUsuario=new JTextField();
        txUsuario.setBackground(Color.lightGray);
        txUsuario.setBounds(200,40,100,30);
        llContrasena=new JLabel("Contraseña");
        llContrasena.setBounds(400,10,100,30);
        llContrasena.setForeground(Color.WHITE);
        txContrasena=new JTextField();
        txContrasena.setBackground(Color.lightGray);
        txContrasena.setBounds(400,40,100,30);
        btnIngresar =new JButton("Ingresar");
        btnIngresar.setBounds(275,90,150,30);
        btnIngresar.setBackground(Color.GREEN);
        btnIngresar.addActionListener(this);
        llNotiFalse=new JLabel("");
        llNotiFalse.setForeground(Color.RED);
        llNotiFalse.setBounds(20,150,200,30);

        //Añadir elementos
        add(llUser);
        add(llUsuario);
        add(llContrasena);
        add(txUsuario);
        add(txContrasena);
        add(btnIngresar);
        add(llNotiFalse);

        //Crear ventana
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setSize(vWidth,vHeight);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        ventana=new FRMPrincipal();
        ventana.setVisible(true);
        ventana.getContentPane().setBackground(Color.DARK_GRAY);
    }
}
