
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class testBubbleSort {
	BubbleSort cal;
    int result[]= {1,2,2,5,6};
    int arr[] ={1,6,2,2,5};
	@Before
	public void setup() {
		cal =new BubbleSort();
	}
	@Test
	public void testchecktrue() {
		Assert.assertArrayEquals(result,cal.BubbleSort(arr));
	}

}
