package web.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.Setter;
import web.spring.mapper.UserMapper;
import web.spring.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Setter(onMethod_= @Autowired)
	private UserMapper userMapper;

	@Override
	public UserVO getUser(String user_id) {
		return userMapper.getUser(user_id);
	}

	@Override
	public List<UserVO> getUserList() {
		return userMapper.getUserList();
	}
	
	@Override
	public UserVO login(UserVO user) {
		return  userMapper.login(user);
	}


	@Override
	public int updateSessionkey(UserVO user) {
		return userMapper.updateSessionkey(user);
	}

	@Override
	public UserVO loginSessionkey(String sessionkey) {
		UserVO user =  userMapper.loginSessionkey(sessionkey);
		return user;
	}

	@Override
	public int insertUser(UserVO user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encode = encoder.encode(user.getUser_password());
		user.setUser_password(encode);
		return userMapper.insertUser(user);
	}

	@Override
	public UserVO checkIdReapet(String User_id) {
		UserVO user = userMapper.checkIdReapet(User_id);
		return user;
	}

	@Override
	public UserVO checkId(UserVO user) {
		return userMapper.checkId(user);
	}

	@Override
	public UserVO checkPwd(UserVO user) {
		return userMapper.checkPwd(user);
	}


	@Override
	public UserVO updateUser(String User_id) {
		return userMapper.updateUser(User_id);
	}

}