import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Janela4 extends JFrame {
	private JTable table;
    public Janela4() {
        setTitle("Janela 4");
        setSize(837, 471);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("CONTROLE DE ESTOQUE");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(10, 33, 800, 31);
        getContentPane().add(lblNewLabel);
        
        JLabel lblBuscaRapida = new JLabel("Busca rapida de produto:");
        lblBuscaRapida.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblBuscaRapida.setBounds(42, 75, 203, 26);
        getContentPane().add(lblBuscaRapida);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 112, 800, 305);
        getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"C\u00F3digo", "Produto", "Quantidade", "Descri\u00E7\u00E3o"
        	}
        ));
        table.setFont(new Font("Tahoma", Font.PLAIN, 15));
        scrollPane.setViewportView(table);
    }
}

