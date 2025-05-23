package com.example.springboottest1;

import com.example.springboottest1.entity.Userinfoa;
import com.example.springboottest1.mapper.UserinfoaMapper;
import com.example.springboottest1.service.IUserinfoaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTest1ApplicationTests {

	@Autowired
	UserinfoaMapper userinfoaMapper;

	@Autowired
	IUserinfoaService userinfoaService;

	@Test
	void contextLoads() {

		Userinfoa userinfoa = new Userinfoa();
		userinfoa.setUsername("tom");
		userinfoa.setPassword("123");
		Userinfoa userinfoResult = userinfoaMapper.verifyUserinfoa(userinfoa);
		System.out.println(userinfoResult);
	}

	@Test
	void contextLoads2() {
		Userinfoa userinfoa = new Userinfoa();
		userinfoa.setUsername("tom");
		userinfoa.setPassword("123");
		boolean ok = userinfoaService.verifyUserinfoa(userinfoa);
		System.out.println(ok);
	}

}
