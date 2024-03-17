import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FRMInicio extends JFrame implements ActionListener {
    //todo############-Atributos-############
    static int X=20,Y=10,vWidth=600, vHeight=400;
    static JLabel llSaludo;
    static JButton btnRegresar;
    static ImageIcon imgRegresar;
    //todo############-Action Listener-############
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnRegresar)){
            FRMPrincipal.ventana.setVisible(true);
            this.setVisible(false);
        }
    }
    //todo############-Constructor-############
    public FRMInicio(){
        //Creación de elementos
        llSaludo=new JLabel("Bienvenido, usuario");
        llSaludo.setBounds(X,Y*4,200,30);
        llSaludo.setForeground(Color.WHITE);
        imgRegresar=new ImageIcon(".\\img\\return.png");
        btnRegresar=new JButton("Regresar",imgRegresar);
        btnRegresar.setBounds(X,Y,150,30);
        btnRegresar.addActionListener(this);

        //Añadir elementos
        add(llSaludo);
        add(btnRegresar);

        //Crear ventana
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setSize(vWidth,vHeight);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
