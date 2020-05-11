
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//initialize main window
		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		
		//initialize header panel
		JPanel HeadBanner = new JPanel();
		HeadBanner.setBackground(Color.BLACK);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		springLayout.putConstraint(SpringLayout.EAST, HeadBanner, screen.width, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, HeadBanner, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, HeadBanner, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, HeadBanner, screen.height / 10, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(HeadBanner);
		HeadBanner.setLayout(new GridLayout(1, 0, 0, 0));
		
		//initialize game area window
		JPanel MainPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, MainPanel, 0, SpringLayout.SOUTH, HeadBanner);
		springLayout.putConstraint(SpringLayout.WEST, MainPanel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, MainPanel, (screen.height/10) * 9, SpringLayout.SOUTH, HeadBanner);
		springLayout.putConstraint(SpringLayout.EAST, MainPanel, screen.width, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(MainPanel);
		GridBagLayout gbl_MainPanel = new GridBagLayout();
		gbl_MainPanel.columnWidths = new int[]{0};
		gbl_MainPanel.rowHeights = new int[]{0};
		gbl_MainPanel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_MainPanel.rowWeights = new double[]{Double.MIN_VALUE};
		MainPanel.setLayout(gbl_MainPanel);
		
		Game mainGame = new Game(5,5);
		MainPanel.add(mainGame);
		
		//add game area windows
		GradientButton CreateGame = new GradientButton("Create Game");
		CreateGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		HeadBanner.add(CreateGame);
		
		GradientButton SaveGame = new GradientButton("Save Game");
		SaveGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		HeadBanner.add(SaveGame);
		
		GradientButton LoadGame = new GradientButton("Load Game");
		LoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		HeadBanner.add(LoadGame);
		
		GradientButton PlayGame = new GradientButton("Play Game");
		PlayGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		HeadBanner.add(PlayGame);
		
		GradientButton ExitGame = new GradientButton("Exit Game");
		ExitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		HeadBanner.add(ExitGame);
		
		frame.setResizable(false);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
