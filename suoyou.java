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
public class suoyou extends JFrame{
	private int windowWidth;
	 private int windowHeight;
	 private int screenSizeWidth;
	 private int screenSizeHeight;
	public suoyou(String title)
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
	 String outt =studen.chengji();
	 JLabel bian = new JLabel("ѧ���ɼ�");
	 bian.setFont(new java.awt.Font("Dialog", 1, 40));//���ñ�ǩ�����С
	 bian.setForeground(Color.blue);//���ñ�ǩ��ɫ
	 JLabel biao = new JLabel(outt);
	 biao.setFont(new java.awt.Font("Dialog", 1, 20));//���ñ�ǩ�����С
	 biao.setForeground(Color.red);//���ñ�ǩ��ɫ
	 
	 //������ť
	 JButton login_btn = new JButton("ȷ��");
	 
	 //���ø�����ǩ�������Ĵ�С��λ��
	 bian.setBounds(200,50,450,50);
	 biao.setBounds(110, 50, 450, 300);
	 login_btn.setBounds(240, 460, 100, 50);
	 
	 this.add(bian);
	 this.add(biao);
	 this.add(login_btn);
	 login_btn.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //����ť������ʱ�Զ������������
	  public void actionPerformed(ActionEvent event)
	  {
				   yonghu home=new yonghu("ѧ������ϵͳ");
				  
	  }
	 });
	  }

}
