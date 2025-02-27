import helper_classes.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Classe Eventos é a tela de gerenciamento de eventos da nossa aplicação.
 * Fiz ela bem organizada e fácil de mexer, pensando em deixar o código limpo e
 * tranquilo de manter.
 */
public class Eventos extends JFrame {

  // Construtor
  public Eventos() {
    montarTela();
  }

  // Método separado pra montar a tela, assim fica mais fácil de entender e ajustar
  private void montarTela() {
    // Configurando a janela principal
    setTitle("Eventos");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 600);
    setLocationRelativeTo(null); 
    setResizable(false); // Deixa a janela bem no meio da tela, pra ficar bonito

    // Criando o painel principal e adicionando na janela
    JPanel panel = criarPainelPrincipal();
    add(panel);

    // Não coloquei setVisible(true) aqui porque quem chama essa tela (tipo o Inicio) decide quando ela aparece
  }

  // Monta o painel principal onde tudo acontece
  private JPanel criarPainelPrincipal() {
    JPanel panel = new JPanel();
    panel.setLayout(null); // Por enquanto, sem layout automático, mas seria legal usar um no futuro
    panel.setBackground(Color.decode("#3C3F41")); // Fundo escuro pra dar aquele charme

    // Adicionando os pedaços da tela
    adicionarCabecalho(panel);
    adicionarTabela(panel); // Nova tabela adicionada aqui
    adicionarCamposDeEntrada(panel);
    adicionarBotoesDeAcao(panel);

    return panel;
  }

  // Coloca o cabeçalho com título e busca de palestrante
  private void adicionarCabecalho(JPanel panel) {
    JLabel titulo = criarEtiqueta("Eventos", 60, 38, 106, 22, 18, "#D9D9D9");
    panel.add(titulo);

    JLabel etiquetaPalestrante = criarEtiqueta("Palestrante:", 370, 37, 82, 17, 14, "#D9D9D9");
    panel.add(etiquetaPalestrante);

    JTextField campoPalestrante = criarCampoTexto("", 460, 35, 252, 21, "Palestrante");
    panel.add(campoPalestrante);

    JButton botaoVisualizar = criarBotao("Visualizar", 180, 370, 106, 28);
    panel.add(botaoVisualizar);
  }

  // Adiciona a tabela pra exibir os eventos
  private void adicionarTabela(JPanel panel) {
    // Definindo as colunas da tabela
    String[] colunas = {"Nome", "Data", "Local", "Descrição", "Palestrante"};
    DefaultTableModel modelo = new DefaultTableModel(colunas, 0); // Modelo sem linhas iniciais

    JTable tabela = new JTable(modelo);
    tabela.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 12));
    tabela.setBackground(Color.decode("#B2B2B2"));
    tabela.setForeground(Color.decode("#353535"));
    tabela.setRowHeight(25);
    tabela.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    tabela.setShowGrid(false); // Remove as linhas de grade pra ficar mais clean

    // Ajustando largura das colunas (opcional, pode ajustar conforme o design)
    tabela.getColumnModel().getColumn(0).setPreferredWidth(150); // Nome
    tabela.getColumnModel().getColumn(1).setPreferredWidth(80);  // Data
    tabela.getColumnModel().getColumn(2).setPreferredWidth(100); // Local
    tabela.getColumnModel().getColumn(3).setPreferredWidth(200); // Descrição
    tabela.getColumnModel().getColumn(4).setPreferredWidth(150); // Palestrante

    // Adicionando a tabela dentro de um JScrollPane pra rolagem
    JScrollPane scrollPane = new JScrollPane(tabela);
    scrollPane.setBounds(50, 80, 700, 270); // Posição e tamanho da tabela
    scrollPane.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    scrollPane.getViewport().setBackground(Color.decode("#B2B2B2"));

    panel.add(scrollPane);
  }

  // Adiciona os campos pra preencher os dados do evento
  private void adicionarCamposDeEntrada(JPanel panel) {
    // Descrição
    JLabel etiquetaDescricao = criarEtiqueta("Descrição", 51, 425, 106, 17, 14, "#D9D9D9");
    panel.add(etiquetaDescricao);

    JTextArea areaDescricao = criarAreaTexto("", 52, 450, 335, 60, "Descrição");
    panel.add(areaDescricao);

    // Nome
    JLabel etiquetaNome = criarEtiqueta("Nome:", 392, 452, 45, 17, 14, "#D9D9D9");
    panel.add(etiquetaNome);

    JTextField campoNome = criarCampoTexto("", 440, 450, 292, 21, "Nome");
    panel.add(campoNome);

    // Data
    JLabel etiquetaData = criarEtiqueta("Data:", 400, 491, 40, 17, 14, "#D9D9D9");
    panel.add(etiquetaData);

    JTextField campoData = criarCampoTexto("", 440, 489, 100, 21, "Data");
    panel.add(campoData);

    // Local
    JLabel etiquetaLocal = criarEtiqueta("Local:", 548, 491, 43, 17, 14, "#D9D9D9");
    panel.add(etiquetaLocal);

    JTextField campoLocal = criarCampoTexto("", 592, 489, 140, 21, "Local");
    panel.add(campoLocal);
  }

  // Coloca os botões de ação (Cadastrar, Atualizar, Cancelar)
  private void adicionarBotoesDeAcao(JPanel panel) {
    JButton botaoCadastrar = criarBotao("Cadastrar", 294, 370, 106, 28);
    panel.add(botaoCadastrar);

    JButton botaoAtualizar = criarBotao("Atualizar", 407, 370, 106, 28);
    panel.add(botaoAtualizar);

    JButton botaoCancelar = criarBotao("Cancelar", 520, 370, 106, 28);
    panel.add(botaoCancelar);
  }

  // Método pra criar etiquetas padronizadas, pra não ficar repetindo código
  private JLabel criarEtiqueta(String texto, int x, int y, int largura, int altura, int tamanhoFonte, String cor) {
    JLabel etiqueta = new JLabel(texto);
    etiqueta.setBounds(x, y, largura, altura);
    etiqueta.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", tamanhoFonte));
    etiqueta.setForeground(Color.decode(cor));
    return etiqueta;
  }

  // Método pra criar campos de texto bonitinhos e consistentes
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

  // Método pra criar a área de texto maior, tipo pra descrição
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

  // Método pra criar botões com o mesmo estilo, sem bagunça
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

  // Sobrescrevendo o setVisible pra funcionar direitinho quando chamarem de fora
  @Override
  public void setVisible(boolean visivel) {
    super.setVisible(visivel);
  }
}