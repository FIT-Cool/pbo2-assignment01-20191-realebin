package com.febrina.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

/**
 * class SuitController
 * @author = Febrina Anastasha 1772006
 */

public class SuitController {
    public TextField winPane;
    public TextField drawPane;
    public TextField losePane;
    public ImageView pilUser;
    public ImageView pilComp;
    public int pil=0;
    public int draw=0;
    public int win=0;
    public int lose=0;
    Random rnd = new Random();
    int a = rnd.nextInt(3);

    /**
     * class exitAction
     * @author = Febrina Anastasha 1772006
     */


    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    /**
     * class paperAction
     * @author = Febrina Anastasha 1772006
     */

    public void paperAction(ActionEvent actionEvent) {
        pilUser.setImage(new Image("image/kertas.png"));
        pil = 0;
        hasil(a);
        a = rnd.nextInt(3);

    }
    /**
     * class rockAction
     * @author = Febrina Anastasha 1772006
     */


    public void rockAction(ActionEvent actionEvent) {
        pilUser.setImage(new Image("image/batu.png"));
        pil = 1;
        hasil(a);
         a = rnd.nextInt(3);
    }
    /**
     * class scissorsAction
     * @author = Febrina Anastasha 1772006
     */

    public void scissorsAction(ActionEvent actionEvent) {
        pilUser.setImage(new Image("image/gunting.png"));
        hasil(a);
        pil=2;
         a = rnd.nextInt(3);
    }
    /**
     * class hasil
     * @author = Febrina Anastasha 1772006
     */

    public void hasil(int pilihan)
    {
        if( pilihan == 0){
            pilComp.setImage(new Image("image/kertas.png"));
        }
        else if( pilihan == 1){
            pilComp.setImage(new Image("image/batu.png"));
        }
        else{
            pilComp.setImage(new Image("image/gunting.png"));
        }

        if(pilihan == pil){
            draw +=1;
            drawPane.setText(String.valueOf(draw));
        }
        else if(pilihan==0 && pil==1){
            lose+=1;
            losePane.setText(String.valueOf(lose));
        }
        else if(pilihan==1 && pil==2){
            lose+=1;
            losePane.setText(String.valueOf(lose));
        }
        else if(pilihan==2 && pil==0){
            lose+=1;
            losePane.setText(String.valueOf(lose));
        }
        else {
            win+=1;
            winPane.setText(String.valueOf(win));
        }
    }
}
