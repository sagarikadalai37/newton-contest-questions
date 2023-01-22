import java.util.*;
import java.io.*;
class Main
{

 public static List<String> repeatedString(String str){
	 HashMap<String, Integer> map = new HashMap<>();
		List <String>list = new ArrayList<>();
 	int p1= 0;
	int p2 = 10;

	while(p2 <= str.length()){
		String temp = str.substring(p1,p2);

		if(map.containsKey(temp))
		{
			if(!list.contains(temp)){
				list.add(temp);
			}
		}else{
	map.put(temp,1);
		}

		p1++; p2++;

	}
return list;

 }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

		List<String> list = repeatedString(str);
		Collections.sort(list);

		if(list.size() != 0)
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		else
		System.out.print(-1);

		System.out.println();
	}
}
