package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame {
    private JTextField comidaInput;
    private JTextField reservaInput;
    private JButton comidaButton;
    private JButton reservaButton;
    private JLabel promocionLabel;

    public Vista() {
        // Configura la operación de cierre de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea los componentes
        comidaInput = new JTextField(20);
        reservaInput = new JTextField(20);
        comidaButton = new JButton("Elegir comida");
        reservaButton = new JButton("Reservar mesa");
        promocionLabel = new JLabel();

        // Añade los componentes a la ventana
        setLayout(new FlowLayout());
        add(new JLabel("Comida:"));
        add(comidaInput);
        add(comidaButton);
        add(new JLabel("Reserva:"));
        add(reservaInput);
        add(reservaButton);
        add(promocionLabel);

        // Configura el tamaño de la ventana
        setSize(300, 200);

        // Centra la ventana en la pantalla
        setLocationRelativeTo(null);

        // Añade los listeners a los botones
        comidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        reservaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes poner el código para manejar la reserva de una mesa
            }
        });
    }

    // Método para actualizar la promoción
    public void setPromocion(String promocion) {
        promocionLabel.setText("Promoción: " + promocion);
    }

    public static void main(String[] args) {
        // Crea y muestra la interfaz gráfica en el hilo de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
}