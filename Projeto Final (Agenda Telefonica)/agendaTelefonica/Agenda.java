package agendaTelefonica;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;

public class Agenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pLista, pEdicao, pBotao;
	private JLabel labNome, labTelefone, labDetalhes;
	private JTextField txtNome;
	private JFormattedTextField txtTelefone;
	private MaskFormatter mscTel;
	private JTextArea txtDetalhes;
	private JButton btnAdicionar , btnDeletar , btnAtualizar, btnLimpar;
	private JScrollPane spane;
	private JList<Contatos> list;
	
	private DefaultListModel<Contatos> model;
	
	public Agenda(){
		this.setTitle("AGENDA");
		this.setLayout(null);
		this.setSize(520, 250);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.janela();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void janela(){
		
		//======================== PAINEL DE LISTAS ========================
		pLista = new JPanel();
		pLista.setBounds(10, 10, 200, 220);
		pLista.setLayout(null);
		
		model = new DefaultListModel<>();
		list = new JList<>();
		list.setModel(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);
        
        list.getSelectionModel().addListSelectionListener(e -> {
        	Contatos c = list.getSelectedValue();
        	txtNome.setText(c.getNome());
        	txtTelefone.setText(c.getNumero());
        	txtDetalhes.setText(c.getDetalhes());
        	
        });
        
        spane = new JScrollPane(list);
        spane.setBounds(0,0,185,195);
        pLista.add(spane);
        		
        add(pLista);
		
        //======================== PAINEL DE EDICAO ========================
		pEdicao = new JPanel();
		pEdicao.setBounds(210, 10, 300, 140);
		pEdicao.setLayout(null);

		labNome = new JLabel("Nome: ");
		labNome.setBounds(0,5,60,20);
		pEdicao.add(labNome);
		txtNome = new JTextField();
		txtNome.setBounds(45,5,230,20);
		pEdicao.add(txtNome);
		

		try {
			mscTel = new MaskFormatter("(##) ##### - ####");
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
		labTelefone = new JLabel("Telefone: ");
		labTelefone.setBounds(0,30,60,20);
		pEdicao.add(labTelefone);
		txtTelefone = new JFormattedTextField(mscTel);
		txtTelefone.setBounds(60,30,215,20);
		pEdicao.add(txtTelefone);
		
		labDetalhes = new JLabel("Detalhes: ");
		labDetalhes.setBounds(0,60,60,20);
		pEdicao.add(labDetalhes);
		txtDetalhes = new JTextArea();
		txtDetalhes.setLineWrap(true);
		txtDetalhes.setBounds(60,60,215,60);
		pEdicao.add(txtDetalhes);

		
		add(pEdicao);
		
		//======================== PAINEL DE BOTOES ========================
		pBotao = new JPanel();
		pBotao.setBounds(210, 150, 300, 60);
		pBotao.setLayout(null);
		
		//============ BOTAO ADICIONAR ============
		btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds (5,5,90,20);
        btnAdicionar.addActionListener(e -> {
            Limpar();
            txtDetalhes.addFocusListener(new FocusListener() {
												
				@Override
				public void focusGained(FocusEvent e) {
				}

				@Override
				public void focusLost(FocusEvent e) {
					model.addElement(new Contatos(txtNome.getText(),txtTelefone.getText(),txtDetalhes.getText()));
					Limpar();
				}
			});
		});
        pBotao.add(btnAdicionar);
        
        //============ BOTAO DELETAR ============
        btnDeletar = new JButton("Remover");
        btnDeletar.setBounds (100,5,90,20);
        btnDeletar.addActionListener(e1 -> {
        	int pos = list.getSelectedIndex();
        	model.removeElementAt(pos);
        	model.clear();
        	Limpar();
        });
        pBotao.add(btnDeletar);
        
        //============ BOTAO ATUALIZAR ============
        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds (195,5,85,20);
        btnAtualizar.addActionListener(e2 -> {
        	int pos = list.getSelectedIndex();
        	txtDetalhes.addFocusListener(new FocusListener() {
				
				@Override	
				public void focusGained(FocusEvent e) {
				}

				@Override
				public void focusLost(FocusEvent e) {
					model.set(pos, new Contatos(txtNome.getText(),txtTelefone.getText(),txtDetalhes.getText()));
					Limpar();
				}
			});
        });
        pBotao.add(btnAtualizar);
        
        //============ BOTAO LIMPAR ============
        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(5,30,275,20);
        btnLimpar.addActionListener(e -> {
        	Limpar();
        });
        pBotao.add(btnLimpar);
	
        add(pBotao);
	}
	//======================== FUNCAO DE LIMPAR AS CAIXAS ========================
	private void Limpar() {
		txtNome.setText("");
		txtTelefone.setText("");
		txtDetalhes.setText("");
	}

	public static void main(String[] args) {
		Agenda janela = new Agenda();
	    janela.setVisible(true);	
	}



	public class Contatos {
		private String nome;
		private String numero;
		private String detalhes;
		
		public Contatos(String nome, String numero, String detalhes) {
			this.nome = nome;
			this.numero = numero;
			this.detalhes = detalhes;
		}
	
		public String getNome() {
			return nome;
		}
		public String getNumero() {
			return numero;
		}
		public String getDetalhes() {
			return detalhes;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public void setDetalhes(String detalhes) {
			this.detalhes = detalhes;
		}
		
		@Override
		public String toString() {
			return nome;
		}
		
	}
}