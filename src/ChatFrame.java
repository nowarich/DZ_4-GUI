import javax.swing.*;
import javax.swing.border.LineBorder;
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



        JPanel bottom = new JPanel();  // инициализация нижней JPanel-и
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new BorderLayout()); // установка Layout для низа

        JTextField input = new JTextField();    // добавление поля ввода и кнопки
        bottom.add(input, BorderLayout.CENTER);
        JButton sendButton = new JButton("Send");
        bottom.add(sendButton, BorderLayout.EAST);

        ActionListener InputListener = new InputListener(textArea, input);
        sendButton.addActionListener(InputListener);
        input.addActionListener(InputListener);


        JPanel topmost = new JPanel();
        add(topmost, BorderLayout.NORTH);
        topmost.setBorder(new LineBorder(Color.GRAY, 1, true)); //
        topmost.setLayout(new BorderLayout());

        JTextField test = new JTextField();
        topmost.add(test, BorderLayout.EAST);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
            JMenuItem exit = new JMenuItem(new ExitAction());
            menu.add(exit);
        JMenu about = new JMenu("About");
        menuBar.add(menu);   //.add(about);
        menuBar.add(about);   //.add(about);
        JMenuItem aboutPop = new JMenuItem("info: Chat v1.0 /Домашнее задание по уроку №4 GUI"); // 
        about.add(aboutPop);
        menuBar.setSelected(menu);
        topmost.add(menuBar, BorderLayout.EAST);

        setJMenuBar(menuBar);
        setVisible(true);
    }

}
