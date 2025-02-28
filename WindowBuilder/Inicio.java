import helper_classes.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Inicio extends JFrame {

    // Construtor da classe
    public Inicio() {
        montarTela();
    }

    // Método pra montar a tela
    private void montarTela() {
        setTitle("Inicio");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = criarPainelPrincipal();
        adicionarComponentesAoPainel(panel);
        add(panel);
    }

    // Cria o painel principal
    private JPanel criarPainelPrincipal() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#eeeeee"));
        return panel;
    }

    // Adiciona os componentes ao painel
    private void adicionarComponentesAoPainel(JPanel panel) {
        JLabel rotuloHome = criarRotulo("Inicio", 55, 42, 106, 23, 19);
        panel.add(rotuloHome);

        JLabel rotuloEventos = criarRotulo("Eventos", 370, 94, 62, 17, 14);
        panel.add(rotuloEventos);

        JButton botaoEventos = criarBotao("Eventos", 345, 123, 106, 28);
        botaoEventos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eventos eventosWindow = new Eventos(Inicio.this); // Passa a instância atual
                eventosWindow.setVisible(true);
                setVisible(false); // Apenas esconde, não fecha
            }
        });
        panel.add(botaoEventos);

        JLabel rotuloPalestrante = criarRotulo("Palestrante", 370, 199, 85, 17, 14);
        panel.add(rotuloPalestrante);

        JButton botaoPalestrante = criarBotao("Palestrante", 350, 229, 106, 28);
        botaoPalestrante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Palestrante palestranteWindow = new Palestrante();
                palestranteWindow.setVisible(true);
                setVisible(false);
            }
        });
        panel.add(botaoPalestrante);

        JLabel rotuloParticipante = criarRotulo("Participante", 370, 312, 106, 17, 14);
        panel.add(rotuloParticipante);

        JButton botaoParticipante = criarBotao("Participante", 350, 337, 106, 28);
        botaoParticipante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Participante participanteWindow = new Participante();
                participanteWindow.setVisible(true);
                setVisible(false);
            }
        });
        panel.add(botaoParticipante);
    }

    // Método pra criar rótulos
    private JLabel criarRotulo(String texto, int x, int y, int largura, int altura, int tamanhoFonte) {
        JLabel rotulo = new JLabel(texto);
        rotulo.setBounds(x, y, largura, altura);
        rotulo.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", tamanhoFonte));
        rotulo.setForeground(Color.decode("#1b1b1b"));
        return rotulo;
    }

    // Método pra criar botões
    private JButton criarBotao(String texto, int x, int y, int largura, int altura) {
        JButton botao = new JButton(texto);
        botao.setBounds(x, y, largura, altura);
        botao.setBackground(Color.decode("#ffffff"));
        botao.setForeground(Color.decode("#1b1b1b"));
        botao.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
        botao.setBorder(new RoundedBorder(4, Color.decode("#626262"), 1));
        botao.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(botao, Color.decode("#c2c2c2"), Color.decode("#ffffff"));
        return botao;
    }

    // Main pra iniciar o programa
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
        });
    }
}