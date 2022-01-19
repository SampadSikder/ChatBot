package Main_Code;

import javafx.scene.image.Image;

public class GetImage {
    Image im1 = new Image("/Image/GRAD_1.jpg");
    Image im2 = new Image("/Image/GRAD_2.jpg");
    Image im3 = new Image("/Image/GRAD_3.jpg");

    public Image getImage(int i){
        if(i==1){
            return im1;
        }
        else if(i==2){
            return im2;
        }
        else return im3;
    }
}
