import java.awt.Color;
import java.awt.Font;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class GradientButton extends JButton {

	public GradientButton() {
		// TODO Auto-generated constructor stub
	}

	public GradientButton(Icon icon) {
		super(icon);
		setupJButton();
		// TODO Auto-generated constructor stub
	}

	public GradientButton(String text) {
		super(text);
		setupJButton();
		// TODO Auto-generated constructor stub
	}

	public GradientButton(Action a) {
		super(a);
		setupJButton();
		// TODO Auto-generated constructor stub
	}

	public GradientButton(String text, Icon icon) {
		super(text, icon);
		setupJButton();
		// TODO Auto-generated constructor stub
	}

	private void setupJButton () {

		this.setHorizontalTextPosition(SwingConstants.CENTER);
		this.setForeground(new Color(218, 165, 32));
		this.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 0, 0)));
		this.setFont(new Font("Impact", Font.PLAIN, 40));
		ImageIcon unpressed = new ImageIcon("res/Button-Unpressed.png");
		ImageIcon pressed = new ImageIcon("res/Button-Pressed.png");
		unpressed.getImageLoadStatus();
		this.setIcon(unpressed);
		this.setPressedIcon(pressed);
	}

}
