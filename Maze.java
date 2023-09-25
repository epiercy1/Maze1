
public class Maze {
	private int width;
	private int height;
	private char[][]maze;
	
	public Maze(int width, int height) {
		this.width = width;
		this.height = height;
		//create the maze array
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void set(char character, int row, int column) {
		
	}
	
	public String solve(int startrow, int startcol, int endrow, int endcol) {
		String result = " ";

		//Must use recursion
		//Must return a String of the form: r, c-r1, c1-r2, c2

		//base cases

		//if we are at the end
		//	return end coordinates

		//if we are at a dead end(zero ways to go)
		//	return null
		
		return result;
	}
}
