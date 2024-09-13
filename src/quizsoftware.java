
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quizsoftware extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[]= new String[10];
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

    quizsoftware() {
        setBounds(50, 0, 1481, 697);
        getContentPane().setBackground(new Color(128, 255, 255));
        getContentPane().setLayout(null);

      //  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));

        qno = new JLabel();
        qno.setBounds(69, 142, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(qno);

        question = new JLabel();
        question.setBounds(139, 142, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(question);

        questions[0][0] = "O que é software?";
        questions[0][1] = "Um conjunto de instruções que o hardware executa";
        questions[0][2] = "Um dispositivo físico";
        questions[0][3] = "Um tipo de hardware";
        questions[0][4] = "Nenhuma das anteriores";

        questions[1][0] = "Qual dos seguintes é um exemplo de software de sistema?";
        questions[1][1] = "Windows";
        questions[1][2] = "Microsoft Word";
        questions[1][3] = "Adobe Photoshop";
        questions[1][4] = "Google Chrome";

        questions[2][0] = "Qual é a principal função de um software de aplicação?";
        questions[2][1] = "Ajudar o usuário a realizar tarefas específicas";
        questions[2][2] = "Controlar os recursos do sistema";
        questions[2][3] = "Gerenciar o hardware";
        questions[2][4] = "Nenhuma das anteriores";

        questions[3][0] = "O que é software de código aberto?";
        questions[3][1] = "Software cujo código-fonte está disponível para modificação";
        questions[3][2] = "Software que custa dinheiro para ser usado";
        questions[3][3] = "Software que só pode ser usado em uma única máquina";
        questions[3][4] = "Software com restrições de acesso";

        questions[4][0] = "Qual das seguintes opções NÃO é uma linguagem de programação usada no desenvolvimento de software?";
        questions[4][1] = "Python";
        questions[4][2] = "Java";
        questions[4][3] = "HTML";
        questions[4][4] = "USB";

        questions[5][0] = "Qual dos seguintes é um exemplo de software proprietário?";
        questions[5][1] = "Microsoft Office";
        questions[5][2] = "Linux";
        questions[5][3] = "GIMP";
        questions[5][4] = "LibreOffice";

        questions[6][0] = "O que significa a sigla IDE no contexto de desenvolvimento de software?";
        questions[6][1] = "Integrated Development Environment";
        questions[6][2] = "Internal Design Environment";
        questions[6][3] = "Interactive Debugging Engine";
        questions[6][4] = "Internet Data Exchange";

        questions[7][0] = "O que é um 'bug' em software?";
        questions[7][1] = "Um erro ou falha no código";
        questions[7][2] = "Uma funcionalidade extra";
        questions[7][3] = "Um tipo de hardware";
        questions[7][4] = "Um formato de arquivo";

        questions[8][0] = "O que é um repositório de código?";
        questions[8][1] = "Um local onde o código-fonte é armazenado e versionado";
        questions[8][2] = "Um tipo de software de aplicação";
        questions[8][3] = "Um tipo de programa de interface gráfica";
        questions[8][4] = "Nenhuma das anteriores";

        questions[9][0] = "O que é um 'patch' em software?";
        questions[9][1] = "Uma atualização para corrigir erros ou vulnerabilidades";
        questions[9][2] = "Um novo recurso adicionado a um software";
        questions[9][3] = "Uma nova versão de um software";
        questions[9][4] = "Uma forma de personalizar a interface";

        answers[0] = "Um conjunto de instruções que o hardware executa";
        answers[1] = "Windows";
        answers[2] = "Ajudar o usuário a realizar tarefas específicas";
        answers[3] = "Software cujo código-fonte está disponível para modificação";
        answers[4] = "USB";
        answers[5] = "Microsoft Office";
        answers[6] = "Integrated Development Environment";
        answers[7] = "Um erro ou falha no código";
        answers[8] = "Um local onde o código-fonte é armazenado e versionado";
        answers[9] = "Uma atualização para corrigir erros ou vulnerabilidades";

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
                useranswers[count] = "";
            } else {
                useranswers[count]= groupoptions.getSelection().getActionCommand();
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
                useranswers[count]= "";
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
                    useranswers[count]= "";
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
        new quizsoftware();
    }
}
