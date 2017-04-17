package Complete;
public class Magpie3
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (findKeyword(statement, "cat",0) >= 0
				|| (findKeyword(statement, "fish",0)>= 0
				|| (findKeyword(statement, "turtle",0) >= 0
				|| (findKeyword(statement, "dog",0)>= 0)

		/* place code for keyword "Robinette" here */
		
		else if (findKeyword(statement, "Mr. Robinette",0)>= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}


		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
		{

			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(),
										psn + goal.length() + 1);
			}
		}
		
	}
}