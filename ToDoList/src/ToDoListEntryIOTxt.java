import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ToDoListEntryIOTxt {

    public void save(@NotNull DefaultListModel list) {
        try {
            File f = new File("todo.txt");
            BufferedWriter out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(f), StandardCharsets.UTF_8));
            for (int i = 0; i < list.size(); i++) {
                out.write((String) list.getElementAt(i));
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    public void load(DefaultListModel list) {
        try {
            File f = new File("todo.txt");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(f), StandardCharsets.UTF_8));
            String line;
            while ((line = in.readLine()) != null) {
                list.addElement(line);
            }
            in.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}
