import java.io.*;
class P3 {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
        br.close(); 
    }
}
