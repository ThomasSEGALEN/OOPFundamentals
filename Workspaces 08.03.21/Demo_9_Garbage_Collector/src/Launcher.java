
public class Launcher {

	public static void main(String[] args) {
		
		int myInt = 0;
		changeMyInt(myInt);
		System.out.println(myInt);
		
		Cat myCat = new Cat();
		myCat.color = "Black";
		changeMyCatColor(myCat);
		System.out.println(myCat.color);
		
		Cat myCat2 = new Cat();
		myCat2.age = 5;
		changeMyCatAge(myCat2.age);
		System.out.println(myCat2.age);
	}
	
	static void changeMyCatAge(int age) {
		age = 20;
	}
	
	static void changeMyCatColor(Cat cat) {
		
		cat.color = "White";
	}
	
	static void changeMyInt(int value) {
		
		value = 10;
	}
}
