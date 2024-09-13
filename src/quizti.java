import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class quizti extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[] = new String[10];
    String useranswers[] = new String[10];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, hint;

     int timer = 15;
     int ans_given = 0;
 int count = 0;
    int score = 0;
    String name;
    quizti() {

        setBounds(50, 0, 1481, 697);
        getContentPane().setBackground(new Color(128, 255, 255));
        getContentPane().setLayout(null);

        qno = new JLabel();
        qno.setBounds(69, 142, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(qno);

        question = new JLabel();
        question.setBounds(139, 142, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(question);

        questions[0][0] = "Qual das seguintes linguagens é mais usada para desenvolvimento web?";
        questions[0][1] = "Python";
        questions[0][2] = "Java";
        questions[0][3] = "JavaScript";
        questions[0][4] = "C++";

        questions[1][0] = "Quem é conhecido como o criador do sistema operacional Linux?";
        questions[1][1] = "Bill Gates";
        questions[1][2] = "Linus Torvalds";
        questions[1][3] = "Steve Jobs";
        questions[1][4] = "Mark Zuckerberg";

        questions[2][0] = "O que significa a sigla 'HTML'?";
        questions[2][1] = "HyperText Markup Language";
        questions[2][2] = "HighText Machine Language";
        questions[2][3] = "Hyperlink Markup Language";
        questions[2][4] = "HomeTool Markup Language";

        questions[3][0] = "Qual dos seguintes é um protocolo de comunicação seguro na web?";
        questions[3][1] = "HTTP";
        questions[3][2] = "FTP";
        questions[3][3] = "SMTP";
        questions[3][4] = "HTTPS";

        questions[4][0] = "Qual tecnologia é usada para virtualização de servidores?";
        questions[4][1] = "Docker";
        questions[4][2] = "Apache";
        questions[4][3] = "Nginx";
        questions[4][4] = "PostgreSQL";

        questions[5][0] = "O que significa a sigla 'SQL'?";
        questions[5][1] = "Structured Query Language";
        questions[5][2] = "Sequential Query Language";
        questions[5][3] = "Simple Query Language";
        questions[5][4] = "Sorted Query Language";

        questions[6][0] = "Qual dos seguintes é um sistema de controle de versão?";
        questions[6][1] = "Git";
        questions[6][2] = "Node.js";
        questions[6][3] = "NPM";
        questions[6][4] = "Angular";

        questions[7][0] = "O que é 'Machine Learning'?";
        questions[7][1] = "Ensinar computadores a executar tarefas sem programação explícita";
        questions[7][2] = "Uma forma de programação tradicional";
        questions[7][3] = "Uma linguagem de programação";
        questions[7][4] = "Uma biblioteca para web development";

        questions[8][0] = "O que significa 'IoT'?";
        questions[8][1] = "Internet of Technology";
        questions[8][2] = "Internet of Things";
        questions[8][3] = "Internet of Tomorrow";
        questions[8][4] = "Internet of Telecommunication";

        questions[9][0] = "Qual é o protocolo utilizado para envio de emails?";
        questions[9][1] = "IMAP";
        questions[9][2] = "POP3";
        questions[9][3] = "SMTP";
        questions[9][4] = "HTTP";

        answers[0] = "JavaScript";
        answers[1] = "Linus Torvalds";
        answers[2] = "HyperText Markup Language";
        answers[3] = "HTTPS";
        answers[4] = "Docker";
        answers[5] = "Structured Query Language";
        answers[6] = "Git";
        answers[7] = "Ensinar computadores a executar tarefas sem programação explícita";
        answers[8] = "Internet of Things";
        answers[9] = "SMTP";

        opt1 = new JRadioButton();
        opt1.setBounds(139, 221, 558, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(139, 286, 558, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(139, 366, 558, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(139, 435, 558, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Próximo");
        next.setBounds(779, 231, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        getContentPane().add(next);

        hint = new JButton("Dica");
        hint.setBounds(779, 328, 200, 40);
        hint.setFont(new Font("Tahoma", Font.PLAIN, 22));
        hint.setBackground(new Color(30, 144, 255));
        hint.setForeground(Color.WHITE);
        hint.addActionListener(this);
        getContentPane().add(hint);

        submit = new JButton("Finalizar");
        submit.setBounds(779, 435, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        getContentPane().add(submit);

        start(count);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count]= "";
            } else {
                useranswers[count] = groupoptions.getSelection().getActionCommand();
            }
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (ae.getSource() == hint) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            hint.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count] = "";
            } else {
                useranswers[count]= groupoptions.getSelection().getActionCommand();
            }
            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i].equals(answers[i])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score( score);
        }
    }
    public void paint(Graphics g) {
        super.paint(g);

        String time = "Tempo restante - " + timer + " segundos"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Tempo acabou!!", 1100, 500);
        }
        timer--; // 14
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                    useranswers[count] = "";
                } else {
                    useranswers[count] = groupoptions.getSelection().getActionCommand();
                }
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i].equals(answers[i])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score( score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    useranswers[count] = "";
                } else {
                    useranswers[count] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
    }
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }
    public static void main(String[] args) {
        new quizti();
    }
}
