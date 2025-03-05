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
        panel.setBackground(new Color(238, 238, 238)); // #eeeeee
        return panel;
    }

    // Adiciona os componentes ao painel
    private void adicionarComponentesAoPainel(JPanel panel) {
        JLabel rotuloHome = new JLabel("Inicio");
        rotuloHome.setBounds(55, 42, 106, 23);
        rotuloHome.setForeground(new Color(27, 27, 27)); // #1b1b1b
        panel.add(rotuloHome);

        JLabel rotuloEventos = new JLabel("Eventos");
        rotuloEventos.setBounds(370, 94, 62, 17);
        rotuloEventos.setForeground(new Color(27, 27, 27)); // #1b1b1b
        panel.add(rotuloEventos);

        JButton botaoEventos = new JButton("Eventos");
        botaoEventos.setBounds(345, 123, 106, 28);
        botaoEventos.setBackground(new Color(255, 255, 255)); // #ffffff
        botaoEventos.setForeground(new Color(27, 27, 27)); // #1b1b1b
        botaoEventos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eventos eventosWindow = new Eventos(Inicio.this); // Passa a instância atual
                eventosWindow.setVisible(true);
                setVisible(false); // Apenas esconde, não fecha
            }
        });
        panel.add(botaoEventos);

        JLabel rotuloPalestrante = new JLabel("Palestrante");
        rotuloPalestrante.setBounds(370, 199, 85, 17);
        rotuloPalestrante.setForeground(new Color(27, 27, 27)); // #1b1b1b
        panel.add(rotuloPalestrante);

        JButton botaoPalestrante = new JButton("Palestrante");
        botaoPalestrante.setBounds(350, 229, 106, 28);
        botaoPalestrante.setBackground(new Color(255, 255, 255)); // #ffffff
        botaoPalestrante.setForeground(new Color(27, 27, 27)); // #1b1b1b
        botaoPalestrante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Palestrante palestranteWindow = new Palestrante();
                palestranteWindow.setVisible(true);
                setVisible(false);
            }
        });
        panel.add(botaoPalestrante);

        JLabel rotuloParticipante = new JLabel("Participante");
        rotuloParticipante.setBounds(370, 312, 106, 17);
        rotuloParticipante.setForeground(new Color(27, 27, 27)); // #1b1b1b
        panel.add(rotuloParticipante);

        JButton botaoParticipante = new JButton("Participante");
        botaoParticipante.setBounds(350, 337, 106, 28);
        botaoParticipante.setBackground(new Color(255, 255, 255)); // #ffffff
        botaoParticipante.setForeground(new Color(27, 27, 27)); // #1b1b1b
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

    // Main pra iniciar o programa
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
        });
    }
}