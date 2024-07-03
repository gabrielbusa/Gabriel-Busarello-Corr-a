import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela1 extends JFrame {
	private JTextField nome;
	private JTextField endereco;
	private JTextField email;
	private JTextField telefone;
	private JTextField cpf;
	private JTable table;
    public Janela1() {
        setTitle("Janela 1");
        setSize(974,429);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(10, 11, 938, 28);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Nome:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(24, 69, 52, 22);
        getContentPane().add(lblNewLabel_1);
        
        nome = new JTextField();
        nome.setColumns(10);
        nome.setBounds(75, 71, 292, 23);
        getContentPane().add(nome);
        
        JLabel lblNewLabel_1_1 = new JLabel("Endereço:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(24, 125, 74, 22);
        getContentPane().add(lblNewLabel_1_1);
        
        endereco = new JTextField();
        endereco.setColumns(10);
        endereco.setBounds(94, 127, 273, 23);
        getContentPane().add(endereco);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("E-mail:");
        lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1_2.setBounds(24, 180, 74, 22);
        getContentPane().add(lblNewLabel_1_1_2);
        
        email = new JTextField();
        email.setColumns(10);
        email.setBounds(75, 183, 292, 23);
        getContentPane().add(email);
        
        JLabel lblNewLabel_2 = new JLabel("Telefone:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(24, 241, 80, 20);
        getContentPane().add(lblNewLabel_2);
        
        telefone = new JTextField();
        telefone.setColumns(10);
        telefone.setBounds(94, 242, 140, 22);
        getContentPane().add(telefone);
        
        JLabel lblNewLabel_2_1_1_1 = new JLabel("CPF:");
        lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2_1_1_1.setBounds(24, 297, 52, 20);
        getContentPane().add(lblNewLabel_2_1_1_1);
        
        cpf = new JTextField();
        cpf.setColumns(10);
        cpf.setBounds(59, 298, 175, 22);
        getContentPane().add(cpf);
        
        JButton btnNewButton_1 = new JButton("Cadastrar");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String Nome = nome.getText().trim();
        		String Endereco = endereco.getText().trim();
        		String Email = email.getText().trim();
        		String Telefone = telefone.getText().trim();
        		String Cpf = cpf.getText().trim();
        		
        		DefaultTableModel tabela = (DefaultTableModel) table.getModel();
        		tabela.addRow(new String[] {Nome, Endereco, Email, Telefone, Cpf});
        		
        		nome.setText("");
        		endereco.setText("");
        		email.setText("");
        		telefone.setText("");
        		cpf.setText("");
        		
        		nome.requestFocus();
        		
        	}
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnNewButton_1.setBounds(271, 344, 95, 28);
        getContentPane().add(btnNewButton_1);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(424, 69, 524, 308);
        getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Nome", "Endereço", "Email", "Telefone", "CPF"
        	}
        	
        	
        	
        ));
        scrollPane.setViewportView(table);
        
        JButton btnNewButton_1_1 = new JButton("Excluir");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
        	}
        });
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnNewButton_1_1.setBounds(166, 344, 95, 28);
        getContentPane().add(btnNewButton_1_1);
    }
}