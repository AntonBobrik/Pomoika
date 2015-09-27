package chairs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main
{

	public static void main(String[] args) throws Exception 
	{
		ChairWithDicks a = new ChairWithDicks();
		ChairWithPeaks b = new ChairWithPeaks();
		ChairWithDicks c = new ChairWithDicks();
		ChairWithPeaks d = new ChairWithPeaks();
		ChairWithDicks e = new ChairWithDicks();
		ChairWithPeaks f = new ChairWithPeaks();
		ChairWithDicks g = new ChairWithDicks();
		ChairWithPeaks h = new ChairWithPeaks();
		Man A= Man.You;
		Man B=Man.Mom;
		Petuh p = new Petuh(69);
		Muzhik m=new Muzhik(228);
		
		
		
		System.out.println(p.Solve(a, b, A, B));
		System.out.println(p.Solve(a, b, A, B));
		System.out.println(p.Solve(a, a, A, B));
		System.out.println(p.Solve(b, a, A, B));
		System.out.println(p.Solve(b, b, A, B));
		System.out.println(m.Solve(a, b, A, B));
		System.out.println(m.Solve(a, a, A, B));
		System.out.println(m.Solve(b, a, A, B));
		System.out.println(m.Solve(b, b, A, B));
		
		Map<Integer, Chair> map = new HashMap<Integer, Chair>();
		map.put(1,a);
		map.put(2,b);
		map.put(3,c);
		map.put(4,d);
		map.put(5,e);
		map.put(6,f);
		map.put(7,g);
		map.put(8,h);
		int peaksCount = 0;
		int dicksCount = 0;
		for(Entry entry: map.entrySet())
		{
			
			Object a1 = entry.getValue();
			if(a1 instanceof ChairWithPeaks)
			{
				peaksCount++;	
			}
			if(a1 instanceof ChairWithDicks)
			{
				dicksCount++;	
			}
		}
		System.out.println("Chairs with peaks: "+peaksCount+" Chairs with dicks: "+dicksCount);
		Zek fyodor=new Zek()
		{
			public String Solve(Chair a, Chair b, Man A, Man B) 
			{
				return "»ди на фиг";
			}
			
		};
		System.out.println(fyodor.Solve(a, b, A, B));
		System.out.println(fyodor.Solve(a, a, A, B));
		
		System.out.println(p.Solve(a, b, A, A));
	}


}
