package piyush.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.ArrayList;


public class CardController {
    @FXML
    private Label DOB;
    @FXML
    private Label Name;
    @FXML
    private Label Profession;
    @FXML
    private Label ADDRESS;
    @FXML
    private Label PHONE;
    @FXML
    private Label CITY;
    @FXML
    private Label GENDER;

    @FXML
    private ImageView profilepic;

    public void initializeImage(ArrayList<String> Image){
        String path = Image.get(0);
        File file = new File(path);
        Image image = new Image(file.toURI().toString());
        profilepic.setImage(image);
    }

    public void initializeDetails(ArrayList<String> Details){
        Name.setText(Details.get(0));
        Profession.setText(Details.get(1));
        GENDER.setText(Details.get(2));
        CITY.setText(Details.get(4));
        PHONE.setText(Details.get(5));
        ADDRESS.setText("Address: "+Details.get(6));
        DOB.setText("DOB: "+Details.get(3));

    }
}
