package application;

import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.stage.Stage;

public class Controller6 {
	
	@FXML
	private Button n6,n7,n0,n9;
	@FXML
	private Label b1,name1,name2,label;
	private Parent root;
	private Stage stage;
	private Scene scene;	
	
	public void next9() {
		
	}
	public void next6(ActionEvent event) throws IOException {
		FXMLLoader loader =new FXMLLoader (getClass().getResource("Scene7.fxml"));
		root=loader.load();
		
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
		
		JOptionPane.showConfirmDialog(null," Do u agree to create a Google account ?", "This is to confirm",JOptionPane.YES_NO_CANCEL_OPTION);
		}
		
	}
	


