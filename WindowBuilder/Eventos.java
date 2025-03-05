import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Eventos extends JFrame {

    private Inicio telaInicio; // Referência pra tela Inicio (assumindo que Inicio existe)

    // Construtor ajustado pra receber a tela Inicio
    public Eventos(Inicio telaInicio) {
        this.telaInicio = telaInicio;
        montarTela();
    }

    private void montarTela() {
        setTitle("Eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = criarPainelPrincipal();
        add(panel);
    }

    private JPanel criarPainelPrincipal() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(60, 63, 65)); // #3C3F41

        adicionarCabecalho(panel);
        adicionarTabela(panel);
        adicionarCamposDeEntrada(panel);
        adicionarBotoesDeAcao(panel);

        return panel;
    }

    private void adicionarCabecalho(JPanel panel) {
        JLabel titulo = new JLabel("Eventos");
        titulo.setBounds(48, 38, 106, 22);
        titulo.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(titulo);

        JLabel etiquetaPalestrante = new JLabel("Palestrante:");
        etiquetaPalestrante.setBounds(370, 37, 82, 17);
        etiquetaPalestrante.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaPalestrante);

        JTextField campoPalestrante = new JTextField();
        campoPalestrante.setBounds(460, 35, 275, 21);
        campoPalestrante.setBackground(new Color(178, 178, 178)); // #B2B2B2
        campoPalestrante.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(campoPalestrante);

        JButton botaoVisualizar = new JButton("Visualizar");
        botaoVisualizar.setBounds(180, 370, 106, 28);
        botaoVisualizar.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoVisualizar.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(botaoVisualizar);
    }

    private void adicionarTabela(JPanel panel) {
        String[] colunas = {"Nome", "Data", "Local", "Descrição", "Palestrante"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        JTable tabela = new JTable(modelo);
        tabela.setBackground(new Color(178, 178, 178)); // #B2B2B2
        tabela.setForeground(new Color(53, 53, 53)); // #353535
        tabela.setRowHeight(25);

        tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(150);

        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(50, 80, 685, 270);
        scrollPane.getViewport().setBackground(new Color(178, 178, 178)); // #B2B2B2
        panel.add(scrollPane);
    }

    private void adicionarCamposDeEntrada(JPanel panel) {
        JLabel etiquetaDescricao = new JLabel("Descrição");
        etiquetaDescricao.setBounds(51, 425, 106, 17);
        etiquetaDescricao.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaDescricao);

        JTextArea areaDescricao = new JTextArea();
        areaDescricao.setBounds(52, 450, 335, 60);
        areaDescricao.setBackground(new Color(178, 178, 178)); // #B2B2B2
        areaDescricao.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(areaDescricao);

        JLabel etiquetaNome = new JLabel("Nome:");
        etiquetaNome.setBounds(392, 452, 45, 17);
        etiquetaNome.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaNome);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(440, 450, 292, 21);
        campoNome.setBackground(new Color(178, 178, 178)); // #B2B2B2
        campoNome.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(campoNome);

        JLabel etiquetaData = new JLabel("Data:");
        etiquetaData.setBounds(400, 491, 40, 17);
        etiquetaData.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaData);

        JTextField campoData = new JTextField();
        campoData.setBounds(440, 489, 100, 21);
        campoData.setBackground(new Color(178, 178, 178)); // #B2B2B2
        campoData.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(campoData);

        JLabel etiquetaLocal = new JLabel("Local:");
        etiquetaLocal.setBounds(548, 491, 43, 17);
        etiquetaLocal.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaLocal);

        JTextField campoLocal = new JTextField();
        campoLocal.setBounds(592, 489, 140, 21);
        campoLocal.setBackground(new Color(178, 178, 178)); // #B2B2B2
        campoLocal.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(campoLocal);
    }

    private void adicionarBotoesDeAcao(JPanel panel) {
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(294, 370, 106, 28);
        botaoCadastrar.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoCadastrar.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(botaoCadastrar);

        JButton botaoAtualizar = new JButton("Atualizar");
        botaoAtualizar.setBounds(407, 370, 106, 28);
        botaoAtualizar.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoAtualizar.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(botaoAtualizar);

        JButton botaoCancelar = new JButton("Apagar");
        botaoCancelar.setBounds(520, 370, 106, 28);
        botaoCancelar.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoCancelar.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(botaoCancelar);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(633, 370, 103, 28);
        botaoVoltar.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoVoltar.setForeground(new Color(217, 217, 217)); // #D9D9D9
        botaoVoltar.addActionListener(e -> {
            setVisible(false); // Esconde a tela Eventos
            telaInicio.setVisible(true); // Reabre a tela Inicio original
        });
        panel.add(botaoVoltar);
    }

    @Override
    public void setVisible(boolean visivel) {
        super.setVisible(visivel);
    }

    // Método main para testar
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Inicio inicio = new Inicio(); // Assumindo que Inicio existe
            Eventos eventos = new Eventos(inicio);
            eventos.setVisible(true);
        });
    }
}