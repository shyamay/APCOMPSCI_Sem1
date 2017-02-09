import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the hair color: ");
		String hair = kb.nextLine();
		System.out.println("Please enter the eyes color: ");
		String eyes = kb.nextLine();
		System.out.println("Please enter the skin color: ");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("Friend's info........ ");
		System.out.println("Hair:       " + hair);
		System.out.println("Eyes:       " + eyes);
		System.out.println("Skin:       " + skin);
		
		object.setHair(hair);
		object.setEyes(eyes);
		object.setSkin(skin);
		
	}
}