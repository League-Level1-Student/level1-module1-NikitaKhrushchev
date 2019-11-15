package _06_duck;

public class Duck {
private int numberOfFriends ;//= 5;
private String favoriteFood ;//= "Bread";
Duck(String favoriteFood, int numberOfFriends) {
  	this.favoriteFood = favoriteFood;
  	this.numberOfFriends = numberOfFriends;
}
void Quack() {
System.out.println("qUaCK");
}
void Waddle() {
System.out.println("*waddling noises*");
}
}
