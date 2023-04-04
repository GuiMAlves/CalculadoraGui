import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.preparatelaJFormattedTextField();
    }
    private void preparatelaJFormattedTextField() {
        Container janela = getContentPane();
        janela.setLayout(null);
        setTitle("Calculadora");

        JTextField txtVisor = new JTextField();
        txtVisor.setBounds(10,10,207,40);
        janela.add(txtVisor);

        JButton num7 = new JButton("7");
        num7.setBounds(10,50,50,50);
        janela.add(num7);
        num7.addActionListener(new Comportamento(num7, txtVisor));
        JButton num8 = new JButton("8");
        num8.setBounds(62,50,50,50);
        janela.add(num8);
        num8.addActionListener(new Comportamento(num8, txtVisor));
        JButton num9 = new JButton("9");
        num9.setBounds(114,50,50,50);
        janela.add(num9);
        num9.addActionListener(new Comportamento(num9, txtVisor));
        JButton div = new JButton("/");
        div.setBounds(166,50,50,50);
        janela.add(div);
        div.addActionListener(new Comportamento(div, txtVisor));
        JButton num4 = new JButton("4");
        num4.setBounds(10,101,50,50);
        janela.add(num4);
        num4.addActionListener(new Comportamento(num4, txtVisor));
        JButton num5 = new JButton("5");
        num5.setBounds(62,101,50,50);
        janela.add(num5);
        num5.addActionListener(new Comportamento(num5, txtVisor));
        JButton num6 = new JButton("6");
        num6.setBounds(114,101,50,50);
        janela.add(num6);
        num6.addActionListener(new Comportamento(num6, txtVisor));
        JButton mult = new JButton("*");
        mult.setBounds(166,101,50,50);
        janela.add(mult);
        mult.addActionListener(new Comportamento(mult, txtVisor));
        JButton num1 = new JButton("1");
        num1.setBounds(10,152,50,50);
        janela.add(num1);
        num1.addActionListener(new Comportamento(num1, txtVisor));
        JButton num2 = new JButton("2");
        num2.setBounds(62,152,50,50);
        janela.add(num2);
        num2.addActionListener(new Comportamento(num2, txtVisor));
        JButton num3 = new JButton("3");
        num3.setBounds(114,152,50,50);
        janela.add(num3);
        num3.addActionListener(new Comportamento(num3, txtVisor));
        JButton sub = new JButton("-");
        sub.setBounds(166,152,50,50);
        janela.add(sub);
        sub.addActionListener(new Comportamento(sub, txtVisor));
        JButton num0 = new JButton("0");
        num0.setBounds(10,203,50,50);
        janela.add(num0);
        num0.addActionListener(new Comportamento(num0, txtVisor));
        JButton pto = new JButton(".");
        pto.setBounds(62,203,50,50);
        janela.add(pto);
        pto.addActionListener(new Comportamento(pto, txtVisor));
        JButton igual = new JButton("=");
        igual.setBounds(114,203,50,50);
        janela.add(igual);
        JButton soma = new JButton("+");
        soma.setBounds(166,203,50,50);
        janela.add(soma);
        soma.addActionListener(new Comportamento(soma, txtVisor));

        setSize(242,304);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
