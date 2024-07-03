import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela7 extends JFrame {
	private JTextField id;
	private JTextField dataConc;
	private JTextField valorSer;
	private JTextField valorPeca;
	private JTable table;
    public Janela7() {
        setTitle("Janela 7");
        setSize(773, 475);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblFaturamneto = new JLabel("FATURAMENTO");
        lblFaturamneto.setHorizontalAlignment(SwingConstants.CENTER);
        lblFaturamneto.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblFaturamneto.setBounds(10, 22, 737, 31);
        getContentPane().add(lblFaturamneto);
        
        JLabel lblDetalhesDaOs = new JLabel("Detalhes da OS:");
        lblDetalhesDaOs.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDetalhesDaOs.setBounds(44, 84, 139, 25);
        getContentPane().add(lblDetalhesDaOs);
        
        id = new JTextField();
        id.setColumns(10);
        id.setBounds(107, 123, 86, 20);
        getContentPane().add(id);
        
        JLabel lblCod_1 = new JLabel("Id da OS:");
        lblCod_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1.setBounds(44, 120, 139, 25);
        getContentPane().add(lblCod_1);
        
        JLabel lblCod_1_1 = new JLabel("Data de Conclusão:");
        lblCod_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1_1.setBounds(44, 154, 111, 25);
        getContentPane().add(lblCod_1_1);
        
        dataConc = new JTextField();
        dataConc.setColumns(10);
        dataConc.setBounds(159, 157, 86, 20);
        getContentPane().add(dataConc);
        
        JLabel lblRegistrosDoFaturamento = new JLabel("Registro de Faturamento:");
        lblRegistrosDoFaturamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblRegistrosDoFaturamento.setBounds(400, 84, 192, 25);
        getContentPane().add(lblRegistrosDoFaturamento);
        
        JLabel lblCod_1_2 = new JLabel("Valor do Serviço:");
        lblCod_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1_2.setBounds(400, 120, 110, 25);
        getContentPane().add(lblCod_1_2);
        
        JLabel lblCod_1_1_1 = new JLabel("Valor das peças:");
        lblCod_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1_1_1.setBounds(399, 154, 111, 25);
        getContentPane().add(lblCod_1_1_1);
        
        valorSer = new JTextField();
        valorSer.setColumns(10);
        valorSer.setBounds(506, 123, 104, 20);
        getContentPane().add(valorSer);
        
        valorPeca = new JTextField();
        valorPeca.setColumns(10);
        valorPeca.setBounds(506, 157, 104, 20);
        getContentPane().add(valorPeca);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 196, 737, 229);
        getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Id da OS", "Data Conclus\u00E3o", "Valor do Servi\u00E7o", "Valor das Pe\u00E7as", "Faturamento"
        	}
        ));
        scrollPane.setViewportView(table);
        
        JButton btnNewButton = new JButton("Concluir");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		String Id = id.getText().trim();
        		String DataConc = dataConc.getText().trim();
        		String ValorSer = valorSer.getText().trim();
        		String ValorPeca = valorPeca.getText().trim();
        		
        		float Faturamento = ( Float.parseFloat(ValorSer)) - (Float.parseFloat(ValorPeca));
        		
        		DefaultTableModel tabela = (DefaultTableModel) table.getModel();
        		tabela.addRow(new String[] {Id, DataConc, ValorSer, ValorPeca, Faturamento+""});
        		
        		id.setText("");
        		valorSer.setText("");
        		dataConc.setText("");
        		valorPeca.setText("");
        		
        		id.requestFocus();
        		
        		
        	}
        });
        btnNewButton.setBounds(646, 156, 89, 23);
        getContentPane().add(btnNewButton);
        
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
        	}
        	
        });
        btnExcluir.setBounds(646, 122, 89, 23);
        getContentPane().add(btnExcluir);
    }
}
