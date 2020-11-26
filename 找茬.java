import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_bg=new JLabel();
    JLabel label_text=new JLabel();
    JLabel label1=new JLabel();
    JLabel label2=new JLabel();
    JLabel label3=new JLabel();
    JLabel label4=new JLabel();
    int i=0;
    //构造方法
    public App() {
        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //输出坐标
                System.out.println(e.getX()+","+e.getY());
                //得分+1
                i++;
                System.out.println(i);
                label_text.setText("得分："+i);
            }
        });
        label2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //输出坐标
                System.out.println(e.getX()+","+e.getY());
                //得分+1
                i++;
                System.out.println(i);
                label_text.setText("得分："+i);
            }
        });
        label3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //输出坐标
                System.out.println(e.getX()+","+e.getY());
                //得分+1
                i++;
                System.out.println(i);
                label_text.setText("得分："+i);
            }
        });
        label4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //输出坐标
                System.out.println(e.getX()+","+e.getY());
                //得分+1
                i++;
                System.out.println(i);
                label_text.setText("得分："+i);
            }
        });
        label_bg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //输出坐标
                System.out.println(e.getX()+","+e.getY());
            }

        });


    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("Giao哥来找茬");
        myPanel.setLayout(null);

        //得分
        label_text.setText("得分：0");label_text.setBounds(18,55,800,50);
        myPanel.add(label_text);
        //1茬
        label1.setBounds(396,437,91,76);
        myPanel.add(label1);

        //2茬
        label2.setBounds(107,635,82,236);
        myPanel.add(label2);
        //3茬
        label3.setBounds(607,545,83,260);
        myPanel.add(label3);
        //4茬
        label4.setBounds(552,572,60,210);
        myPanel.add(label4);
        //引入资源
        java.net.URL imgURL = App.class.getResource("image/bg.jpg");
        label_bg.setIcon(new ImageIcon(imgURL));
        label_bg.setBounds(0,0,800,1000);
        myPanel.add(label_bg);

        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,800,1000);
        //frame.pack();
        frame.setVisible(true);
        //不可拉伸
        frame.setResizable(false);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
