package helllo;
import java.util.*;

import javax.swing.*;

import java.awt.*;
public class chuang {
	public static void main(String[] args){
		 // ��ʾӦ�� GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
		
	}
	 private static void createAndShowGUI() {
	        // ȷ��һ��Ư������۷��
	        JFrame.setDefaultLookAndFeelDecorated(true);

	        // ���������ô���
	        JFrame frame = new JFrame("HelloWorld");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setBackground(Color.YELLOW);  

	        // ��� "Hello World" ��ǩ
	        JLabel label = new JLabel("Hello World");
	        frame.getContentPane().add(label);

	        // ��ʾ����
	        frame.pack();
	        frame.setVisible(true);
	    }

}
