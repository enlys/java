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
import student.chazhao;
import student.studen;
import student.tianjia;
import student.*;
public class yonghu extends JFrame{
	private int windowWidth;
	 private int windowHeight;
	 private int screenSizeWidth;
	 private int screenSizeHeight;
	public yonghu(String title)
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
	 JLabel biao = new JLabel("ѧ �� �� �� ϵ ͳ");
	 biao.setFont(new java.awt.Font("Dialog", 1, 50));//���ñ�ǩ�����С
	 biao.setForeground(Color.red);//���ñ�ǩ��ɫ
	 //������¼��ť
	 JButton tianjia  = new JButton("���ѧ��");
	 JButton chazhao = new JButton("����ѧ��");
	 JButton shanchu = new JButton("ɾ��ѧ��");
	 JButton suoyou = new JButton("����ѧ��");
	 tianjia.setFont(new java.awt.Font("Dialog", 1, 20));
	 chazhao.setFont(new java.awt.Font("Dialog", 1, 20));
	 shanchu.setFont(new java.awt.Font("Dialog", 1, 20));
	 suoyou.setFont(new java.awt.Font("Dialog", 1, 20));
	 //���ø�����ǩ�������Ĵ�С��λ��
	 biao.setBounds(110, 50, 450, 50);
	 tianjia.setBounds(150, 150, 300, 50);
	 chazhao.setBounds(150, 220, 300, 50);
	 shanchu.setBounds(150, 290, 300, 50);
	 suoyou.setBounds(150, 360, 300, 50);
	 
	 this.add(biao);
	 this.add(tianjia);
	 this.add(chazhao);
	 this.add(shanchu);
	 this.add(suoyou);
	 //��ť������
	 tianjia.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //����ť������ʱ�Զ������������
	  public void actionPerformed(ActionEvent event)
	  {
		  tianjia tj=new tianjia("���ѧ��");
	  }
	 
	 });
	 chazhao.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //����ť������ʱ�Զ������������
	  public void actionPerformed(ActionEvent event)
	  {
		  chazhao cz=new chazhao("����ѧ��");
	  }
	 
	 });
	 shanchu.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //����ť������ʱ�Զ������������
	  public void actionPerformed(ActionEvent event)
	  {
		  shanchu sc=new shanchu("����ѧ��");
	  }
	 
	 });
	 suoyou.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //����ť������ʱ�Զ������������
	  public void actionPerformed(ActionEvent event)
	  {
		  suoyou sy=new suoyou("����ѧ��");
	  }
	 
	 });
	 }

}
