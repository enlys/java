package student;


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
import student.yonghu;
import student.studen;
//主类，程序的入口
public class begin
{
 public static void main(String[] args)
 {
 new begindemo("登录");
  studen.studens();
 }
}
 
class begindemo extends JFrame
{
 //登录的用户名和密码
 private final String userName = "sa";
 private final String password = "123456";
 //声明屏幕的宽高，程序窗口的宽高
 private int windowWidth;
 private int windowHeight;
 private int screenSizeWidth;
 private int screenSizeHeight;
 
 //构造函数，
 public begindemo(String title)
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
 
 // 声明姓名，密码的标签
 JLabel username_label = new JLabel("用户名:");
 JLabel password_label = new JLabel("密码:");
 // 声明姓名输入框和密码输入框
 final JTextField user_field = new JTextField();
 final JPasswordField password_field = new JPasswordField();
 //声明登录按钮
 JButton login_btn = new JButton("登录");
 
 //设置各个标签和输入框的大小和位置
 username_label.setBounds(120, 100, 100, 50);
 password_label.setBounds(120, 200, 100, 50);
 user_field.setBounds(170, 100, 300, 50);
 password_field.setBounds(170, 200, 300, 50);
 login_btn.setBounds(240, 330, 100, 50);
 
 this.add(username_label);
 this.add(password_label);
 this.add(user_field);
 this.add(password_field);
 this.add(login_btn);
 
 //登录按钮的监听器
 login_btn.addActionListener(new ActionListener()
 {
  @SuppressWarnings("deprecation")
  @Override
  //当按钮被单击时自动调动这个方法
  public void actionPerformed(ActionEvent event)
  {
  //如果用户名和密码都是123，那么弹出对话框显示登录成功，并且开启另一个主框架（主页）
  if (user_field.getText().equals(userName)
   && password_field.getText().equals(password))
  {
   JOptionPane.showMessageDialog(null, "登录成功", "Login",
    JOptionPane.INFORMATION_MESSAGE);
   //声明主页
  yonghu home=new yonghu("学生管理系统");
  } else //反之，登录不成功，重新登录
  {
   JOptionPane.showMessageDialog(null, "登录失败，请重新登录", "Login",
    JOptionPane.INFORMATION_MESSAGE);
   //设置输入框的内容为空，让用户重新输入
   user_field.setText("");
   password_field.setText("");
  }
  }
 });
 
 }
}
