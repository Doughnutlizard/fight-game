import java.util.*;
import java.io.*;

public class tests {
    public static void main(String[] args) throws FileNotFoundException {
        Test("characters.txt");
    }
    public static void Test(String fileName) throws FileNotFoundException {
        Scanner fileRead = new Scanner(new File(fileName));
        while(fileRead.hasNextLine()) {
            Scanner lineRead = new Scanner(fileRead.nextLine());
            int dmg = 0;
            String name = lineRead.next();
            System.out.println(name + "'s base atk is " + lineRead.nextInt());
            System.out.println(name + "'s chance to miss is " + (100 - lineRead.nextInt()) + "%");
            System.out.println(name + "'s base health is " + lineRead.nextInt());
            System.out.println(name + "'s incoming damage multiplier is " + lineRead.nextDouble());
            lineRead.close();
        }
        fileRead.close();
    }
}
