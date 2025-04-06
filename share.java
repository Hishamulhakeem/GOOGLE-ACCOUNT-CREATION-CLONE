package application;

public class share {
	
	private static share instance = new share();
	 private String textValue;

	private share() {}
		public static share getInstance() {
			return instance;
		}
		public String getTextValue() {
			
			return textValue;
		}
		public void setTextValue(String textValue) {
			this.textValue=textValue;
		}
	
}
