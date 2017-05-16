import java.io.*;

class Main
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        int x = Integer.parseInt(br.readLine());
        int multiples[] = {1,2,3};

        for (int n: multiples) {
            System.out.println((int)Math.pow(x, n));
        }
    }
}