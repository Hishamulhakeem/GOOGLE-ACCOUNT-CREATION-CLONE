package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller4 extends Controller1 implements Initializable{
	
	@FXML
	private TextField t7;
	@FXML
	private Button n4;
	@FXML
	private Label l1;
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	private String cssStyle = "-fx-border-color: #ff0022; -fx -border-width: 2px;";
	
	public void next4(ActionEvent event) throws IOException {
		
		
		

		String text = t7.getText();
		if(text.isEmpty()) {
			text="null";

		}
		
		if(text=="null") {
			l1.setText("! Enter a Gmail address");
			l1.setTextFill(Color.RED);
			t7.setStyle(cssStyle);
			t7.requestFocus();
			
			
			
		} 			
	
			
				
			
		 else {
			FXMLLoader loader =new FXMLLoader (getClass().getResource("Scene5.fxml"));
			
			root=loader.load();
			
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene  = new Scene(root);
			
			stage.setScene(scene);
			stage.show(); 
		}
		
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
			t7.textProperty().addListener((observable, oldValue, newValue) -> {
				share2.getInstance().setTextValue(newValue);
			});
			
		
		
	}
	
	

}
