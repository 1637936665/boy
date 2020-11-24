import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    private JPanel myPanel=new JPanel();
    private JTextArea textArea1=new JTextArea();
    private JTextArea textArea2=new JTextArea();

    public App(){
        textArea1.setBackground(Color.orange);
        textArea1.setBounds(0,0,520,520);
        textArea1.setText("请按按鼠标↑键。");
        myPanel.add(textArea1);
        textArea2.setBackground(Color.gray);
        textArea2.setBounds(0,520,520,520);
        textArea2.setText("请按按鼠标↓键。");
        myPanel.add(textArea2);

        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(e.getKeyCode()==KeyEvent.VK_UP)
                    textArea1.append("欢迎进入上流社会！\n");
                if(e.getKeyCode()==KeyEvent.VK_DOWN)
                    textArea2.append("欢迎进入下流社会！\n");
            }

        });
    }
    void go(){
        JFrame frame = new JFrame("键盘事件");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*frame.pack();*/
        frame.setBounds(100,100,520,1040);
        frame.setVisible(true);


    }

    public static void main(String[] args) {

        new App().go();
    }
}
