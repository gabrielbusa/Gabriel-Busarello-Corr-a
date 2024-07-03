import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela3 extends JFrame {
	private JTextField codigo;
	private JTextField produto;
	private JTextField quantidade;
	private JTextField descricao;
    public Janela3() {
        setTitle("Janela 3");
        setSize(493, 381);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblCadastroDePeas = new JLabel("Cadastro de Peças");
        lblCadastroDePeas.setHorizontalAlignment(SwingConstants.CENTER);
        lblCadastroDePeas.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCadastroDePeas.setBounds(10, 25, 457, 25);
        getContentPane().add(lblCadastroDePeas);
        
        JLabel lblCod = new JLabel("Cod:");
        lblCod.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod.setBounds(43, 87, 37, 25);
        getContentPane().add(lblCod);
        
        codigo = new JTextField();
        codigo.setColumns(10);
        codigo.setBounds(79, 90, 86, 20);
        getContentPane().add(codigo);
        
        JLabel lblCod_1 = new JLabel("Produto:");
        lblCod_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1.setBounds(43, 144, 49, 25);
        getContentPane().add(lblCod_1);
        
        produto = new JTextField();
        produto.setColumns(10);
        produto.setBounds(103, 147, 192, 20);
        getContentPane().add(produto);
        
        JLabel lblCod_1_1 = new JLabel("Quantidade:");
        lblCod_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1_1.setBounds(43, 198, 71, 25);
        getContentPane().add(lblCod_1_1);
        
        quantidade = new JTextField();
        quantidade.setColumns(10);
        quantidade.setBounds(124, 201, 86, 20);
        getContentPane().add(quantidade);
        
        JLabel lblCod_1_1_1_1_1 = new JLabel("Descrição:");
        lblCod_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1_1_1_1_1.setBounds(43, 253, 120, 25);
        getContentPane().add(lblCod_1_1_1_1_1);
        
        descricao = new JTextField();
        descricao.setColumns(10);
        descricao.setBounds(111, 256, 251, 20);
        getContentPane().add(descricao);
        
        JButton btnNewButton_1_1 = new JButton("Cadastrar");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		codigo.setText("");
        		produto.setText("");
        		quantidade.setText("");
        		descricao.setText("");
        		
        		codigo.requestFocus();
        		
        	}
        });
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnNewButton_1_1.setBounds(340, 301, 120, 25);
        getContentPane().add(btnNewButton_1_1);
        
    }
}
      
