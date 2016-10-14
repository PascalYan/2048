
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
		private JFrame frame=new JFrame();
		private Container contentPane=frame.getContentPane();
		private JButton startButton=new JButton("��ʼ");
		
		private Game game;
		public JButton resetButton=new JButton("����");;
		public Grids grids;
		
		public GamePanel(){
			//super();
			this.grids=new Grids();
			initGamePanel();
			//setBackground(Color.gray);
		}
		public void initGamePanel(){
			frame.setTitle("2048");
			frame.setVisible(true);
			frame.setBounds(500,100,555,620);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			contentPane.setLayout(null);
			this.setFocusable(true);
			contentPane.add(this);
			this.setBounds(0, 0, 540, 540);
			//contentPane.setBackground(Color.black);//��JPanel�����ˣ�û��Ч�����ٺ�
			resetButton.setBounds(250, 545, 60, 30);
			//resetButton.addActionListener(game);
			
			contentPane.add(resetButton);
			//contentPane.add(resetButton);
			//contentPane.add(startButton);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);//���������ø��� paint�ſ�����ʾ�Լ��ı߿� ������ɫ֮��ģ���Ϊ��������������Լ�����дʱҪ������
			grids.drawGrids(g);
			
		}
		public void redisply(){
			repaint();
		}
		
	
		
}
