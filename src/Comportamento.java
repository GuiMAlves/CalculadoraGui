import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comportamento implements ActionListener {
    private JButton botao;
    private JTextField txtVisor;

    //vamos criar um objeto comportamento botao
    public Comportamento(JButton botao, JTextField txtVisor) {
        this.botao = botao;
        this.txtVisor = txtVisor;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        txtVisor.setText(txtVisor.getText() + botao.getText());

        txtVisor.setFont(new Font("Sanserif", Font.PLAIN,20));
    }

}