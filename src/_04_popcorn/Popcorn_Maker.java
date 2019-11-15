package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Maker {
public static void main(String[] args) {
	Microwave micro = new Microwave();
	Popcorn pop = new Popcorn(JOptionPane.showInputDialog("What flavor"));
	int cookFor = Integer.parseInt(JOptionPane.showInputDialog("How long should this cook for¿"));
	micro.putInMicrowave(pop);
	micro.setTime(cookFor);
	micro.startMicrowave();
	pop.eat();
}
}
