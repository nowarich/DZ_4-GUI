import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ChatFrame extends JFrame {

    public ChatFrame() {

        setTitle("Chat");
        setBounds(100, 100, 400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel top = new JPanel();  // инициализация верхней JPanel-и
        add(top, BorderLayout.CENTER);
        top.setLayout(new BorderLayout());  // установка Layout для центра
//        JPanel center = new JPanel();

        JTextArea textArea = new JTextArea();   // добваление JTextArea
        textArea.setEditable(false);
        top.add(textArea, BorderLayout.CENTER);



        JPanel bottom = new JPanel();  // инициализация верхней JPanel-и
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new BorderLayout()); // установка Layout для низа

        JTextField input = new JTextField();    // добавление поля ввода и кнопки
        bottom.add(input, BorderLayout.CENTER);
        JButton sendButton = new JButton("Send");
        bottom.add(sendButton, BorderLayout.EAST);

        ActionListener InputListener = new InputListener(textArea, input);
        sendButton.addActionListener(InputListener);
        input.addActionListener(InputListener);


//        JPanel left = new JPanel();
        // Задание 3 to be continued...

        setVisible(true);
    }

}
