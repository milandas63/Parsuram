public class Hello {
    public static void main(String[] args) {
	System.out.println("Hello Parsuram!");
    }
}

class Pyramid {
    public static void main(String[] args) {
	int spaces = 40;
        int stars = 1;
        for(int i=0; i<10; i++) {
	    for(int j=0; j<spaces; j++) System.out.print(" ");
            for(int j=0; j<stars; j++)  System.out.print("*");
            System.out.println();
            spaces--; stars += 2;
        }
    }
}
