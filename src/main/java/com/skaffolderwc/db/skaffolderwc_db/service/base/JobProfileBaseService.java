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


import com.skaffolderwc.db.skaffolderwc_db.entity.JobProfile;

import com.skaffolderwc.db.skaffolderwc_db.repositories.JobProfileRepository;

@Service
@Transactional
public class JobProfileBaseService {

	
	@Autowired
	JobProfileRepository jobprofileRepository;


    //CRUD METHODS
    
	//CRUD - REMOVE
    
	public void delete(Long id) {
		jobprofileRepository.delete(id);
	}

    	
    //CRUD - GET LIST
    	
	public List<JobProfile> getAll() {
		List<JobProfile> list = new ArrayList<>();
		jobprofileRepository.findAll().forEach(list::add);
		return list;
	}
	

}
