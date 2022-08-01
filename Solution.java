import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

class Solution {

    public static int mod = 1000000007;
    public static PrintWriter out = new PrintWriter(System.out);
    public static boolean testing = true;
    public static FastIO io;
    public static String input_file = "./input.txt";

    static {
        try {
            io = new FastIO();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
    }


    static class FastIO {
        InputStreamReader s = new InputStreamReader(testing ? new FileInputStream(input_file) : System.in);
        BufferedReader br = new BufferedReader(s);
        StringTokenizer st = new StringTokenizer("");

        FastIO() throws FileNotFoundException {
        }

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
