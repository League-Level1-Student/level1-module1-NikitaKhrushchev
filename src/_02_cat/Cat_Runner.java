package _02_cat;

public class Cat_Runner {
	public static void main(String[] args) {
Cat cat = new Cat("cat");
cat.meow();
cat.printName();
for(int i = 0; i< 10; i+=1) {
cat.kill();
}
	}
}
