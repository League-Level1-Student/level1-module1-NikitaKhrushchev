package _05_vault;

public class Runner {
public static void main(String[] args) {
	JamesBond james = new JamesBond();
	Vault vault = new Vault();
	for(int i = 0; i<40; i+= 0) {
	james.findCode(vault);
	if (james.foundIt == true) {
		i = 40;
	}
	}
}
}
