package gitSubmoduleMain;

public class MainClass {
	private String name;
	private int number;
	
	
	public MainClass(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MainClass() {
		
	}

	public static void main(String[] args) {
		MainClass main = new MainClass("Iwo", 99);
		System.out.println(main.getNumber());
	}

}
