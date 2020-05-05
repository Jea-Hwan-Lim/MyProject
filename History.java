package yuhan03;

public class History {
	private int grade;
	private int ban;
	private int number;
	private String name;
	
	public void junior() {
		System.out.println("유한대학교");
		System.out.println(grade+"학년"+ban+"반");
		System.out.println("학번:"+number);
		System.out.println("이름:"+name);
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
