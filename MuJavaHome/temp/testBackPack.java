
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class testBackPack {
	BackPack cal;
	int m = 10;
    int n = 3;

    int w[] = {3, 4, 5};
    int p[] = {4, 5, 6};
    int result[][]= {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},{0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}};
	@Before
	public void setup() {
		cal =new BackPack();
	}
	@Test
	public void testchecktrue() {
		Assert.assertArrayEquals(result,cal.BackPack_Solution(m, n, w, p));
	}

}