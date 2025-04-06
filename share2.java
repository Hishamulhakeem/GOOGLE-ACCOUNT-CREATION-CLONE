package application;

public class share2 {
	
	private static share2 instance = new share2();
	 private String textValue;

	private share2() {}
		public static share2 getInstance() {
			return instance;
		}
		public String getTextValue() {
			
			return textValue;
		}
		public void setTextValue(String textValue) {
			this.textValue=textValue;
		}
	
}
