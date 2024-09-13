import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class quizso extends JFrame implements ActionListener {
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
    quizso() {

        setBounds(50, 0, 1481, 697);
        getContentPane().setBackground(new Color(0, 255, 255));
        getContentPane().setLayout(null);

        qno = new JLabel();
        qno.setBounds(69, 142, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(qno);

        question = new JLabel();
        question.setBounds(139, 142, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(question);

        questions[0][0] = "Qual é o principal propósito de um sistema operacional?";
        questions[0][1] = "Gerenciar hardware";
        questions[0][2] = "Executar programas";
        questions[0][3] = "Fornecer uma interface ao usuário";
        questions[0][4] = "Todas as alternativas anteriores";

        questions[1][0] = "Qual dos seguintes é um sistema operacional de código aberto?";
        questions[1][1] = "Windows";
        questions[1][2] = "macOS";
        questions[1][3] = "Linux";
        questions[1][4] = "iOS";

        questions[2][0] = "O que é multitarefa em um sistema operacional?";
        questions[2][1] = "Executar múltiplos processos ao mesmo tempo";
        questions[2][2] = "Ter mais de um sistema operacional instalado";
        questions[2][3] = "Rodar programas em segundo plano";
        questions[2][4] = "Conectar-se a várias redes";

        questions[3][0] = "Qual é a principal função do kernel em um sistema operacional?";
        questions[3][1] = "Gerenciar a memória e os processos";
        questions[3][2] = "Controlar dispositivos de hardware";
        questions[3][3] = "Fornecer uma interface gráfica para o usuário";
        questions[3][4] = "Atualizar o sistema automaticamente";

        questions[4][0] = "O que é uma 'thread' em termos de sistemas operacionais?";
        questions[4][1] = "Um processo leve que pode ser executado independentemente";
        questions[4][2] = "Uma conexão de rede";
        questions[4][3] = "Uma unidade de armazenamento";
        questions[4][4] = "Um arquivo de configuração";

        questions[5][0] = "Qual sistema operacional é conhecido por seu uso em dispositivos móveis?";
        questions[5][1] = "Linux";
        questions[5][2] = "Windows";
        questions[5][3] = "Android";
        questions[5][4] = "macOS";

        questions[6][0] = "Qual dos seguintes sistemas operacionais é mais usado em servidores?";
        questions[6][1] = "Windows 10";
        questions[6][2] = "Linux";
        questions[6][3] = "macOS";
        questions[6][4] = "Android";

        questions[7][0] = "O que é uma 'partição' em sistemas operacionais?";
        questions[7][1] = "Uma divisão lógica de um disco rígido";
        questions[7][2] = "Um tipo de arquivo";
        questions[7][3] = "Um programa que gerencia memória";
        questions[7][4] = "Uma configuração de rede";

        questions[8][0] = "Qual comando no Linux é usado para listar os arquivos em um diretório?";
        questions[8][1] = "cd";
        questions[8][2] = "ls";
        questions[8][3] = "mkdir";
        questions[8][4] = "rm";

        questions[9][0] = "Qual dos seguintes é um exemplo de virtualização de sistemas operacionais?";
        questions[9][1] = "Instalar múltiplos sistemas operacionais em diferentes partições";
        questions[9][2] = "Executar uma máquina virtual dentro de outro sistema operacional";
        questions[9][3] = "Fazer backup de arquivos do sistema";
        questions[9][4] = "Atualizar o sistema operacional";

        answers[0] = "Todas as alternativas anteriores";
        answers[1] = "Linux";
        answers[2] = "Executar múltiplos processos ao mesmo tempo";
        answers[3] = "Gerenciar a memória e os processos";
        answers[4] = "Um processo leve que pode ser executado independentemente";
        answers[5] = "Android";
        answers[6] = "Linux";
        answers[7] = "Uma divisão lógica de um disco rígido";
        answers[8] = "ls";
        answers[9] = "Executar uma máquina virtual dentro de outro sistema operacional";

        opt1 = new JRadioButton();
        opt1.setBounds(139, 221, 482, 30);
        opt1.setBackground(new Color(128, 255, 255));
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(139, 286, 482, 30);
        opt2.setBackground(new Color(128, 255, 255));
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(139, 359, 482, 30);
        opt3.setBackground(new Color(128, 255, 255));
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(139, 423, 482, 30);
        opt4.setBackground(new Color(128, 255, 255));
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
        next.setBackground(new Color(0, 0, 128));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        getContentPane().add(next);


        hint = new JButton("Dica");
        hint.setBounds(779, 314, 200, 40);
        hint.setFont(new Font("Tahoma", Font.PLAIN, 22));
        hint.setBackground(new Color(0, 0, 128));
        hint.setForeground(Color.WHITE);
        hint.addActionListener(this);
        getContentPane().add(hint);

        submit = new JButton("Finalizar");
        submit.setBounds(779, 402, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(0, 0, 128));
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
            new Score(score);
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
                new Score(score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    useranswers[count]= "";
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
        new quizso();
    }
}