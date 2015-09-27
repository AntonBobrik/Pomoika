package chairs;

import java.io.IOException;

public class Petuh implements Zek
{	
	protected int zekNumber;
	Petuh(int number1)
	{
		zekNumber=number1;
	}
	public String Solve(Chair chair1, Chair chair2, Man A, Man B) throws Exception
	{
		if(A.equals(B) )
		{
			throw new Exception("Условие категории Б");
		}
		if(chair1 instanceof ChairWithDicks && chair2 instanceof ChairWithDicks)
		{
			return "Мать на любой, себя на оставшийся";
		}
		if((chair1 instanceof ChairWithPeaks && chair2 instanceof ChairWithDicks)||(chair1 instanceof ChairWithDicks && chair2 instanceof ChairWithPeaks))
		{
			return "Мать на пики, себя на дики";
		}
		if(chair1 instanceof ChairWithPeaks && chair2 instanceof ChairWithPeaks)
		{
			return "Мать на любой, сам на колени сяду";
		}
		return "kek";
	}
}
