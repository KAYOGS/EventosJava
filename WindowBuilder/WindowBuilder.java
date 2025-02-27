import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(938, 507);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JLabel element1 = new JLabel("Palestrante");
     element1.setBounds(55, 35, 106, 20);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 18));
     element1.setForeground(Color.decode("#D9D9D9"));
     panel.add(element1);

     JLabel element2 = new JLabel("Curriculo");
     element2.setBounds(54, 348, 66, 17);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element2.setForeground(Color.decode("#D9D9D9"));
     panel.add(element2);

     JTextArea element3 = new JTextArea("");
     element3.setBounds(56, 371, 346, 55);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element3.setBackground(Color.decode("#B2B2B2"));
     element3.setForeground(Color.decode("#656565"));
     element3.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element3, "Curriculo", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element3);

     JLabel element4 = new JLabel("Nome:");
     element4.setBounds(442, 373, 42, 17);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element4.setForeground(Color.decode("#D9D9D9"));
     panel.add(element4);

     JTextField element5 = new JTextField("");
     element5.setBounds(487, 370, 373, 21);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element5.setBackground(Color.decode("#B2B2B2"));
     element5.setForeground(Color.decode("#656565"));
     element5.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element5, "Nome", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element5);

     JLabel element6 = new JLabel("Eventos:");
     element6.setBounds(428, 409, 55, 17);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element6.setForeground(Color.decode("#D9D9D9"));
     panel.add(element6);

     JTextField element7 = new JTextField("");
     element7.setBounds(489, 406, 373, 21);
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element7.setBackground(Color.decode("#B2B2B2"));
     element7.setForeground(Color.decode("#656565"));
     element7.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element7, "Eventos", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element7);

     JLabel element8 = new JLabel("Área de atuação:");
     element8.setBounds(551, 40, 106, 17);
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element8.setForeground(Color.decode("#D9D9D9"));
     panel.add(element8);

     JTextField element9 = new JTextField("");
     element9.setBounds(659, 36, 201, 21);
     element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element9.setBackground(Color.decode("#B2B2B2"));
     element9.setForeground(Color.decode("#656565"));
     element9.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element9, "Área de atuação", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element9);

     JButton element10 = new JButton("Cadastrar");
     element10.setBounds(514, 330, 106, 28);
     element10.setBackground(Color.decode("#2e2e2e"));
     element10.setForeground(Color.decode("#D9D9D9"));
     element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element10.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element10.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element10, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element10);

     JButton element11 = new JButton("Atualizar");
     element11.setBounds(634, 330, 106, 28);
     element11.setBackground(Color.decode("#2e2e2e"));
     element11.setForeground(Color.decode("#D9D9D9"));
     element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element11.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element11.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element11, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element11);

     JButton element12 = new JButton("Excluir");
     element12.setBounds(753, 329, 106, 28);
     element12.setBackground(Color.decode("#2e2e2e"));
     element12.setForeground(Color.decode("#D9D9D9"));
     element12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element12.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element12.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element12, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element12);

     JButton element13 = new JButton("Visualizar");
     element13.setBounds(293, 329, 106, 28);
     element13.setBackground(Color.decode("#2e2e2e"));
     element13.setForeground(Color.decode("#D9D9D9"));
     element13.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element13.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element13.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element13, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element13);

     frame.add(panel);
     frame.setVisible(true);

  }
}