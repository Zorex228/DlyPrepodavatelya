
package lab56;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mouse extends JPanel  {
    JTextField text1 = new JTextField(15);
    JButton but1 = new JButton("Press Me!");
    JLabel lab1 = new JLabel();
    private int c = 0;
    private int y = 1 + (int) (Math.random() * 10);;
    Mouse() {
        setLayout(new FlowLayout());
        setSize(300, 300);
        add(lab1);
        add(text1);
        add(but1);
        but1.addActionListener(new MouseAli());




    }
        private class MouseAli implements ActionListener {
            public void actionPerformed(ActionEvent m) {
                while (c < 3) {
                    int x1 = Integer.parseInt(text1.getText().trim());
                    if (x1 == y) {
                        lab1.setText("Вы угадали!");
                        JOptionPane.showMessageDialog(null, "Вы угадали!", "Alert", JOptionPane.INFORMATION_MESSAGE);


                    } else {
                        lab1.setText("Не угадали!");
                        JOptionPane.showMessageDialog(null, "Попробуйте снова", "alert", JOptionPane.INFORMATION_MESSAGE);

                    }
                    c++;

                }
            }
        }
    }

