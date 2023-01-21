import java.io.*;
import java.util.*;



class Main {
	public static void main (String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int len=str.length();
		HashSet<String> set=new HashSet<>();
		char arr[]=null;
		for(int i=0;i<len;++i)
		{
			for(int j=i+1;j<=len;++j)
			{
				arr=str.substring(i,j).toCharArray();
				Arrays.sort(arr);

				set.add(new String(arr));
			}
		}
		System.out.print(set.size());
	}
}
