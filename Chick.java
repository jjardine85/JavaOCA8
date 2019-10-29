public class Chick {
private String name = "Fluffy"; 
{System.out.println("Setting Field " + name);}

public Chick(){
	StringBuilder name = new StringBuilder("terry");
	name.append(1);
	System.out.println("no args: " + name);
}

public Chick(String name) {
	this.name = name;
	System.out.println("Setting Constructor " + name);
}

public Chick(int age) {
	
	System.out.println("Setting age constructor " + age);
}

public static void main(String[] args) {
	Chick chick = new Chick("chick");
	System.out.println("chick in main method: " + chick.name);
	Chick chick1 = new Chick("chick1");
	System.out.println("chick1 in main: " + chick1.name);
	Chick chick2 = new Chick();
	System.out.println("chick2 in main: " + chick2.name);

}

}