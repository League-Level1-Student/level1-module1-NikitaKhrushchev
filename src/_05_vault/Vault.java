package _05_vault;

import java.util.Random;

//import Random;
public class Vault {
Random r = new Random();
private int num = r.nextInt(1000000);
boolean tryCode(int in) {
if (in == num) {
return true;
}
else {
	return false;
}
}
}
