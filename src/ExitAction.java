import javax.swing.*;
import java.awt.event.ActionEvent;

public class ExitAction extends AbstractAction {

    public ExitAction() {
        putValue(NAME, "Exit");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
