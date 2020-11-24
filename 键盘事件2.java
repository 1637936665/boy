import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    private JPanel myPanel=new JPanel();
    private JTextArea textArea1=new JTextArea();
    private JTextArea textArea2=new JTextArea();
    Font x = new Font("font",0,20);//那个0 表示字形bai如1粗体2斜体du之zhi类的，20是字体大小
    public App(){
        textArea1.setFont(x);//设置字体
        textArea2.setFont(x);//设置字体
        textArea1.setBackground(Color.orange);
        textArea1.setBounds(90,50,320,420);
        textArea1.setText("请输入名字：");
        myPanel.add(textArea1);
        textArea2.setBackground(Color.gray);
        textArea2.setBounds(0,520,520,520);
        myPanel.add(textArea2);

        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(textArea1.getText().equals("请输入名字：靓仔\n")){
                        textArea2.setText("输入正确。");
                    }else{
                        textArea2.setText("输入错误！\n提示：靓仔");
                    }

                }
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
