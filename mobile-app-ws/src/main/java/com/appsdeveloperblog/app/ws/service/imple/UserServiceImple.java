package com.appsdeveloperblog.app.ws.service.imple;

import org.springframework.stereotype.Service;

import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDto;

// 业务层，所有的内部的业务逻辑都会放在这里处理，比如用户的增删改查，或者发送个验证码或邮件，或者做一个抽奖活动等等等等，都会在Service中进行
@Service
public class UserServiceImple implements UserService {

	@Override
	public UserDto createUser(UserDto user) {
		// write the business logic of createUser(), and return user information
		// back to client
		return null;
	}

}
