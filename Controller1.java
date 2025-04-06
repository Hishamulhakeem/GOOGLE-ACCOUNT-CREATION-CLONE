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
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controller1 implements Initializable {
	
	@FXML
	protected TextField t1;
	@FXML
	private TextField t2;
	@FXML
	private Button n2;
	@FXML
	private Label n,l;
	private String text;

	private Parent root;
	private Stage stage;
	private Scene scene;
	
	private String cssStyle = "-fx-border-color: #ff0022; -fx -border-width: 10px;";
	private String cssStyle1 = "-fx-border-text=firstname";	;
	
	
	public String getTextFieldText() {
		return t1.getText();
	}
	
	public void next2(ActionEvent event) throws IOException {
		

		
			text = t1.getText();
			if(text.isEmpty()) {
				text="null";

			}
		
	     //  System.out.println(text);
		
		if(text=="null") {
			l.setText("! Enter first name");
			l.setTextFill(Color.RED);
			t1.setStyle(cssStyle1);
		//	t1.requestFocus();
			
			
				
		}else {
			FXMLLoader loader =new FXMLLoader (getClass().getResource("Scene3.fxml"));
			root=loader.load();
			
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show(); 
			
		}
		
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		t1.textProperty().addListener((observable, oldValue, newValue) -> {
			share.getInstance().setTextValue(newValue);
		});
		
	}
	
	
	
	

	

}
