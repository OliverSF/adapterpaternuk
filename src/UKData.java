
public class UKData {
	
	private static UKData instance = new UKData();
	
	private String data;
	
	private UKData(){
		
		data = "";
	}
	
	public String dataOut(){
		return data;
		
	}
	
	public void setNewData(String d){
		
		data = d;
	}
	
	public static UKData getInstance(){
		return instance;
	}

}
