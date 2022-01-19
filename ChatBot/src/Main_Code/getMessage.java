package Main_Code;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class getMessage{

    public void getMessage(){

    }
    @FXML
    Button Send;
    @FXML
    TextField Message;
    @FXML
    TextArea TextArea2;
    @FXML
    AnchorPane Pane;
    @FXML
    ImageView Background;
    //Stage stage;
    //String font;


    FileSave save=new SaveText();

    String message;
    String textarea;



    public void Send(ActionEvent event){//if send button is pressed
        try {
            message = Message.getText();
            TextArea2.setWrapText(true);
            TextArea2.appendText("User: " + message + "\n");
            getReply rep = new getReply(message);
            String reply = rep.getRep();
            SoundFx sound = new Sounds();
            //Thread.sleep(500);
            if(message.isEmpty()){
                sound.ErrorSound();
            }
            else{
                sound.SendSound();
            }
            TextArea2.appendText("Bot: "+reply + "\n");
            Message.clear();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void Send(){//if enter is pressed
        try {
            TextArea2.setWrapText(true);
            message = Message.getText();
            //Thread.sleep(100);

            TextArea2.appendText("User: " + message + "\n");
            getReply rep = new getReply(message);
            String reply = rep.getRep();
            SoundFx sound = new Sounds();
            if(message.isEmpty()){
                sound.ErrorSound();
            }
            else{
                sound.SendSound();
            }
            //BoxBlur blur = new BoxBlur();
            //Thread.sleep(1000);
            TextArea2.appendText("Bot: " + reply + "\n");
            Message.clear();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void SaveFile(ActionEvent e){//to save convo as a text file
        textarea = TextArea2.getText();
        save.save(textarea);
    }

    public void load(ActionEvent e){//to load previously saved convo
        String loader;
        loader= save.LoadText();
        TextArea2.appendText(loader);
    }

    public void Edit(ActionEvent e){//to access the text area
        TextArea2.setEditable(true);
    }
    public void Lock(ActionEvent e){//to lock the text area(privacy measure)
        TextArea2.setEditable(false);
    }

    public void Grad_1(ActionEvent e){
        GetImage im = new GetImage();
        Background.setImage(im.getImage(1));
   }
    public void Grad_2(ActionEvent e){
        GetImage im = new GetImage();
        Background.setImage(im.getImage(2));
    }
    public void Grad_3(ActionEvent e){
        GetImage im = new GetImage();
        Background.setImage(im.getImage(3));
    }

    public void Arial(ActionEvent e){
        TextArea2.setFont(Font.font("Arial",17));
    }
    public void Cambria(ActionEvent e){
        TextArea2.setFont(Font.font("Cambria",17));
    }
    public void Georgia(ActionEvent e){
        TextArea2.setFont(Font.font("Georgia",17));
    }
    public void Times_New_Roman(ActionEvent e){
        TextArea2.setFont(Font.font("Times New Roman",17));
    }
    public void Comic_Sans(ActionEvent e){
        TextArea2.setFont(Font.font("Comic Sans MS",17));
    }



}
