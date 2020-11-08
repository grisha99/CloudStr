package client;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    TableView localFilesView;

    public void menuExitClick(ActionEvent actionEvent) {
        Platform.exit();
    }
}
