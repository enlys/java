package helllo;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 


 import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
public class anniu extends JDialog {        // 继承JDialog类
	
	   public anniu() {
	        super(new MyJFrame(), "这是一个JDialog窗体", true); // 实例化一个JDialog类对象，指定其父窗体、窗口标题和类型
	         Container container = this.getContentPane();
	         container.add(new JLabel("http://www.cnblogs.com/adamjwh/"));
      this.setSize(500, 350);
	    }
	     
	    
	     public static void main(String[] args) {
	         new anniu();
	    }
	 
 }
class MyJFrame extends JFrame {
    public MyJFrame() {
    	this.setTitle("博客园"); 
       this.setVisible(true);
         this.setSize(700, 500);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         JLabel jl = new JLabel("http://www.cnblogs.com/adamjwh/");        // 创建一个JLabel标签
                 
         
         Container container = this.getContentPane();
         container.setLayout(null);
         container.add(jl);        // 将标签添加至容器
                container.setBackground(Color.YELLOW);  
         
         JButton jb = new JButton("点击弹出对话框");        // 创建按钮
         jb.setBounds(200, 150, 200, 50);        // 按钮位置及大小
         jb.addActionListener(new ActionListener() {        // 监听器，用于监听点击事件
             @Override             
             public void actionPerformed(ActionEvent e) {
                 new anniu().setVisible(true);
             }
         });
         container.add(jb);
     }
 }

