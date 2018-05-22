import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain {
    public static void main(String[] args){
        Notepad notepad = new Notepad("log.txt");
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                System.out.print("Commands: end/modify/undo/redo\nCommand: ");
                String command = input.readLine();
                switch(command){
                    case "end":
                        return;
                    case "modify":
                        notepad.save();
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
