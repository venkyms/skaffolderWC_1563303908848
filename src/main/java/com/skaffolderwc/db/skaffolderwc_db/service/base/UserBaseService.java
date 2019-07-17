/* 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://beta.skaffolder.com/#!/register?friend=5b2fa01ac3dbdb5d5470b69c
*
* You will get 10% discount for each one of your friends
* 
*/
package com.skaffolderwc.db.skaffolderwc_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.skaffolderwc.db.skaffolderwc_db.service.RolesService;
import com.skaffolderwc.db.skaffolderwc_db.repositories.RolesRepository;
import com.skaffolderwc.db.skaffolderwc_db.entity.Roles;

import com.skaffolderwc.db.skaffolderwc_db.entity.User;

import com.skaffolderwc.db.skaffolderwc_db.repositories.UserRepository;

@Service
@Transactional
public class UserBaseService {

	
	@Autowired
	UserRepository userRepository;
	@Autowired
	RolesRepository rolesRepository;
	private static RolesService rolesService = new RolesService();

	public User login(String username, String password) {
		if (userRepository.count() == 0) {
			User newUser = new User();
			newUser.setUsername("admin");
			newUser.addRoles(new Roles("ADMIN", newUser));
			newUser.setPassword("62f264d7ad826f02a8af714c0a54b197935b717656b80461686d450f7b3abde4c553541515de2052b9af70f710f0cd8a1a2d3f4d60aa72608d71a63a9a93c0f5");
			rolesRepository.save(newUser.getRoles().get(0));
			userRepository.save(newUser);
		}
		return userRepository.findByUsernameAndPassword(username, password);
	}


    //CRUD METHODS
    
    //CRUD - CREATE
    
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	//CRUD - REMOVE
    
	public void delete(Long id) {
		userRepository.delete(id);
	}

	//CRUD - GET ONE
    	
	public User getOne(Long id) {
		return userRepository.findOne(id);
	}

    	
    //CRUD - GET LIST
    	
	public List<User> getAll() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().forEach(list::add);
		return list;
	}
	

}
