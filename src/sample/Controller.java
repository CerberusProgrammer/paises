package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    ArrayList<ImageView> paises = new ArrayList<>();

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
    void change(MouseEvent event) {
        if (!event.getSource().equals(paises.get(paises.size() - 1))) {
            ((ImageView)event.getSource()).setVisible(false);
            paises.get(paises.indexOf(event.getSource()) + 1).setVisible(true);
        }
    }

    @FXML
    void randomize(ActionEvent event) {
        Collections.shuffle(paises);

        for (ImageView i : paises)
            i.setVisible(false);

        paises.get(0).setVisible(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Pais alemaniaP = new Pais("Alemania", "Berlín", "3 de octubre de 1990", "357,386 km²", alemania);
        Pais argentinaP = new Pais("Argentina", "Buenos Aires", "9 de julio de 1816", "2.78 millones km²", argentina);
        Pais canadaP = new Pais("Canada", "Ottawa", "1 de julio de 1867", "9.985 millones km²", canada);
        Pais chileP = new Pais("Chile", "Santiago de Chile", "18 de septiembre de 1810", "756,950 km²", chile);
        Pais colombiaP = new Pais("Colombia", "Bogotá", "20 de julio de 1810", "1.143 millones km²", colombia);
        Pais espanaP = new Pais("Espana", "Madrid", "6 de diciembre de 1978", "505,990 km²", espana);
        Pais mexicoP = new Pais("Mexico", "Ciudad de Mexico", "16 de septiembre de 1810", "1.973 millones km²", mexico);
        Pais portugalP = new Pais("Portugal", "Lisboa", "5 de octubre de 1143", "92,212 km²", portugal);

        Tooltip.install(alemania, new Tooltip(alemaniaP.toString()));
        Tooltip.install(argentina, new Tooltip(argentinaP.toString()));
        Tooltip.install(canada, new Tooltip(canadaP.toString()));
        Tooltip.install(chile, new Tooltip(chileP.toString()));
        Tooltip.install(colombia, new Tooltip(colombiaP.toString()));
        Tooltip.install(espana, new Tooltip(espanaP.toString()));
        Tooltip.install(mexico, new Tooltip(mexicoP.toString()));
        Tooltip.install(portugal, new Tooltip(portugalP.toString()));

        paises.add(alemania);
        paises.add(argentina);
        paises.add(canada);
        paises.add(chile);
        paises.add(colombia);
        paises.add(espana);
        paises.add(mexico);
        paises.add(portugal);
    }
}
