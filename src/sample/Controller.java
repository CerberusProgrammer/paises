package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    List<Pais> paises;

    @FXML
    private ImageView espana;

    @FXML
    private ImageView mexico;

    @FXML
    private ImageView alemania;

    @FXML
    private ImageView argentina;

    @FXML
    private ImageView canada;

    @FXML
    private ImageView portugal;

    @FXML
    private ImageView chile;

    @FXML
    private ImageView colombia;

    @FXML
    void change(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        espana.setVisible(false);
        mexico.setVisible(false);
        alemania.setVisible(false);
        argentina.setVisible(false);
        canada.setVisible(false);
        portugal.setVisible(false);
        chile.setVisible(false);
        colombia.setVisible(false);
    }
}
