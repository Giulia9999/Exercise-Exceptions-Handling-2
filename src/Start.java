import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                System.out.println("Enter the dividend: ");
                int dividend = Integer.parseInt(reader.readLine());
                System.out.print("Enter the divisor: ");
                int divisor = Integer.parseInt(reader.readLine());
                if (divisor == 0) {
                    throw new ZeroException();
                }
                int division = dividend / divisor;
                System.out.println(division);
            }catch(IOException e){
                throw new RuntimeException();
            } catch (ZeroException e) {
                throw new RuntimeException(e);
            }
        }
    }
}