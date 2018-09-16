package cn.dl.jcdz.juinit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperateTest {

	private Operate op = null;
	@Before
	public void setUp() throws Exception {
		this.op = new Operate();
	}

	@Test
	public void test01_sum() {
		assertEquals(7, this.op.sum(3, 4));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test02_sub(){
		assertEquals(-1, this.op.sub(3, 4));
	}

}
