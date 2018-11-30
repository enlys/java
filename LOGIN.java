package helllo;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Container;





import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 




import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
public class LOGIN {
	public static void main(String[] args) {    
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = new Container();
        container.setLayout(null);
              // 将标签添加至容器
               container.setBackground(Color.YELLOW);   

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();    
        // 添加面板
        frame.add(panel);
        /* 
         * 调用用户定义的方法并添加组件到面板
         */
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
        playMusic();

      
    }
	static void playMusic(){//背景音乐播放
		try {
			URL cb;
			File f = new File("D:/网页/wetwe/src/helllo/bgmusic.mp3"); // 引号里面的是音乐文件所在的路径
			cb = f.toURL();
			AudioClip aau;
			aau = Applet.newAudioClip(cb);
		
			aau.play();	
			aau.loop();//循环播放
			//System.out.println("可以播放");
			// 循环播放 aau.play()
			//单曲 aau.stop()停止播放
 
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}	


    private static void placeComponents(JPanel panel) {

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("User:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /* 
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // 创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }


}
