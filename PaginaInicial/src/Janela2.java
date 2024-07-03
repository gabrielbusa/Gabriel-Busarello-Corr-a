import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToggleButton;

public class Janela2 extends JFrame {
	private JTextField NomeSolic;
	private JTextField tel;
	private JTextField peca;
	private JTextField quantidade;
	private JTable table;
	private JTextField status;
    public Janela2() {
        setTitle("Janela 2");
        setSize(798, 523);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblCriaoDePedido = new JLabel("Criação de Pedido");
        lblCriaoDePedido.setHorizontalAlignment(SwingConstants.CENTER);
        lblCriaoDePedido.setForeground(Color.BLACK);
        lblCriaoDePedido.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCriaoDePedido.setBackground(Color.BLACK);
        lblCriaoDePedido.setBounds(10, 22, 761, 28);
        getContentPane().add(lblCriaoDePedido);
        
        JLabel lblNewLabel_1 = new JLabel("Nome do Solicitante:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(23, 81, 143, 22);
        getContentPane().add(lblNewLabel_1);
        
        NomeSolic = new JTextField();
        NomeSolic.setColumns(10);
        NomeSolic.setBounds(165, 84, 191, 20);
        getContentPane().add(NomeSolic);
        
        JLabel lblNewLabel_1_2 = new JLabel("Telefone:");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_2.setBounds(380, 81, 62, 22);
        getContentPane().add(lblNewLabel_1_2);
        
        tel = new JTextField();
        tel.setColumns(10);
        tel.setBounds(447, 84, 131, 20);
        getContentPane().add(tel);
        
        NomeSolic.requestFocus();
        
        NomeSolic.setText("");
        tel.setText("");
        
        JLabel lblPeca = new JLabel("Peça:");
        lblPeca.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblPeca.setBounds(380, 128, 99, 22);
        getContentPane().add(lblPeca);
        
        peca = new JTextField();
        peca.setColumns(10);
        peca.setBounds(425, 129, 153, 20);
        getContentPane().add(peca);
        
        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblQuantidade.setBounds(23, 128, 99, 22);
        getContentPane().add(lblQuantidade);
        
        quantidade = new JTextField();
        quantidade.setColumns(10);
        quantidade.setBounds(107, 131, 167, 20);
        getContentPane().add(quantidade);
        
        JButton btnAdicionarPedido = new JButton("Adicionar Pedido");
        btnAdicionarPedido.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String Nome = NomeSolic.getText().trim();
        		String Telefone = tel.getText().trim();
        		String Peca = peca.getText().trim();
        		String Quantidade = quantidade.getText().trim();
        		String Status = status.getText().trim();
        		
        		DefaultTableModel tabela = (DefaultTableModel) table.getModel();
        		tabela.addRow(new String[] {Nome, Telefone, Peca, Quantidade, Status});
        		
        		NomeSolic.setText("");
        		tel.setText("");
        		peca.setText("");
        		quantidade.setText("");
        		status.setText("");
        		
        		NomeSolic.requestFocus();
        	}
        });
        btnAdicionarPedido.setBounds(640, 130, 131, 23);
        getContentPane().add(btnAdicionarPedido);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 170, 761, 264);
        getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Peça", "Quantidade", "Telefone", "Nome do Solicitante", "Status"
        	}
        ));
        scrollPane.setViewportView(table);
        
        JLabel lblNewLabel_1_2_1 = new JLabel("Status:");
        lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_2_1.setBounds(599, 81, 62, 22);
        getContentPane().add(lblNewLabel_1_2_1);
        
        status = new JTextField();
        status.setText("");
        status.setColumns(10);
        status.setBounds(649, 84, 121, 20);
        getContentPane().add(status);
        
        JButton btnExcluirPedido = new JButton("Excluir Pedido");
        btnExcluirPedido.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
        	}
        });
        btnExcluirPedido.setBounds(640, 450, 131, 23);
        getContentPane().add(btnExcluirPedido);
        
        
    }
}
