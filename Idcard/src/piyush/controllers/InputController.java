package piyush.controllers;

import com.sun.prism.Image;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import piyush.Main;

import java.awt.*;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class InputController {
    @FXML
    private TextField name;
    @FXML
    private TextField profession;
    @FXML
    private TextField gender;
    @FXML
    private DatePicker dob;
    @FXML
    private TextField bp;
    @FXML
    private TextField phone;
    @FXML
    private TextField address;

    @FXML
    private Label NAME;
    @FXML
    private Label PRO;
    @FXML
    private Label GENDER;
    @FXML
    private Label DOB;
    @FXML
    private Label BP;
    @FXML
    private Label PHONE;
    @FXML
    private Label ADDRESS;

    private ArrayList<String> Details =new ArrayList<>();
    private ArrayList<String> Image = new ArrayList<>();


    public void openIDwindow(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/piyush/resources/Card.fxml"));
            Parent root = loader.load();
            Main.getIdstage().setScene(new Scene(root));

            CardController cardController =loader.getController();
            cardController.initializeImage(Image);
            cardController.initializeDetails(Details);

            Main.getIdstage().show();
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }

    public void CLR(MouseEvent mouseEvent) {
        name.clear();
        profession.clear();
        gender.clear();
        dob.getEditor().clear();
        bp.clear();
        phone.clear();
        address.clear();
        Details.clear();
        Image.clear();
        System.out.println(Details);
        

    }

    public void addImage(String image){
        this.Image.add(image);
    }


    public void addDetails(String Name, String Pro,
                           String Gen, String birth_date,
                           String birth_place, String phoneNo, String Add){

        this.Details.add(Name);
        this.Details.add(Pro);
        this.Details.add(Gen);
        this.Details.add(birth_date);
        this.Details.add(birth_place);
        this.Details.add(phoneNo);
        this.Details.add(Add);
    }

    public void takepic(MouseEvent mouseEvent) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files","*.jpg"));

        File selectedFile = fc.showOpenDialog(null);
        if(selectedFile !=null) {
             String image_path= selectedFile.getAbsolutePath();
             System.out.println(image_path);
             addImage(image_path);

        }
        else{
            System.out.println("invalid file");
        }

    }

    public void createId(MouseEvent mouseEvent) {
        String Name = name.getText();
        String Pro = profession.getText();
        String Gen = gender.getText();
        String birth_date = dob.getEditor().getText();
        String birth_place = bp.getText();
        String phoneNo = phone.getText();
        String Add = address.getText();
        System.out.println(birth_date);

        addDetails(Name,Pro,Gen,birth_date,birth_place,phoneNo,Add);
        System.out.println(Details);
        System.out.println(Image);

        openIDwindow();

    }


}
