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
public class anniu extends JDialog {        // �̳�JDialog��
	
	   public anniu() {
	        super(new MyJFrame(), "����һ��JDialog����", true); // ʵ����һ��JDialog�����ָ���丸���塢���ڱ��������
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
    	this.setTitle("����԰"); 
       this.setVisible(true);
         this.setSize(700, 500);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         JLabel jl = new JLabel("http://www.cnblogs.com/adamjwh/");        // ����һ��JLabel��ǩ
                 
         
         Container container = this.getContentPane();
         container.setLayout(null);
         container.add(jl);        // ����ǩ���������
                container.setBackground(Color.YELLOW);  
         
         JButton jb = new JButton("��������Ի���");        // ������ť
         jb.setBounds(200, 150, 200, 50);        // ��ťλ�ü���С
         jb.addActionListener(new ActionListener() {        // �����������ڼ�������¼�
             @Override             
             public void actionPerformed(ActionEvent e) {
                 new anniu().setVisible(true);
             }
         });
         container.add(jb);
     }
 }

