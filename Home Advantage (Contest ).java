import java.io.*;

import java.util.*;









public class Main {

    

    private static int upper_bound(Integer arr[],int n, int key)

    {

        int l=0,r=n-1;

        int ans=n;

        while(l<=r){

            int i=(l+r)/2;

            if(arr[i] > key){

                ans=i;

                r=i-1;

            }

            else l=i+1;

        }

        return ans;

    }

    

    public static void main(String[] args) {

        

        InputStream inputStream = System.in;

        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);

        OutputWriter out = new OutputWriter(outputStream);

        

        int n=Integer.parseInt(in.next());

       

        Integer a[] = new Integer[n];

        Integer c[] = new Integer[n];

        for(int t=0;t<n;t++){

            a[t] = Integer.parseInt(in.next());

            c[t]=a[t];

        }

        Integer b[] = new Integer[n];

        for(int t=0;t<n;t++){

            b[t] = Integer.parseInt(in.next());

        }

        

        Arrays.sort(c);

        

        

        for(int i=0;i<n;i++){

            int x = upper_bound(c,n,a[i] + b[i]);

            x--;

            out.print(x+" ");

        }

       

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
