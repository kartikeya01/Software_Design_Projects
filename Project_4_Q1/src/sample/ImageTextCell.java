package sample;

import javafx.scene.control.ListCell;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

public class ImageTextCell extends ListCell<Contact>{

    private ImageView imageView = new ImageView();
    private Label label = new Label();
    private VBox vBox = new VBox(10.0);

    public ImageTextCell(){
        vBox.setAlignment(Pos.CENTER);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(100.0);
        vBox.getChildren().add(imageView);

        label.setWrapText(true);
        label.setTextAlignment(TextAlignment.CENTER);
        vBox.getChildren().add(label);

        setPrefWidth(USE_PREF_SIZE);

    }

    @Override
    protected void updateItem(Contact item, boolean empty){
        super.updateItem(item, empty);

        if(empty || item==null){
            setGraphic(null);
        } else {
            imageView.setImage(new Image(item.getImagePath()));
            label.setText(item.getLastName() + ", " + item.getFirstName());
            setGraphic(vBox);
        }
    }
}