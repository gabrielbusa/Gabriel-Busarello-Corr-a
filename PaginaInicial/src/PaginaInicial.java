import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PaginaInicial extends JFrame {
    public PaginaInicial() {
        setTitle("Pagina Inicial");
        setSize(598, 415);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        String[] textos = {"Cadastro de Clientes", "Criação de Pedidos", "Cadastro de Peças", "Controle de Estoque", "Ordem de Serviço", "Baixa de Estoque", "Faturamento"};
        Class<?>[] janelas = {Janela1.class, Janela2.class, Janela3.class, Janela4.class, Janela5.class, Janela6.class, Janela7.class};

        JLabel lblNewLabel = new JLabel("AutoMaster");
        lblNewLabel.setForeground(new Color(0, 0, 128));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 23, 562, 43);
        getContentPane().add(lblNewLabel);
        
        
        int initialXPosition = 75; 
        int initialYPosition = 100; 
        int yOffset = 30; 

        for (int i = 0; i < textos.length; i++) {
            JLabel label = new JLabel(textos[i]);
           
            int labelWidth = textos[i].length() * 10; 
            label.setBounds(initialXPosition, initialYPosition + (i * yOffset), labelWidth, 20);
            label.setCursor(new Cursor(Cursor.HAND_CURSOR));
            int index = i;
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        JFrame janela = (JFrame) janelas[index].getDeclaredConstructor().newInstance();
                        janela.setVisible(true);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
            getContentPane().add(label);
        }
    }

    public static void main(String[] args) {
        PaginaInicial frame = new PaginaInicial();
        frame.setVisible(true);
    }
}

