import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class App {
    private JPanel myPanel=new JPanel();
    private JLabel JLabel1=new JLabel();
    private JLabel JLabel2=new JLabel();
    int row_init=5,column_init=5;
    public App(){
        //飞机
        URL img=App.class.getResource("image/plane.png");
        JLabel2.setIcon(new ImageIcon(img));
        JLabel2.setBounds(180,840,128,128);
        myPanel.add(JLabel2);




        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_UP) {
                    //column_init+=3;
                    JLabel2.setBounds(JLabel2.getX(), JLabel2.getY()-column_init, 128, 128);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    //column_init+=3;
                    JLabel2.setBounds(JLabel2.getX(),JLabel2.getY()+column_init, 128, 128);
                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                    //row_init+=3;
                    JLabel2.setBounds(JLabel2.getX()-row_init, JLabel2.getY(), 128, 128);
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
                    //row_init+=3;
                    JLabel2.setBounds(JLabel2.getX()+row_init,JLabel2.getY(), 128, 128);
                }
            }
        });
    }
    void go(){
        JFrame frame = new JFrame("打飞机事件");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        /*frame.pack();*/
        frame.setBounds(0,0,520,1040);
        frame.setVisible(true);
        //窗口不可拉伸
        //frame.setResizable(false);
        //窗口居中显示
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以

    }

    public static void main(String[] args) {

        new App().go();
    }
}
