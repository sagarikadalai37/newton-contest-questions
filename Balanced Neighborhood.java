import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        InputStream inputStream = System.in;

        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);

        OutputWriter out = new OutputWriter(outputStream);

        int n=Integer.parseInt(in.next());

        int m=Integer.parseInt(in.next());

        int a[][] = new int[n][m];

        for(int i=0;i<n;i++)

        {

        for(int j=0;j<m;j++){

        a[i][j] = Integer.parseInt(in.next());

        }

        }

        int f=1;

        for(int i=1;i+1<n;i++){

        for(int j=1;j+1<m;j++){

        int sum=a[i+1][j] + a[i-1][j] + a[i][j+1] + a[i][j-1];

        if(sum%2 != 0){

        f=-1;

        break;

        }

        }

        if(f==-1)break;

        }

        if(f==1)out.print("YES");

        else out.print("NO");

        out.close();

        }

        static class InputReader {

        BufferedReader reader;

        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {

        reader = new BufferedReader(new InputStreamReader(stream), 32768);

        tokenizer = null;

        }

        public String next() {

        while (tokenizer == null || !tokenizer.hasMoreTokens()) {

        try {

        tokenizer = new StringTokenizer(reader.readLine());

        } catch (IOException e) {

        throw new RuntimeException(e);

        }

        }

        return tokenizer.nextToken();

        }

        public int nextInt() {

        return Integer.parseInt(next());

        }

        }

        static class OutputWriter {

        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {

        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));

        }

        public OutputWriter(Writer writer) {

        this.writer = new PrintWriter(writer);

        }

        public void print(Object... objects) {

        for (int i = 0; i < objects.length; i++) {

        if (i != 0) {

        writer.print(' ');

        }

        writer.print(objects[i]);

        }

        }

        public void println(Object... objects) {

        print(objects);

        writer.println();

        }

        public void close() {

        writer.close();

        }

        public void println(int i) {

        writer.println(i);

        }
    }
}
