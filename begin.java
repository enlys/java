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
//���࣬��������
public class begin
{
 public static void main(String[] args)
 {
 new begindemo("��¼");
  studen.studens();
 }
}
 
class begindemo extends JFrame
{
 //��¼���û���������
 private final String userName = "sa";
 private final String password = "123456";
 //������Ļ�Ŀ�ߣ����򴰿ڵĿ��
 private int windowWidth;
 private int windowHeight;
 private int screenSizeWidth;
 private int screenSizeHeight;
 
 //���캯����
 public begindemo(String title)
 {
 super(title); //���ñ���
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����ܹرմ���
 this.setSize(600, 600); //���ô��ڵĴ�С
 this.setLayout(null); //���ó���Ĭ�ϲ��ָ�ʽΪ�գ��Ա��ں����Լ��򵥵����ò���
 this.setResizable(false); //���ò�������
 init();   //ִ�г�ʼ�����������û��������������뵽����У�
 this.setVisible(true); //ʹ����ɼ�
 }
 
 public void init()
 {
 //����Ļ�Ŀ�ȸ߶ȣ����򴰿ڵĿ�ȸ߶ȸ�ֵ
 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
 screenSizeWidth = (int) dimension.getWidth();
 screenSizeHeight = (int) dimension.getHeight();
 windowWidth = this.getWidth();
 windowHeight = this.getHeight();
 //���ó��򴰿ڵ�λ��Ϊ��Ļ��������
 this.setLocation(screenSizeWidth / 2 - windowWidth / 2,
  screenSizeHeight / 2 - windowHeight / 2);
 
 // ��������������ı�ǩ
 JLabel username_label = new JLabel("�û���:");
 JLabel password_label = new JLabel("����:");
 // �����������������������
 final JTextField user_field = new JTextField();
 final JPasswordField password_field = new JPasswordField();
 //������¼��ť
 JButton login_btn = new JButton("��¼");
 
 //���ø�����ǩ�������Ĵ�С��λ��
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
 
 //��¼��ť�ļ�����
 login_btn.addActionListener(new ActionListener()
 {
  @SuppressWarnings("deprecation")
  @Override
  //����ť������ʱ�Զ������������
  public void actionPerformed(ActionEvent event)
  {
  //����û��������붼��123����ô�����Ի�����ʾ��¼�ɹ������ҿ�����һ������ܣ���ҳ��
  if (user_field.getText().equals(userName)
   && password_field.getText().equals(password))
  {
   JOptionPane.showMessageDialog(null, "��¼�ɹ�", "Login",
    JOptionPane.INFORMATION_MESSAGE);
   //������ҳ
  yonghu home=new yonghu("ѧ������ϵͳ");
  } else //��֮����¼���ɹ������µ�¼
  {
   JOptionPane.showMessageDialog(null, "��¼ʧ�ܣ������µ�¼", "Login",
    JOptionPane.INFORMATION_MESSAGE);
   //��������������Ϊ�գ����û���������
   user_field.setText("");
   password_field.setText("");
  }
  }
 });
 
 }
}
