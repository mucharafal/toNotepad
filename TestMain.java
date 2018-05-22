import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args){
        Notepad notepad = new Notepad("log.txt");
        try {
            Scanner input = new Scanner(System.in);
            while (true){
                System.out.print("Commands: quit/modify/undo/redo\nEnd modifying by typing :end\n");
                System.out.print(notepad.toString());
                System.out.print("Command: ");
                String command = input.nextLine();

                switch(command){
                    case "quit":
                        return;
                    case "modify":
                        StringBuilder newText = new StringBuilder();
                        String currentLine = input.nextLine();
                        while (!currentLine.equals(":end")) {
                            newText.append(currentLine);
                            newText.append("\n");
                            currentLine = input.nextLine();
                        }
                        notepad.save(newText.toString());
                        break;
                    case "undo":
                        notepad.undo();
                        break;
                    case "redo":
                        notepad.redo();
                        break;
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
