/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
		for(int i=0;i<3;i++){
            System.out.println((int)(Math.random()*(max-min +1) + min));
        }
	}
}
