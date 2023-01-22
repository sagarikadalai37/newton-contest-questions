import java.io.*;

import java.util.*;







public class Main {

     

    public static int maxDigit(Long x){

        int mx=0;

        while(x>0){

            long cur=x%10;

            x/=10;

            mx=Math.max(mx,(int)cur);

        }

        return mx;

    }

    public static void main(String[] args) {

        

        InputStream inputStream = System.in;

        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);

        OutputWriter out = new OutputWriter(outputStream);

        

        int n=Integer.parseInt(in.next());

        int ans=0;

        for(int i=1;i<=n;i++){

            long x=Long.parseLong(in.next());

            ans += maxDigit(x);

        }

        out.print(ans);

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
