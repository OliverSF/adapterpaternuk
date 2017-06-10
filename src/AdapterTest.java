import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdapterTest {
	
	OurDataClient client;
	AdapterInterface adapt;
	UKData UKDat;
	
	@Before
	public void setUp() throws Exception {
		
		client = new OurDataClient();
		adapt = new UKAdapter();
		UKDat = UKData.getInstance();
	}

	@Test
	public void test() {

		client.setAdapter(adapt);
		String data = "0.15, -0.45, 0.7, 0.9, -1.4";
		
		UKDat.setNewData(data);
		
		client.dataIn();
		
		double[] actual = client.getData();
		
		String[] values = data.split(",");
		double[] expected = new double[values.length];
		int j = 0;
		for(String val:values){
			expected[j++] = Double.parseDouble(val);
		}
		
		assertArrayEquals(expected, actual, 0.0001);
		
	}

}
