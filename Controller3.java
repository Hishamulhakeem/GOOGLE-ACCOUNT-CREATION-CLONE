package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

public class Controller3 implements Initializable {
	
	@FXML
	private TextField t3,t4;

	@FXML
	private ChoiceBox<String> c2,c3;
	@FXML
	private Button n3;
	
    public String[] month= {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
	
	public String[] gend= {"Male","Female","Rather","Customize"};
	
	private String cssStyle = "-fx-border-color: red; -fx -border-width: 2px;";
	@FXML 
	private Label m,g,kk,er,f;
	
	//t1  t7
	 
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	String currentmonth,currentgender,text1,text2;
	
	
	  String num[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	
	  String yer[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
	 
	
	  
	  
	public void next3(ActionEvent event) throws IOException {
		

	
		
			text1 = t3.getText();
			if(text1.isEmpty()) {
				text1="null";
			}

		
			text2 = t4.getText();
			if(text2.isEmpty()) {
				text2="null";
			}
		
		if(currentmonth==null&&currentgender ==null&&text1=="null"&&text2=="null") {
			er.setText("! please fill in a complete birthday");  
			 er.setTextFill(Color.RED);
			 f.setText("! please select your gender");
        	 f.setTextFill(Color.RED);
        	 c2.setStyle(cssStyle);
        	 c3.setStyle(cssStyle);
        	 t3.setStyle(cssStyle);
        	 t4.setStyle(cssStyle);
		}
	
		
			else if(currentmonth==null )
         {
			 er.setText("! please enter a valid date");  
			 er.setTextFill(Color.RED);
			 c2.setStyle(cssStyle);
        	 
         }else if(currentgender ==null) {
        	 
        	 f.setText("! please select your gender");
        	 f.setTextFill(Color.RED);
        	 c3.requestFocus();
        	 c3.setStyle(cssStyle);
         }
         else if(text1=="null") {
        	 er.setText("! please enter a valid date");  
			 er.setTextFill(Color.RED);
			 t3.setStyle(cssStyle);
			 

         }
         else if(text2=="null") {
        	 er.setText("! please enter a valid date");  
			 er.setTextFill(Color.RED);

        	 t4.setStyle(cssStyle);
         }
		
		
		  
		 
		 
		 
		 
		 
		 
			 
			
			 
			 else {
        	 FXMLLoader loader =new FXMLLoader (getClass().getResource("Scene4.fxml"));
 			root=loader.load();
 			
 			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
 			scene = new Scene(root);
 			stage.setScene(scene);
 			stage.show(); 
			 }
         }
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
		c2.getItems().addAll(month);
		c3.getItems().addAll(gend);
		
		c2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				currentmonth=c2.getSelectionModel().getSelectedItem();
				
				
			}
			
		});
		c3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				currentgender=c3.getSelectionModel().getSelectedItem();
				
				
			}
			
		});
    		
		

		
}	
		
		
		
		
		
		
	}


