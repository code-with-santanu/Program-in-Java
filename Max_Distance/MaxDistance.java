import java.util.ArrayList;

public class MaxDistance {
	public static int maxDiff(ArrayList<Integer> a, int n) {
		// Write your code here.
		int i,j,m=0;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a.get(i)<=a.get(j))
				{
					m= max(m,(j-i));
				}
			}
		}

		return m;
	}

	public static int max(int a, int b)
	{
		if(a>b)
			return a;
		return b;
	}
}


// problem 1 link : https://www.codingninjas.com/studio/problems/maximum-distance_1170523?topList=top-google-coding-interview-questions&leftPanelTab=0

// problem 2 - https://www.codingninjas.com/studio/problems/ayush-gives-ninjatest_1097574?topList=top-google-coding-interview-questions