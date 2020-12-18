package sample;

import javafx.scene.image.ImageView;

public class Pais {

    String name;
    String capital;
    String fundacion;
    String extension;
    ImageView bandera;

    public Pais(String name, String capital, String fundacion, String extension, ImageView bandera) {
        this.name = name;
        this.capital = capital;
        this.fundacion = fundacion;
        this.extension = extension;
        this.bandera = bandera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public ImageView getBandera() {
        return bandera;
    }

    public void setBandera(ImageView bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return "Nombre = " + name + '\n' +
                "Capital = " + capital + '\n' +
                "Fundacion = " + fundacion + '\n' +
                "Extension = " + extension;
    }
}
