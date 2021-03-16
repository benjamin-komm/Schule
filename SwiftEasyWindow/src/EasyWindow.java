import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EasyWindow extends JFrame {

    private final JLabel label;

    public EasyWindow() {
        super();

        setTitle("easy window");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                exit();
            }
        });

        final Container con = getContentPane();
        con.setLayout(new BorderLayout());

        label = new JLabel("Dies ist ein Test", JLabel.CENTER);

        final JButton red = new JButton("rot");
        final JButton yellow = new JButton("gelb");
        final JButton exit = new JButton("Ende");

        con.add(label, BorderLayout.CENTER);
        con.add(red, BorderLayout.WEST);
        con.add(yellow, BorderLayout.EAST);
        con.add(exit, BorderLayout.SOUTH);

        exit.addActionListener(actionEvent -> exit());
        red.addActionListener(actionEvent -> label.setForeground(Color.RED));
        yellow.addActionListener(actionEvent -> label.setForeground(Color.YELLOW));

        setSize(400, 100);
        setVisible(true);
    }

    private void exit(){
        System.exit(0);
    }

}
