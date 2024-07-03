import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela5 extends JFrame {
	private JTextField valorSer;
	private JTextField idCliente;
	private JTextField datPedido;
	private JTable table;
	private JTextField descricao;
    public Janela5() {
        setTitle("Janela ");
        setSize(915, 396);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel_6 = new JLabel("ORDEM DE SERVIÇO");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_6.setBounds(10, 36, 878, 22);
        getContentPane().add(lblNewLabel_6);
        
        JLabel lblNewLabel_1 = new JLabel("Id do Cliente:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(63, 119, 123, 22);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_7 = new JLabel("Valor do Serviço:");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_7.setBounds(63, 165, 139, 22);
        getContentPane().add(lblNewLabel_7);
        
        JLabel lblNewLabel_10 = new JLabel("Data do Pedido:");
        lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_10.setBackground(new Color(255, 162, 117));
        lblNewLabel_10.setBounds(63, 214, 139, 22);
        getContentPane().add(lblNewLabel_10);
        
        valorSer = new JTextField();
        valorSer.setColumns(10);
        valorSer.setBounds(178, 168, 139, 20);
        getContentPane().add(valorSer);
        
        idCliente = new JTextField();
        idCliente.setColumns(10);
        idCliente.setBounds(156, 122, 139, 20);
        getContentPane().add(idCliente);
        
        datPedido = new JTextField();
        datPedido.setColumns(10);
        datPedido.setBounds(178, 217, 139, 20);
        getContentPane().add(datPedido);
        
        JLabel lblNewLabel_10_1 = new JLabel("Descrição:");
        lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_10_1.setBackground(new Color(255, 162, 117));
        lblNewLabel_10_1.setBounds(63, 264, 139, 22);
        getContentPane().add(lblNewLabel_10_1);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(369, 119, 529, 219);
        getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Id do Cliente", "Valor do Serviço", "Data do Pedido", "Descrição"
        	}
        ));
        scrollPane.setViewportView(table);
        
        JButton btnNewButton = new JButton("Concluir");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String ID = idCliente.getText().trim();
        		String Valor = valorSer.getText().trim();
        		String Data = datPedido.getText().trim();
        		String Descricao = descricao.getText().trim();
        		
        		DefaultTableModel tabela = (DefaultTableModel) table.getModel();
        		tabela.addRow(new String[] {ID, Valor, Data, Descricao});
        		
        		idCliente.setText("");
        		valorSer.setText("");
        		datPedido.setText("");
        		descricao.setText("");
        		
        		idCliente.requestFocus();
        		
        	}
        });
        btnNewButton.setBounds(228, 315, 89, 23);
        getContentPane().add(btnNewButton);
        
        descricao = new JTextField();
        descricao.setColumns(10);
        descricao.setBounds(136, 267, 181, 20);
        getContentPane().add(descricao);
        
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
        	}
        });
        btnExcluir.setBounds(125, 315, 89, 23);
        getContentPane().add(btnExcluir);
    }
}
