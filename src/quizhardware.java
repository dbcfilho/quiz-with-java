import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class quizhardware extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[]= new String[10];
    String useranswers[]= new String[10];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, hint;

    int timer = 15;
  int ans_given = 0;
    int count = 0;
  int score = 0;
    String name;
    quizhardware() {

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

        questions[0][0] = "Qual é o componente responsável por armazenar dados temporariamente em um computador?";
        questions[0][1] = "HD";
        questions[0][2] = "SSD";
        questions[0][3] = "Memória RAM";
        questions[0][4] = "Fonte de Alimentação";

        questions[1][0] = "Qual dispositivo converte corrente alternada em corrente contínua no computador?";
        questions[1][1] = "Placa Mãe";
        questions[1][2] = "Fonte de Alimentação";
        questions[1][3] = "Processador";
        questions[1][4] = "Cooler";

        questions[2][0] = "O que é necessário verificar primeiro ao diagnosticar um computador que não liga?";
        questions[2][1] = "Placa de Vídeo";
        questions[2][2] = "Memória RAM";
        questions[2][3] = "Fonte de Alimentação";
        questions[2][4] = "SSD";

        questions[3][0] = "Qual componente é responsável pelo processamento de dados em um computador?";
        questions[3][1] = "Placa de Vídeo";
        questions[3][2] = "HD";
        questions[3][3] = "Processador (CPU)";
        questions[3][4] = "Memória RAM";

        questions[4][0] = "Qual a função da pasta térmica em um computador?";
        questions[4][1] = "Melhorar o desempenho da CPU";
        questions[4][2] = "Aumentar a velocidade do disco rígido";
        questions[4][3] = "Auxiliar na dissipação de calor da CPU";
        questions[4][4] = "Melhorar a eficiência da fonte de alimentação";

        questions[5][0] = "O que deve ser feito antes de trocar qualquer peça interna do computador?";
        questions[5][1] = "Desligar o computador e desconectar da tomada";
        questions[5][2] = "Aumentar a velocidade do cooler";
        questions[5][3] = "Formatar o HD";
        questions[5][4] = "Atualizar o sistema operacional";

        questions[6][0] = "Qual a principal função do cooler no computador?";
        questions[6][1] = "Reduzir a temperatura do processador";
        questions[6][2] = "Aumentar a velocidade do sistema";
        questions[6][3] = "Melhorar a qualidade gráfica";
        questions[6][4] = "Desligar o sistema automaticamente";

        questions[7][0] = "Como identificar um problema de superaquecimento em um computador?";
        questions[7][1] = "Desempenho reduzido e desligamentos aleatórios";
        questions[7][2] = "Impossibilidade de conectar à internet";
        questions[7][3] = "Problemas na exibição de vídeo";
        questions[7][4] = "Erro no carregamento do sistema operacional";

        questions[8][0] = "Qual a função de uma placa-mãe?";
        questions[8][1] = "Gerenciar o armazenamento de dados";
        questions[8][2] = "Controlar o fluxo de dados entre os componentes do computador";
        questions[8][3] = "Gerenciar a energia do computador";
        questions[8][4] = "Responsável pelo resfriamento do sistema";

        questions[9][0] = "Quais componentes conectam-se diretamente à placa-mãe?";
        questions[9][1] = "Processador, memória RAM e discos rígidos";
        questions[9][2] = "Monitor, teclado e mouse";
        questions[9][3] = "Impressora e scanner";
        questions[9][4] = "Fones de ouvido e microfone";

        answers[0] = "Memória RAM";
        answers[1] = "Fonte de Alimentação";
        answers[2] = "Fonte de Alimentação";
        answers[3] = "Processador (CPU)";
        answers[4] = "Auxiliar na dissipação de calor da CPU";
        answers[5] = "Desligar o computador e desconectar da tomada";
        answers[6] = "Reduzir a temperatura do processador";
        answers[7] = "Desempenho reduzido e desligamentos aleatórios";
        answers[8] = "Controlar o fluxo de dados entre os componentes do computador";
        answers[9] = "Processador, memória RAM e discos rígidos";

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
                new Score( score);
            } else {
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
        new quizhardware();
    }
}
