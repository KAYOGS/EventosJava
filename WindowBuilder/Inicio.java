import helper_classes.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Classe Inicio é a tela principal da nossa aplicação, tipo o "menu inicial".
 * Organizei ela pra ficar simples de entender e fácil de ajustar no futuro.
 */
public class Inicio {

    public static void main(String[] args) {
        // Vamos criar e configurar a janela principal
        JFrame frame = configurarJanelaPrincipal();

        // Criamos o painel onde tudo vai ficar
        JPanel panel = criarPainelPrincipal();

        // Adicionamos os componentes da tela
        adicionarComponentesAoPainel(panel, frame);

        // Colocamos o painel na janela e mostramos ela
        frame.add(panel);
        frame.setVisible(true);
    }

    // Método pra configurar a janela principal, pra ficar tudo num lugar só
    private static JFrame configurarJanelaPrincipal() {
        JFrame frame = new JFrame("Inicio");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha tudo quando clicar no X
        frame.setSize(800, 600); // Tamanho legal pra tela
        frame.setLocationRelativeTo(null); // Centraliza na tela, fica mais bonito
        return frame;
    }

    // Cria o painel principal com as configs básica
    private static JPanel criarPainelPrincipal() {
        JPanel panel = new JPanel();
        panel.setLayout(null); // Sem layout automático por enquanto, mas seria legal usar um
        panel.setBackground(Color.decode("#eeeeee")); // Fundo clarinho, bem clean
        return panel;
    }

    // Adiciona todos os componentes (rótulos e botões) no painel
    private static void adicionarComponentesAoPainel(JPanel panel, JFrame frame) {
        // Rótulo "Home" no topo
        JLabel rotuloHome = criarRotulo("Inicio", 55, 42, 106, 23, 19);
        panel.add(rotuloHome);

        // Seção Eventos
        JLabel rotuloEventos = criarRotulo("Eventos", 370, 94, 62, 17, 14);
        panel.add(rotuloEventos);

        JButton botaoEventos = criarBotao("Eventos", 345, 123, 106, 28);
        botaoEventos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de Eventos e fecha essa
                Eventos eventosWindow = new Eventos();
                eventosWindow.setVisible(true);
                frame.dispose();
            }
        });
        panel.add(botaoEventos);

        // Seção Palestrante
        JLabel rotuloPalestrante = criarRotulo("Palestrante", 370, 199, 85, 17, 14);
        panel.add(rotuloPalestrante);

        JButton botaoPalestrante = criarBotao("Palestrante", 350, 229, 106, 28);
        botaoPalestrante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de Palestrante e fecha essa
                Palestrante palestranteWindow = new Palestrante();
                palestranteWindow.setVisible(true);
                frame.dispose();
            }
        });
        panel.add(botaoPalestrante);

        // Seção Participante
        JLabel rotuloParticipante = criarRotulo("Participante", 370, 312, 106, 17, 14);
        panel.add(rotuloParticipante);

        JButton botaoParticipante = criarBotao("Participante", 350, 337, 106, 28);
        botaoParticipante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abre a tela de Participante e fecha essa
                Participante participanteWindow = new Participante();
                participanteWindow.setVisible(true);
                frame.dispose();
            }
        });
        panel.add(botaoParticipante);
    }

    // Método pra criar rótulos com estilo padrão, pra não repetir código
    private static JLabel criarRotulo(String texto, int x, int y, int largura, int altura, int tamanhoFonte) {
        JLabel rotulo = new JLabel(texto);
        rotulo.setBounds(x, y, largura, altura);
        rotulo.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", tamanhoFonte));
        rotulo.setForeground(Color.decode("#1b1b1b")); // Cor escura pro texto
        return rotulo;
    }

    // Método pra criar botões com estilo padrão, mantendo tudo consistente
    private static JButton criarBotao(String texto, int x, int y, int largura, int altura) {
        JButton botao = new JButton(texto);
        botao.setBounds(x, y, largura, altura);
        botao.setBackground(Color.decode("#ffffff")); // Fundo branco
        botao.setForeground(Color.decode("#1b1b1b")); // Texto escuro
        botao.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
        botao.setBorder(new RoundedBorder(4, Color.decode("#626262"), 1)); // Bordas arredondadas
        botao.setFocusPainted(false); // Tira aquele contorno feio ao clicar
        OnClickEventHelper.setOnClickColor(botao, Color.decode("#c2c2c2"), Color.decode("#ffffff")); // Efeito ao clicar
        return botao;
    }
}