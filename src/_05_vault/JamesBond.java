package _05_vault;

public class JamesBond {
	private int number= 0;
	public boolean foundIt = false; 
void findCode(Vault vault) {
number += 1;
if (vault.tryCode(number)==true) {
System.out.println("Found it, the code was " + number);
foundIt = true;
}
else {
	if (number % 1000 == 0) {
	System.out.println("Not under " + number);
}
}
}
}

