/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author rafae
 */
public class CeldaImagenTexto extends ListCell<Animal> {

    private VBox cell;
    private ImageView imagenAnimal;
    private Label nombreAnimal;
    public CeldaImagenTexto() {
        cell = new VBox();
        nombreAnimal = new Label();
        imagenAnimal=new ImageView();
        nombreAnimal.setWrapText(true);
        nombreAnimal.setTextAlignment(TextAlignment.CENTER);
        imagenAnimal.setFitHeight(100);
        cell.setPrefWidth(this.getWidth());
        cell.setAlignment(Pos.CENTER);
    }

    @Override
    protected void updateItem(Animal item, boolean empty) {
        super.updateItem(item, empty); //To change body of generated methods, choose Tools | Templates.
        if (item != null) {
            imagenAnimal.setImage(new Image(item.getImagenMiniatura()));
            cell.getChildren().add(imagenAnimal);
            nombreAnimal.setText(item.getNombre());
            cell.getChildren().add(nombreAnimal);
            setGraphic(cell);
        } else {
            setGraphic(null);
        }
    }
}
