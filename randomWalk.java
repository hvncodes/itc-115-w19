import java.util.Random;

public class randomWalk {

	public static void main(String[] args) {
		Random rand = new Random(); //init random
		int position = 0; //init position
		int max = 0; //init max
		
		//print initial position
		System.out.println("position = " + position); //"fencepost"-like
		
		while (position < 3 && position > -3) {
			//random: 50-50 chance
			int randomNumber = rand.nextInt(2);
			
			//decision
			if (randomNumber == 0) { //0, go back one step
				position -= 1;
			} else { //1, move forward one step
				position += 1;
			}
			
			//print updated position
			System.out.println("position = " + position); //"fence"
			
			//check/update max position
			if (position > max) {
				max = position;
			}
		}
		//print max position
		System.out.println("max position = " + max);
	}

}
