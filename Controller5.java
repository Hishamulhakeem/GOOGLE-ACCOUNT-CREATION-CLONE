package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class Controller5 implements Initializable{
	
	@FXML
	private PasswordField p;
	@FXML
	private Label l6;
	@FXML
	private Button n5;
	@FXML
	private CheckBox showpass;
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	private String cssStyle = "-fx-border-color: #ff0022; -fx -border-width: 2px;";
	
	String ot="";
	
	
	
	
	public void next5(ActionEvent event) throws IOException {
		
		if(p.getText()==null)
		{
			l6.setText("! Enter a password");
			p.setStyle(cssStyle);
			
			
			
			
		}else {
			
						
			
			FXMLLoader loader =new FXMLLoader (getClass().getResource("Scene6.fxml"));
			root=loader.load();
			
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

		showpass.setOnAction(event -> {
			if(showpass.isSelected()) {
				ot=p.getText();
				
				p.setPromptText(ot);
				p.setText(ot);
			}else {
				p.setText("");
				p.setPromptText(ot);
			}
		});
		p.textProperty().addListener((observable, oldValue, newValue) ->{
			if(showpass.isSelected()) {
				ot=newValue;
			}
		});
		

	}

	

}
