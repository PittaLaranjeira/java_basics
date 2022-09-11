package lacosrepeticao;

public class LacosRepeticao4 {

	public static void main(String[] args) {
		
		int i = 1, j;
		
		// tabuada do 1 ao 10
		while(i <= 10) {
			System.out.printf("%n Tabuada do %s %n", i);
			j = 1;
			while(j <= 10) {
				System.out.printf("%n %s * %s = %s", i, j, i*j);
				j++;
			}
			i++;
			System.out.printf("%n %n --------------- %n");
		}
	}
}
