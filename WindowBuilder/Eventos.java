import helper_classes.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Eventos extends JFrame {

    private Inicio telaInicio; // Referência pra tela Inicio

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
        panel.setBackground(Color.decode("#3C3F41"));

        adicionarCabecalho(panel);
        adicionarTabela(panel);
        adicionarCamposDeEntrada(panel);
        adicionarBotoesDeAcao(panel);

        return panel;
    }

    private void adicionarCabecalho(JPanel panel) {
        JLabel titulo = criarEtiqueta("Eventos", 48, 38, 106, 22, 18, "#D9D9D9");
        panel.add(titulo);

        JLabel etiquetaPalestrante = criarEtiqueta("Palestrante:", 370, 37, 82, 17, 14, "#D9D9D9");
        panel.add(etiquetaPalestrante);

        JTextField campoPalestrante = criarCampoTexto("", 460, 35, 275, 21, "Palestrante");
        panel.add(campoPalestrante);

        JButton botaoVisualizar = criarBotao("Visualizar", 180, 370, 106, 28);
        panel.add(botaoVisualizar);
    }

    private void adicionarTabela(JPanel panel) {
        String[] colunas = {"Nome", "Data", "Local", "Descrição", "Palestrante"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        JTable tabela = new JTable(modelo);
        tabela.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 12));
        tabela.setBackground(Color.decode("#B2B2B2"));
        tabela.setForeground(Color.decode("#353535"));
        tabela.setRowHeight(25);
        tabela.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
        tabela.setShowGrid(false);

        tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(150);

        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(50, 80, 685, 270);
        scrollPane.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
        scrollPane.getViewport().setBackground(Color.decode("#B2B2B2"));
        panel.add(scrollPane);
    }

    private void adicionarCamposDeEntrada(JPanel panel) {
        JLabel etiquetaDescricao = criarEtiqueta("Descrição", 51, 425, 106, 17, 14, "#D9D9D9");
        panel.add(etiquetaDescricao);

        JTextArea areaDescricao = criarAreaTexto("", 52, 450, 335, 60, "Descrição");
        panel.add(areaDescricao);

        JLabel etiquetaNome = criarEtiqueta("Nome:", 392, 452, 45, 17, 14, "#D9D9D9");
        panel.add(etiquetaNome);

        JTextField campoNome = criarCampoTexto("", 440, 450, 292, 21, "Nome");
        panel.add(campoNome);

        JLabel etiquetaData = criarEtiqueta("Data:", 400, 491, 40, 17, 14, "#D9D9D9");
        panel.add(etiquetaData);

        JTextField campoData = criarCampoTexto("", 440, 489, 100, 21, "Data");
        panel.add(campoData);

        JLabel etiquetaLocal = criarEtiqueta("Local:", 548, 491, 43, 17, 14, "#D9D9D9");
        panel.add(etiquetaLocal);

        JTextField campoLocal = criarCampoTexto("", 592, 489, 140, 21, "Local");
        panel.add(campoLocal);
    }

    private void adicionarBotoesDeAcao(JPanel panel) {
        JButton botaoCadastrar = criarBotao("Cadastrar", 294, 370, 106, 28);
        panel.add(botaoCadastrar);

        JButton botaoAtualizar = criarBotao("Atualizar", 407, 370, 106, 28);
        panel.add(botaoAtualizar);

        JButton botaoCancelar = criarBotao("Cancelar", 520, 370, 106, 28);
        panel.add(botaoCancelar);

        // Botão Voltar ajustado
        JButton botaoVoltar = criarBotao("Voltar", 633, 370, 103, 28);
        botaoVoltar.addActionListener(e -> {
            setVisible(false); // Esconde a tela Eventos
            telaInicio.setVisible(true); // Reabre a tela Inicio original
        });
        panel.add(botaoVoltar);
    }

    private JLabel criarEtiqueta(String texto, int x, int y, int largura, int altura, int tamanhoFonte, String cor) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, largura, altura);
        etiqueta.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", tamanhoFonte));
        etiqueta.setForeground(Color.decode(cor));
        return etiqueta;
    }

    private JTextField criarCampoTexto(String texto, int x, int y, int largura, int altura, String placeholder) {
        JTextField campo = new JTextField(texto);
        campo.setBounds(x, y, largura, altura);
        campo.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        campo.setBackground(Color.decode("#B2B2B2"));
        campo.setForeground(Color.decode("#656565"));
        campo.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
        OnFocusEventHelper.setOnFocusText(campo, placeholder, Color.decode("#353535"), Color.decode("#656565"));
        return campo;
    }

    private JTextArea criarAreaTexto(String texto, int x, int y, int largura, int altura, String placeholder) {
        JTextArea area = new JTextArea(texto);
        area.setBounds(x, y, largura, altura);
        area.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        area.setBackground(Color.decode("#B2B2B2"));
        area.setForeground(Color.decode("#656565"));
        area.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
        OnFocusEventHelper.setOnFocusText(area, placeholder, Color.decode("#353535"), Color.decode("#656565"));
        return area;
    }

    private JButton criarBotao(String texto, int x, int y, int largura, int altura) {
        JButton botao = new JButton(texto);
        botao.setBounds(x, y, largura, altura);
        botao.setBackground(Color.decode("#2e2e2e"));
        botao.setForeground(Color.decode("#D9D9D9"));
        botao.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
        botao.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        botao.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(botao, Color.decode("#232323"), Color.decode("#2e2e2e"));
        return botao;
    }

    @Override
    public void setVisible(boolean visivel) {
        super.setVisible(visivel);
    }
}