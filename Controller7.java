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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Controller7 implements Initializable {
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	@FXML
	private Label name1,name2;
	@FXML
	private ImageView img;
	@FXML
	private Button n0;

	Image myImage = new Image(getClass().getResourceAsStream("logo.jpeg"));
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String textValue1=share.getInstance().getTextValue();
		String textValue2=share2.getInstance().getTextValue();
		name1.setText(textValue1);
		name2.setText(textValue2);
		img.setImage(myImage);
	}
	
public void nx(ActionEvent event) throws IOException {
		
		FXMLLoader loader =new FXMLLoader (getClass().getResource("Scene9.fxml"));
		root=loader.load();
		
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
		
				
	}
			
			

	}


