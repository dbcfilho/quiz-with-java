import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    JButton start, back;
    Rules() {
        getContentPane().setBackground(new Color(0, 255, 255));
        getContentPane().setLayout(null);

        JLabel heading = new JLabel("Por favor, leia as regras:");
        heading.setBounds(171, 25, 457, 30);
        heading.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
        heading.setForeground(new Color(0, 0, 128));
        getContentPane().add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. São 4 assuntos diferentes" + "<br><br>" +
                        "2. Cada assunto tem dez questões" + "<br><br>" +
                        "3. Cada questão com 4 alternativas" + "<br><br>" +
                        "4. Você tem 15 segundos para cada pergunta" + "<br><br>" +
                        "5. Só um tolo pergunta e um sábio responde (Seja sábio, não o contrário)" + "<br><br>" +
                        "6. Não fique nervoso se seu amigo estiver respondendo mais perguntas, talvez ele/ela esteja de zamzamzam" + "<br><br>" +
                        "7. Moleza, errou faz de novo" + "<br><br>" +
                        "8. Que você saiba mais do que Bill Gates, Boa sorte" + "<br><br>" +
                        "<html>"
        );

        getContentPane().add(rules);

        back = new JButton("Voltar");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(0, 0, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        getContentPane().add(back);

        start = new JButton("Começar");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(0, 0, 128));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        getContentPane().add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Option();
        } else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules();
    }
}
