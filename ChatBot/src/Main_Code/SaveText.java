package Main_Code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class SaveText extends FileSave{

    public void save(String text){
        try {
            File f = new File("E:\\OOP\\JavaFX\\ChatBot\\TextFiles\\Conversations.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(text);
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public String LoadText(){
        try {
            FileInputStream fis = new FileInputStream("E:\\OOP\\JavaFX\\ChatBot\\TextFiles\\Conversations.txt");
            byte[] buffer = new byte[10];
            StringBuilder sb = new StringBuilder();

            while (fis.read(buffer) != -1) {
                sb.append(new String(buffer));
                buffer = new byte[10];
            }
            fis.close();
            String s = sb.toString();
            return s;

        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
