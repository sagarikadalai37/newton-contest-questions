import java.io.*; // for handling input/output
import java.util.*;
class Main {
	public static void main (String[] args) throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	for(int j=0;j<t;j++)
	{
		int n=Integer.parseInt(br.readLine());
		Queue<Integer> q=new LinkedList<>();
		int i=1;
		while(i<=n)
		{
			if(i>9)
			{
				break;
			}
			System.out.print(i+" ");
			q.add(i);
			i++;
		}
		int newJumpingNo;
		while(n>9)
		{
			i=q.remove();
			int lastDigit=i%10;
			if(lastDigit==0)
			{
				newJumpingNo=i*10+1;
				if(newJumpingNo>n)
				{
					break;
				}
				System.out.print(newJumpingNo+" ");
				q.add(newJumpingNo);
			}
			else if(lastDigit==9)
			{
				newJumpingNo=i*10+8;
				if(newJumpingNo>n)
				{
					break;
				}
				System.out.print(newJumpingNo+" ");
				q.add(newJumpingNo);
			}
			else{
				newJumpingNo=i*10+(lastDigit-1);
				if(newJumpingNo>n)
				{
					break;
				}
				System.out.print(newJumpingNo+" ");
				q.add(newJumpingNo);

				newJumpingNo=i*10+(lastDigit+1);
				if(newJumpingNo>n)
				{
					break;
				}
				System.out.print(newJumpingNo+" ");
				q.add(newJumpingNo);
			}
		}
		System.out.println();
	}
	}
}
