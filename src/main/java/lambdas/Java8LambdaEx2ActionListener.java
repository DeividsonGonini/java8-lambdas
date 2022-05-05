package lambdas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java8LambdaEx2ActionListener {
    public static void main(String[] args) {


        //EXEMPLO 2
        //Implementação Antiga
        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Olá mundo");
            }
        });

        //Implementação Nova - Com Lambda
        JButton jButton2 = new JButton();
        jButton2.addActionListener(e -> System.out.println("Olá mundo - com Lambda"));
    }
}
