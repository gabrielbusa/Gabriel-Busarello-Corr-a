import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela6 extends JFrame {
	private JTextField cod;
	private JTextField produto;
	private JTextField quantidade;
    public Janela6() {
        setTitle("Janela 6");
        setSize(389, 325);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblBaixaDeEstoque = new JLabel("BAIXA DE ESTOQUE");
        lblBaixaDeEstoque.setHorizontalAlignment(SwingConstants.CENTER);
        lblBaixaDeEstoque.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblBaixaDeEstoque.setBounds(10, 21, 353, 31);
        getContentPane().add(lblBaixaDeEstoque);
        
        JLabel lblCod = new JLabel("Cod:");
        lblCod.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod.setBounds(40, 90, 37, 25);
        getContentPane().add(lblCod);
        
        cod = new JTextField();
        cod.setColumns(10);
        cod.setBounds(73, 93, 86, 20);
        getContentPane().add(cod);
        
        JLabel lblCod_1 = new JLabel("Produto:");
        lblCod_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1.setBounds(40, 136, 49, 25);
        getContentPane().add(lblCod_1);
        
        produto = new JTextField();
        produto.setColumns(10);
        produto.setBounds(96, 139, 97, 20);
        getContentPane().add(produto);
        
        JLabel lblCod_1_1 = new JLabel("Quantidade:");
        lblCod_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCod_1_1.setBounds(40, 183, 71, 25);
        getContentPane().add(lblCod_1_1);
        
        quantidade = new JTextField();
        quantidade.setColumns(10);
        quantidade.setBounds(115, 186, 97, 20);
        getContentPane().add(quantidade);
        
        JButton btnNewButton = new JButton("Concluir");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		cod.setText("");
        		produto.setText("");
        		quantidade.setText("");
        		
        		cod.requestFocus();
        		
        		
        	}
        });
        btnNewButton.setBounds(249, 234, 89, 23);
        getContentPane().add(btnNewButton);
    }
}
