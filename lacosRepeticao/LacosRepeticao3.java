package lacosrepeticao;

public class LacosRepeticao3 {

	public static void main(String[] args) {
				
		// tabuada do 1 ao 10
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%n Tabuada do %s %n", i);
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%n %s * %s = %s", i, j, i*j);
			}
			System.out.printf("%n %n --------------- %n");
		}
	}
}
