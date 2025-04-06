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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Controller  implements Initializable{
	

	@FXML
	private TextField en;
	@FXML
	private Button n1;
	//n2,n3,n4,n5,n6,n7,n8,n9;
	@FXML
	private ChoiceBox<String> c1,c3,c4;
	@FXML
	private Label l1;
	
	private String[] choice= {"For myself","To manage my Bussiness"};
	private Stage stage;
	private Scene scene;
	private Parent root;
	private String cssStyle = "-fx-border-color: #ff0022; -fx -border-width: 2px;";
	
//	private String[] month= {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
	
//	private String[] gender= {"Male","Female","Rather","Customize"};
	



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		c1.getItems().addAll(choice);
		
		c1.setOnAction(event -> {
			String select=c1.getValue();
			
			if(select.equals("For myself")) {
				 FXMLLoader loader =new FXMLLoader (getClass().getResource("Scene2.fxml"));
					try {
						root=loader.load();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					stage =(Stage)((Node)event.getSource()).getScene().getWindow();
					scene = new Scene(root);
					stage.setScene(scene);
					stage.show(); 
			}
		});
		
	
}



	public void next1(ActionEvent event) throws IOException {
		
		
/*		String text=c1.getValue();
		
		System.out.println(text);
		if(text.isEmpty()) {
			text="null";
		} */
		
		if(c1.getValue()==null) {
			
			l1.setText("Enter an email or phone number");
			l1.setTextFill(Color.RED);
			l1.setOpacity(0.60);
			en.setStyle(cssStyle);
			en.requestFocus();
			
		}
	
				
		
	}
	
	
	
	
	
 /*   public void next2(ActionEvent event) throws IOException {
    	
    
    	
    	if(t1.getText()==null && t2.getText()== null) {
			t1.setText("Enter");
			t2.setText("Enter");
		}else {
			System.out.println(t1.getText());
			System.out.println(t2.getText());
			FXMLLoader loader =new FXMLLoader (getClass().getResource("Scene3.fxml"));
			root=loader.load();
			
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show(); 
			
			
	    	
	    	
	    	
	    	if(l3.getText()==null  ) {
	    	//	l3.setText("! Date");
	    	//	l3.setTextFill(Color.RED);
	    		l3.setWrapText(true);
	     	}
	    	else if(l4.getText()==null) {
	    	//	l4.setText("! Year");
	    	//	l4.setTextFill(Color.RED);
	    	}
	    	else {
	    		next3();
	    		
	    	}
			
		}
    	
    	
    	
    	
    	
	
	
    	
	}
    public void next3() {
	
    }
    public void next4() {
	
    }
    public void next5() {
	
    }
     public void next6() {
	
     }
public void next7() {
	
}
public void next8() {
	
}
public void next9() {
	
}
*/
	
	
	
}
