import java.util.logging.Logger;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class Game extends JPanel {
	Category[] categoryList;
	Question[][] questionGrid;
	
	
	public Game() {
		this.categoryList = new Category[5];
		for (int i = 0; i < 5; i++) { 
			this.categoryList[i] = new Category(); 
		}
		this.questionGrid = new Question[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				this.questionGrid[i][j] = new Question();
			}
		}
		setParams(5, 5);
	}
	
	public Game(int rows, int cols) {
		if (rows > 5 || rows < 3) {
			System.err.println("ERROR: Recieved rows value less than 3 or greater than 5!");
			System.exit(-1);
		}
		if (cols > 5 || cols < 3) {
			System.err.println("ERROR: Recieved cols value less than 3 or greater than 5!");
			System.exit(-1);
		}
		this.categoryList = new Category[cols];
		for (int i = 0; i < cols; i++) {
			this.categoryList[i]= new Category(); 
		}
		this.questionGrid = new Question[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.questionGrid[i][j] = new Question();
			}
		}
		setParams(cols, rows);
	}
	
	private void setParams(int width, int height) {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(240 * width,140 * (height + 1)));
	}
	
	public Category[] getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(Category[] categoryList) {
		this.categoryList = categoryList;
	}
	public Question[][] getQuestionGrid() {
		return questionGrid;
	}
	public void setQuestionGrid(Question[][] questionGrid) {
		this.questionGrid = questionGrid;
	}
}
