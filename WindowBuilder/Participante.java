
import helper_classes.*;
import java.awt.Color;
import javax.swing.*;

/**
 * Classe Participante é a tela onde gerenciamos os dados dos participantes.
 * Organizei tudo pra ficar simples de entender e fácil de ajustar quando
 * precisar.
 */
public class Participante extends JFrame {

    // Construtor
    public Participante() {
        montarTela();
    }

    // Método pra montar a tela, separando a bagunça do construtor
    private void montarTela() {
        // Configurando a janela principal
        setTitle("Participante"); // Nome mais direto pro contexto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(938, 507);
        setLocationRelativeTo(null); // Centraliza a janela na tela, fica mais simpático

        // Criando o painel principal
        JPanel panel = criarPainelPrincipal();
        add(panel);

        // Não coloco setVisible(true) aqui, deixo quem chamar a classe decidir
    }

    // Cria o painel principal com as configs básicas
    private JPanel criarPainelPrincipal() {
        JPanel panel = new JPanel();
        panel.setLayout(null); // Sem layout automático por agora, mas seria legal usar um no futuro
        panel.setBackground(Color.decode("#1e1e1e")); // Fundo escuro pra dar aquele estilo

        // Adicionando os componentes
        adicionarCabecalho(panel);
        adicionarCamposDeEntrada(panel);
        adicionarBotoesDeAcao(panel);

        return panel;
    }

    // Adiciona o cabeçalho com título e área de atuação
    private void adicionarCabecalho(JPanel panel) {
        JLabel titulo = criarEtiqueta("Participante", 55, 35, 106, 20, 18, "#D9D9D9");
        panel.add(titulo);

        JLabel etiquetaAreaAtuacao = criarEtiqueta("Área de atuação:", 551, 40, 106, 17, 14, "#D9D9D9");
        panel.add(etiquetaAreaAtuacao);

        JTextField campoAreaAtuacao = criarCampoTexto("", 659, 36, 201, 21, "Área de atuação");
        panel.add(campoAreaAtuacao);
    }

    // Adiciona os campos de entrada pra preencher os dados
    private void adicionarCamposDeEntrada(JPanel panel) {
        // Currículo
        JLabel etiquetaCurriculo = criarEtiqueta("Currículo", 54, 348, 66, 17, 14, "#D9D9D9");
        panel.add(etiquetaCurriculo);

        JTextArea areaCurriculo = criarAreaTexto("", 56, 371, 346, 55, "Currículo");
        panel.add(areaCurriculo);

        // Nome
        JLabel etiquetaNome = criarEtiqueta("Nome:", 442, 373, 42, 17, 14, "#D9D9D9");
        panel.add(etiquetaNome);

        JTextField campoNome = criarCampoTexto("", 487, 370, 373, 21, "Nome");
        panel.add(campoNome);

        // Eventos
        JLabel etiquetaEventos = criarEtiqueta("Eventos:", 428, 409, 55, 17, 14, "#D9D9D9");
        panel.add(etiquetaEventos);

        JTextField campoEventos = criarCampoTexto("", 489, 406, 373, 21, "Eventos");
        panel.add(campoEventos);
    }

    // Adiciona os botões de ação (Visualizar, Cadastrar, Atualizar, Excluir)
    private void adicionarBotoesDeAcao(JPanel panel) {
        JButton botaoVisualizar = criarBotao("Visualizar", 293, 329, 106, 28);
        panel.add(botaoVisualizar);

        JButton botaoCadastrar = criarBotao("Cadastrar", 514, 330, 106, 28);
        panel.add(botaoCadastrar);

        JButton botaoAtualizar = criarBotao("Atualizar", 634, 330, 106, 28);
        panel.add(botaoAtualizar);

        JButton botaoExcluir = criarBotao("Excluir", 753, 329, 106, 28);
        panel.add(botaoExcluir);
    }

    // Método pra criar etiquetas com estilo padrão, pra não repetir código
    private JLabel criarEtiqueta(String texto, int x, int y, int largura, int altura, int tamanhoFonte, String cor) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, largura, altura);
        etiqueta.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", tamanhoFonte));
        etiqueta.setForeground(Color.decode(cor));
        return etiqueta;
    }

    // Método pra criar campos de texto com estilo consistente
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

    // Método pra criar área de texto maior, como pro currículo
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

    // Método pra criar botões com estilo padrão, mantendo tudo organizado
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

    // Sobrescreve o setVisible pra funcionar quando chamarem de fora
    @Override
    public void setVisible(boolean visivel) {
        super.setVisible(visivel);
    }
}
