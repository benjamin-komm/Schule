import javax.swing.*;
import javax.swing.DefaultListModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EasyWindow extends JFrame {

    private final JList<String> list;
    private final DefaultListModel<String> lm;
    //private final JTextField tf;

    public EasyWindow() {
        super();

        setTitle("ToDoList");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                exit();
            }
        });

        final Container con = getContentPane();
        con.setLayout(new BorderLayout());

        lm = new DefaultListModel<>();
        list = new JList<>(lm);
        final JScrollPane sp = new JScrollPane(list);
        con.add(sp, BorderLayout.CENTER);

        final JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(1, 2));

        JTextField tfBesch = new JTextField();
        JTextField tfAnz = new JTextField("1");
        inputPanel.add(tfBesch);
        inputPanel.add(tfAnz);

        //tf = new JTextField();
        //con.add(tf, BorderLayout.NORTH);

        final JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        final JButton add = new JButton("Add");
        final JButton remove = new JButton("Remove");
        final JButton removeAll = new JButton("Remove All");
        final JButton exit = new JButton("Exit");

        panel.add(add);
        panel.add(remove);
        panel.add(removeAll);
        panel.add(exit);

        ToDoListEntry toDoListEntry = new ToDoListEntry();

        add.addActionListener(actionEvent -> {
            if (tfBesch.getText().length() > 0 && tfAnz.getText().length() > 0) {
                lm.addElement(toDoListEntry.createEntry(tfBesch.getText(), Integer.parseInt(tfAnz.getText())));
            }
        });

        // add.addActionListener(actionEvent -> lm.addElement(tf.getText()));

        remove.addActionListener(actionEvent -> {
            if (list.getSelectedIndex() > 0) {
                lm.removeElementAt(list.getSelectedIndex());
            }
        });

        removeAll.addActionListener(actionEvent -> lm.removeAllElements());
        exit.addActionListener(actionEvent -> System.exit(0));

        con.add(inputPanel, BorderLayout.NORTH);
        con.add(panel, BorderLayout.EAST);

        setSize(500, 350);
        setVisible(true);
    }

    private void exit() {
        System.exit(0);
    }

}
