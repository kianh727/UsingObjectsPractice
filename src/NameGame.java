import java.util.Scanner;

public class NameGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();


        String lyrics = generateNGL(name);
        System.out.println(lyrics);

    }
        public static String generateNGL(String name){
            String modifiedName = name.substring(1).toLowerCase();

            String line1 = name + " " + name + " bo B" + modifiedName;
            String line2 = name + " banana fana fo F" + modifiedName;
            String line3 = name + " fee fi mo M" + modifiedName;

            return line1 + ",\n" + line2 + ",\n" + line3 + ",\n" + name + "!";
        }
    }
