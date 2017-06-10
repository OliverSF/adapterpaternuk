
public class UKAdapter implements AdapterInterface{
	
	UKData UKDat = UKData.getInstance();

	@Override
	public double[] dataIn() {

		String cvsSplit = ",";
		
		//Input
		String csv = UKDat.dataOut();
		
		//Conversion
		String[] values = csv.split(cvsSplit);
		
		//Create Array of Doubles
		double[] vals = new double[values.length];
		
		int i = 0;
		for(String val:values){
			//convert each String to a double
			vals[i++] = Double.parseDouble(val);
		}
		
		return vals;
	}

}
