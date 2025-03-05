import java.awt.Color;
import javax.swing.*;

public class Participante extends JFrame {

    // Construtor
    public Participante() {
        montarTela();
    }

    // Método pra montar a tela
    private void montarTela() {
        setTitle("Participante");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(938, 507);
        setLocationRelativeTo(null);

        JPanel panel = criarPainelPrincipal();
        add(panel);
    }

    // Cria o painel principal
    private JPanel criarPainelPrincipal() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(30, 30, 30)); // #1e1e1e
        return panel;
    }

    // Adiciona o cabeçalho
    private void adicionarCabecalho(JPanel panel) {
        JLabel titulo = new JLabel("Participante");
        titulo.setBounds(55, 35, 106, 20);
        titulo.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(titulo);

        JLabel etiquetaAreaAtuacao = new JLabel("Área de atuação:");
        etiquetaAreaAtuacao.setBounds(551, 40, 106, 17);
        etiquetaAreaAtuacao.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaAreaAtuacao);

        JTextField campoAreaAtuacao = new JTextField();
        campoAreaAtuacao.setBounds(659, 36, 201, 21);
        campoAreaAtuacao.setBackground(new Color(178, 178, 178)); // #B2B2B2
        campoAreaAtuacao.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(campoAreaAtuacao);
    }

    // Adiciona os campos de entrada
    private void adicionarCamposDeEntrada(JPanel panel) {
        JLabel etiquetaCurriculo = new JLabel("Currículo");
        etiquetaCurriculo.setBounds(54, 348, 66, 17);
        etiquetaCurriculo.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaCurriculo);

        JTextArea areaCurriculo = new JTextArea();
        areaCurriculo.setBounds(56, 371, 346, 55);
        areaCurriculo.setBackground(new Color(178, 178, 178)); // #B2B2B2
        areaCurriculo.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(areaCurriculo);

        JLabel etiquetaNome = new JLabel("Nome:");
        etiquetaNome.setBounds(442, 373, 42, 17);
        etiquetaNome.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaNome);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(487, 370, 373, 21);
        campoNome.setBackground(new Color(178, 178, 178)); // #B2B2B2
        campoNome.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(campoNome);

        JLabel etiquetaEventos = new JLabel("Eventos:");
        etiquetaEventos.setBounds(428, 409, 55, 17);
        etiquetaEventos.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(etiquetaEventos);

        JTextField campoEventos = new JTextField();
        campoEventos.setBounds(489, 406, 373, 21);
        campoEventos.setBackground(new Color(178, 178, 178)); // #B2B2B2
        campoEventos.setForeground(new Color(101, 101, 101)); // #656565
        panel.add(campoEventos);
    }

    // Adiciona os botões de ação
    private void adicionarBotoesDeAcao(JPanel panel) {
        JButton botaoVisualizar = new JButton("Visualizar");
        botaoVisualizar.setBounds(293, 329, 106, 28);
        botaoVisualizar.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoVisualizar.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(botaoVisualizar);

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(514, 330, 106, 28);
        botaoCadastrar.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoCadastrar.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(botaoCadastrar);

        JButton botaoAtualizar = new JButton("Atualizar");
        botaoAtualizar.setBounds(634, 330, 106, 28);
        botaoAtualizar.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoAtualizar.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(botaoAtualizar);

        JButton botaoExcluir = new JButton("Excluir");
        botaoExcluir.setBounds(753, 329, 106, 28);
        botaoExcluir.setBackground(new Color(46, 46, 46)); // #2e2e2e
        botaoExcluir.setForeground(new Color(217, 217, 217)); // #D9D9D9
        panel.add(botaoExcluir);
    }

    @Override
    public void setVisible(boolean visivel) {
        super.setVisible(visivel);
    }

    // Método main para testar (opcional)
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Participante participante = new Participante();
            participante.setVisible(true);
        });
    }
}