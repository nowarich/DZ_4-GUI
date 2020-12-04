import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputListener implements ActionListener {
    private JTextArea textArea;
    private JTextField textField;


    public InputListener(JTextArea textArea, JTextField textField) {
        this.textArea = textArea;
        this.textField = textField;
    }

//    public InputListener(JTextArea textArea) {
//        this.textArea = textArea;
//    }



    @Override
    public void actionPerformed(ActionEvent e) {

        StringBuilder sb = new StringBuilder(textArea.getText());
        sb.append("\n").append(textField.getText());
        textArea.setText(sb.toString());
        textField.setText("");

    }
}
