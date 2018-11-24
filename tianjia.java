package student;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import student.*;
public class tianjia  extends JFrame{
	private int windowWidth;
		 private int windowHeight;
		 private int screenSizeWidth;
		 private int screenSizeHeight;
		public tianjia(String title)
		 {
		 super(title); //设置标题
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置能关闭窗口
		 this.setSize(600, 600); //设置窗口的大小
		 this.setLayout(null); //设置程序默认布局格式为空，以便于后期自己简单的设置布局
		 this.setResizable(false); //设置不可缩放
		 init();   //执行初始化函数（将用户名密码等组件加入到面板中）
		 this.setVisible(true); //使程序可见
		 }
		 
		 public void init()
		 {
		 //给屏幕的宽度高度，程序窗口的宽度高度赋值
		 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		 screenSizeWidth = (int) dimension.getWidth();
		 screenSizeHeight = (int) dimension.getHeight();
		 windowWidth = this.getWidth();
		 windowHeight = this.getHeight();
		 //设置程序窗口的位置为屏幕的正中央
		 this.setLocation(screenSizeWidth / 2 - windowWidth / 2,
		  screenSizeHeight / 2 - windowHeight / 2);
		 JLabel username_label = new JLabel("学号:");
		 JLabel password_label = new JLabel("姓名:");
		 JLabel  cj= new JLabel("成绩:");
		 // 声明姓名输入框和密码输入框
		 final JTextField stuid = new JTextField();
		 final JTextField stuname = new JTextField();
		 final JTextField stucj = new JTextField();
		 
		 //声明登录按钮
		 JButton login_btn = new JButton("确定");
		 
		 //设置各个标签和输入框的大小和位置
		 username_label.setBounds(120, 100, 100, 50);
		 password_label.setBounds(120, 200, 100, 50);
		 cj.setBounds(120,300,100,50);
		 stuid.setBounds(170, 100, 300, 50);
		 stuname.setBounds(170, 200, 300, 50);
		 stucj.setBounds(170,300,300,50);
		 login_btn.setBounds(240, 360, 100, 50);
		 
		 this.add(username_label);
		 this.add(password_label);
		 this.add(cj);
		 this.add(stuid);
		 this.add(stuname);
		 this.add(stucj);
		 this.add(login_btn);
		 login_btn.addActionListener(new ActionListener()
		 {
		  @SuppressWarnings("deprecation")
		  @Override
		  //当按钮被单击时自动调动这个方法
		  public void actionPerformed(ActionEvent event)
		  {
			  if (stuid.getText().equals("")|| stuname.getText().equals("")||stucj.getText().equals(""))
					  {
				  JOptionPane.showMessageDialog(null, "请输入有效值！", "添加",JOptionPane.INFORMATION_MESSAGE);
					   //声明提示
					 
					  } else 
					  {
						  
						  int id=Integer.parseInt(stuid.getText());
						  String name=(String)stuname.getText();
						  String cj=(String)stucj.getText();
						String out=(String)studen.name(id, name, cj);
						
						JOptionPane.showMessageDialog(null, out, "添加",JOptionPane.INFORMATION_MESSAGE);
					   yonghu home=new yonghu("学生管理系统");
					  }
		  }
		 });
		  }
		 }

