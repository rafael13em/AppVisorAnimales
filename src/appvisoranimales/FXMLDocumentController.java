/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

/**
 *
 * @author rafae
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ListView<Animal> listaAnimales;
    @FXML
    private ImageView imagenAnimales;
    
    private ObservableList<Animal> obListAnimal;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        imagenAnimales.setFitWidth(imagenAnimales.getFitWidth());
        imagenAnimales.setFitHeight(imagenAnimales.getFitHeight());
        obListAnimal = FXCollections.observableArrayList();
        
        obListAnimal.add(new Animal("Perroooooooooooooooooooooooooooooooooooooooooooooooooo","imagenes/thumbperro.jpg","imagenes/perro.jpg"));
        obListAnimal.add(new Animal("Gato","imagenes/thumbgato.jpg","imagenes/gato.jpg"));
        obListAnimal.add(new Animal("Pajaro","imagenes/thumbpajaro.jpg","imagenes/pajaro.jpg"));
        listaAnimales.setItems(obListAnimal);
        
        listaAnimales.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                Animal value = (Animal) newValue;
                imagenAnimales.setImage(new Image(value.getImagenGrande()));
            }
        });
        
        listaAnimales.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());
    }    
    
}
