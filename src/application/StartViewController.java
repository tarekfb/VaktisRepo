package application;

import java.awt.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartViewController {
	@FXML
	Button btnRoleJanitor;
	@FXML
	Label lblSelectRole;
	
	@FXML
	public void btnRoleJanitor_Click(ActionEvent event) {
		Stage stage = null;
		Parent root = null;
		if (event.getSource()==btnRoleJanitor){
			try {
				stage = (Stage) btnRoleJanitor.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("JanitorView.fxml"));       
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
