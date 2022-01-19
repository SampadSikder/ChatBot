package Main_Code;


import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class getReply{
    String message;

    public getReply(String msg){
        this.message=msg;
    }

    LocalDate date = LocalDate.now();
    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formattedDate = time.format(dtf);

    public String getRep() throws InterruptedException {
        if(message.toLowerCase().contains("hello")){
            return "Hello my friend.";
        }
        else if(message.toLowerCase().trim().contains(" morning"))
        {
            return "Good morning.";
        }
        else if(message.toLowerCase().trim().contains("afternoon"))
        {
            return "Good afternoon.";
        }
        else if(message.toLowerCase().trim().contains("tell me something")
                | message.toLowerCase().trim().contains("help"))
        {
            return "Yes, how can I help?";
        }
        else if(message.toLowerCase().trim().contains("what do you do")
                | message.toLowerCase().trim().contains("what are u doing")
                | message.toLowerCase().trim().contains("what is your name")
                | message.toLowerCase().trim().contains("what is ur name")
                | message.toLowerCase().trim().contains("what do u do")
                | message.toLowerCase().trim().contains("what are u")
                | message.toLowerCase().trim().contains("what is your purpose?")
                | message.toLowerCase().trim().contains("what are you")){
            return "I am a chat bot and I reply to messages using pre-recorded responses.";
        }

        else if(message.toLowerCase().trim().contains("Who made you?")|
                message.toLowerCase().trim().contains("creator")|
                message.toLowerCase().trim().contains("why are you made?")
            )
        return "I am made by the students of IIT for their OOP project.";

        else if(message.toLowerCase().trim().contains("are you ok")
                | message.toLowerCase().trim().contains("how are you")
                | message.toLowerCase().trim().contains("how do you do")
                | message.toLowerCase().trim().contains("how are you doing")
                | message.toLowerCase().trim().contains("good")
                | message.toLowerCase().trim().contains("great")
                | message.toLowerCase().trim().contains("are u ok")
                | message.toLowerCase().trim().contains("fine")
                | message.toLowerCase().trim().contains("amazing")
                | message.toLowerCase().trim().contains("yeah great. ")){
            return "Yes, I am great!";
        }

        else if(message.toLowerCase().trim().contains("okay")
                | message.toLowerCase().trim().contains("ok"))
        {
            return "Okay.";
        }

        else if(message.toLowerCase().trim().contains("😂"))
        {
            return "🤪.";
        }

        else if(message.toLowerCase().trim().contains("do you understand me?")
                | message.toLowerCase().trim().contains("do you understand")
                | message.toLowerCase().trim().contains("can you understand")
                | message.toLowerCase().trim().contains("understand")
                | message.toLowerCase().trim().contains("can you talk to me"))
            return "I am sorry, I cannot adapt to reply to messages that do not have detectable keywords.";

        else if(//message.toLowerCase().trim().contains("what is the weather today")
                message.toLowerCase().trim().contains("what date is today")
                        | message.toLowerCase().trim().contains("what date is it today")
                        | message.toLowerCase().trim().contains("date"))
            //| message.toLowerCase().trim().contains("what is my name")
            //| message.toLowerCase().trim().contains("who made you")
            //| message.toLowerCase().trim().contains("who am I"))
            return "The date is: "+date;

        else if(message.toLowerCase().trim().contains("what is the time")
                | message.toLowerCase().trim().contains("what time")
                | message.toLowerCase().trim().contains("time"))
            return "The time is: "+formattedDate;

        else if(message.toLowerCase().trim().contains("how was your day?"))
            return "It was and always will be great\n What about you?";

        else if (message.toLowerCase().trim().contains("really")
                | message.toLowerCase().trim().contains("indeed")
                | message.trim().contains("sure!"))
            return "Yes.";

        else if (message.toLowerCase().trim().contains("love you")
                | message.toLowerCase().trim().contains("love u") |
                message.trim().contains("like u") |
                message.trim().contains("like you"))
            return "Me too!";
        else if (message.toLowerCase().trim().contains("bye"))
                //| message.toLowerCase().trim().contains("love u") |
                //message.trim().contains("like u") |
               // message.trim().contains("like you"))
            return "See you!";

        else
            return "I can't understand you.";
    }

}
