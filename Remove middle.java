public static Stack<Integer> deleteMid1(Stack<Integer> s, int N, int count)

    {

        // if current is equal to half of size of stack

        if(count == N/2)

        {

            s.pop();

            return s;

        }



        int x=s.peek();

        s.pop();

        count += 1;



        // recursively call deleteMid

        s = deleteMid1(s,N,count);

        s.push(x);



        return s;

    }

    public static Stack<Integer> deleteMid(Stack<Integer> s, int N)

    {

      return deleteMid1(s,N,0);

    }
