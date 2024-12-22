package kr.ac.koreatech.devops_step0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsStep0ApplicationTests {

	@Test
	void contextLoads() {
	}

	int add(int a, int b){
		return a+b;
	}

	@Test
	void add_test1(){
		int result = add(10, 20);
		assertEquals(30, result);
	}

	//깃허브에서 Actions 를 수행하면 bootJar에서 error가 나는 것을 확인하기
	// @Test
	// void add_test2(){
	// 	int result = add(10, 20);
	// 	assertEquals(10, result);
	// }

}
