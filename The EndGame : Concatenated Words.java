import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static List<String> findConcate(String[] words) {
        List<String> list = new ArrayList<>();
        Set<String> dictionary = new HashSet<>();
        for(String string : words) dictionary.add(string);
        for(String word:words) {
            dictionary.remove(word);
            if(check(word,dictionary)) list.add(word);
            dictionary.add(word);
        }
        return list;
        
    }

    public static boolean check(String word,Set<String> dictionary) {
        if(dictionary.contains(word)) return true;
        int i = word.length() - 1;
        while(i >= 1) {
            if(dictionary.contains(word.substring(0,i)) && check(word.substring(i),dictionary)) return true;
            i--;
        }
        return false;
    }
    
    
    
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String words[]=new String[n];
		for(int i=0;i<n; i++){
		    words[i]=s.next();
		}
		// System.out.print(findConcate(words));
        List<String>ans=findConcate(words);
        for(String i: ans){
            System.out.print(i+" ");
        }

        if(ans.size()==0){
            System.out.print("-1");
        }
	}
    
}
