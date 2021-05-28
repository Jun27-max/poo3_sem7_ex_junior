package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JanelaUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JLabel lblNome;
	private JLabel lblTipo;
	private JLabel lblEstado;

	private JTextField txtNome;

	private JRadioButton radioLigado;
	private JRadioButton radioDesligado;
	private ButtonGroup group;

	private JCheckBox checkTV;
	private JCheckBox checkSmartphone;
	private JCheckBox checkNotebook;

	private JButton btnInserir;
	private JButton btnLimpar;
	private JButton btnImprimir;

	private JTextArea areaDispositivo;
	private JScrollPane scrollDispositivo;

	public JanelaUI() {
		criarComponentes();
		ajustarPropriedadesJanela();
	}

	private void criarComponentes() {

		panel = new JPanel();

		lblNome = new JLabel(" Nome: ");
		lblTipo = new JLabel(" Tipo: ");
		lblEstado = new JLabel(" Estado: ");

		txtNome = new JTextField(10);

		radioLigado = new JRadioButton("Ligado");
		radioDesligado = new JRadioButton("Desligado");
		group = new ButtonGroup();

		checkTV = new JCheckBox("TV");
		checkSmartphone = new JCheckBox("Smartphone");
		checkNotebook = new JCheckBox("Notebook");

		btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(this);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		btnLimpar.setEnabled(false);

		btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(this);
		btnImprimir.setEnabled(false);

		areaDispositivo = new JTextArea(30, 30);
		areaDispositivo.setEditable(false);

		scrollDispositivo = new JScrollPane();
		scrollDispositivo.setViewportView(areaDispositivo);

		adicionarComponentes();

	}

	private void adicionarComponentes() {

		panel.add(lblNome);
		panel.add(txtNome);
		panel.add(lblTipo);
		panel.add(checkTV);
		panel.add(checkSmartphone);
		panel.add(checkNotebook);
		panel.add(lblEstado);
		panel.add(radioLigado);
		radioLigado.setSelected(true);
		panel.add(radioDesligado);
		group.add(radioLigado);
		group.add(radioDesligado);

		panel.add(btnInserir);
		panel.add(btnLimpar);
		panel.add(btnImprimir);

		panel.add(scrollDispositivo);

		add(panel);

	}

	private void ajustarPropriedadesJanela() {
		setVisible(true);
		setTitle("Semana 7 - Exercício");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Dispositivo dispositivo;
		String nome = txtNome.getText();
		if (e.getSource() == btnInserir) {
			dispositivo = new Dispositivo(nome);
			dispositivo.addDispositvo(nome);
		}

		if (e.getSource() == btnLimpar) {
			limpar();
		}
		
		if (e.getSource() == btnImprimir) {
			dispositivo.situacaoDosAparelhos();
		}

	}

}
