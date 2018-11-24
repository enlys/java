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
	 JLabel biao = new JLabel("学 生 管 理 系 统");
	 biao.setFont(new java.awt.Font("Dialog", 1, 50));//设置标签字体大小
	 biao.setForeground(Color.red);//设置标签颜色
	 //声明登录按钮
	 JButton tianjia  = new JButton("添加学生");
	 JButton chazhao = new JButton("查找学生");
	 JButton shanchu = new JButton("删除学生");
	 JButton suoyou = new JButton("所有学生");
	 tianjia.setFont(new java.awt.Font("Dialog", 1, 20));
	 chazhao.setFont(new java.awt.Font("Dialog", 1, 20));
	 shanchu.setFont(new java.awt.Font("Dialog", 1, 20));
	 suoyou.setFont(new java.awt.Font("Dialog", 1, 20));
	 //设置各个标签和输入框的大小和位置
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
	 //按钮监听器
	 tianjia.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //当按钮被单击时自动调动这个方法
	  public void actionPerformed(ActionEvent event)
	  {
		  tianjia tj=new tianjia("添加学生");
	  }
	 
	 });
	 chazhao.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //当按钮被单击时自动调动这个方法
	  public void actionPerformed(ActionEvent event)
	  {
		  chazhao cz=new chazhao("查找学生");
	  }
	 
	 });
	 shanchu.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //当按钮被单击时自动调动这个方法
	  public void actionPerformed(ActionEvent event)
	  {
		  shanchu sc=new shanchu("查找学生");
	  }
	 
	 });
	 suoyou.addActionListener(new ActionListener()
	 {
	  @SuppressWarnings("deprecation")
	  @Override
	  //当按钮被单击时自动调动这个方法
	  public void actionPerformed(ActionEvent event)
	  {
		  suoyou sy=new suoyou("所有学生");
	  }
	 
	 });
	 }

}
