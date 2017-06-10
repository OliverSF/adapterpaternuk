
public class OurDataClient {
	
	private double[] data;
	private AdapterInterface interfac;
	
	//requests data from adapter
	public void dataIn(){
		data = interfac.dataIn();
	}
	
	//returns current internal data
	public double[] getData(){
		
		return data;
	}
	
	//sets the adapter to use
	public void setAdapter(AdapterInterface adapt){
		
		this.interfac = adapt;
	}
	
}
