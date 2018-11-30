package helllo;
import java.util.*;

import javax.swing.*;

import java.awt.*;
public class chuang {
	public static void main(String[] args){
		 // 显示应用 GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
		
	}
	 private static void createAndShowGUI() {
	        // 确保一个漂亮的外观风格
	        JFrame.setDefaultLookAndFeelDecorated(true);

	        // 创建及设置窗口
	        JFrame frame = new JFrame("HelloWorld");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setBackground(Color.YELLOW);  

	        // 添加 "Hello World" 标签
	        JLabel label = new JLabel("Hello World");
	        frame.getContentPane().add(label);

	        // 显示窗口
	        frame.pack();
	        frame.setVisible(true);
	    }

}
