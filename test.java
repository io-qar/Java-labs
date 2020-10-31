import java.io.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();

        try (FileWriter writer = new FileWriter("notes.txt", false)) {
            writer.write(str);
        } catch (IOException ex) {System.out.println(ex.getMessage());}

        try(FileReader reader = new FileReader("notes.txt"))
        {
            int c;
            System.out.print("Text from the file: ");
            while((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
            System.out.print("\n");
        }
        catch(IOException ex) {System.out.println(ex.getMessage());}

        System.out.print("Input a new string: ");
        String newStr = in.nextLine();

        try (FileWriter writer = new FileWriter("notes.txt", false)) {
            writer.write(newStr);
        } catch (IOException ex) {System.out.println(ex.getMessage());}

        System.out.print("Input string you want to add in your file: ");
        String addStr = in.nextLine();

        try (FileWriter writer = new FileWriter("notes.txt", true)) {
            writer.write(addStr);
        } catch (IOException ex) {System.out.println(ex.getMessage());}

        System.out.print("Done!");
    }
}