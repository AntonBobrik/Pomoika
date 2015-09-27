package chairs;

public class Muzhik implements Zek
{
	protected int zekNumber;
	Muzhik(int number1)
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
			return "Возьму дики, наточу, срублю другие";
		}
		if((chair1 instanceof ChairWithPeaks && chair2 instanceof ChairWithDicks)||(chair1 instanceof ChairWithDicks && chair2 instanceof ChairWithPeaks))
		{
			return "Возьми пики точеные, срублю дики дроченые";
		}
		if(chair1 instanceof ChairWithPeaks && chair2 instanceof ChairWithPeaks)
		{
			return "Сам на пики, мать на колени";
		}
		return "kek";
	}

}
