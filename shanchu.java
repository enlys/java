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

import student.studen;
public class shanchu extends JFrame{
	private int windowWidth;
	 private int windowHeight;
	 private int screenSizeWidth;
	 private int screenSizeHeight;
	public shanchu(String title)
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
	 //����Ļ�Ŀ��ȸ߶ȣ����򴰿ڵĿ��ȸ߶ȸ�ֵ
	 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	 screenSizeWidth = (int) dimension.getWidth();
	 screenSizeHeight = (int) dimension.getHeight();
	 windowWidth = this.getWidth();
	 windowHeight = this.getHeight();
	 //���ó��򴰿ڵ�λ��Ϊ��Ļ��������
	 this.setLocation(screenSizeWidth / 2 - windowWidth / 2,
	  screenSizeHeight / 2 - windowHeight / 2);
	 JLabel username_label = new JLabel("ѧ��:");
	
	 // �����������������������
	 final JTextField stuid = new JTextField();
	 
	 
	 //������ť
	 JButton login_btn = new JButton("ȷ��");
	 
	 //���ø�����ǩ�������Ĵ�С��λ��
	 username_label.setBounds(120, 100, 100, 50);
	
	 stuid.setBounds(170, 100, 300, 50);
	
	 login_btn.setBounds(240, 360, 100, 50);
	 
	 this.add(username_label);
	
	 this.add(stuid);
	
	 this.add(login_btn);
	 login_btn.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //����ť������ʱ�Զ������������
	  public void actionPerformed(ActionEvent event)
	  {
		  if (stuid.getText().equals(""))
				  {
			  JOptionPane.showMessageDialog(null, "��������Чֵ��", "ɾ��",JOptionPane.INFORMATION_MESSAGE);
				   //������ʾ
				 
				  } else 
				  {
					  int id=Integer.parseInt(stuid.getText());
					  String out=(String)studen.shan(id);
					  JOptionPane.showMessageDialog(null, out, "ɾ��",JOptionPane.INFORMATION_MESSAGE);
					  
				   yonghu home=new yonghu("ѧ������ϵͳ");
				  }
	  }
	 });
	  }

}