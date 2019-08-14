package mobile;

public class Multitalentedobject implements Player, Singer, Dancer {
	
public void Playershow() {
	System.out.println("Play...");
}
public void Singershow() {
	System.out.println("Sing...");
}
public void Dancershow() {
	System.out.println("Dance...");
}
public static void main(String[]args) {
Multitalentedobject navin = new Multitalentedobject();
navin.Playershow();
navin.Singershow();
navin.Dancershow();
}
}

