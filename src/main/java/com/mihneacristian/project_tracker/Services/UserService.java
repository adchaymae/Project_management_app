package com.mihneacristian.project_tracker.Services;

import com.mihneacristian.project_tracker.DTO.UserDto;
import com.mihneacristian.project_tracker.Entities.User;

public interface UserService {

	User save (UserDto userDto);
	

}
