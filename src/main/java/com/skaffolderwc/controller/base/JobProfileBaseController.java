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
package com.skaffolderwc.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.modelmapper.ModelMapper;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.skaffolderwc.db.skaffolderwc_db.service.JobProfileService;
import com.skaffolderwc.db.skaffolderwc_db.entity.JobProfile;
import com.skaffolderwc.db.skaffolderwc_db.dtos.JobProfileDto;

//IMPORT RELATIONS


public class JobProfileBaseController {
    
    @Autowired
	JobProfileService jobprofileService;

	

	@Autowired
	private ModelMapper modelMapper;



//CRUD METHODS

	
    //CRUD - REMOVE
    @Secured({ "ROLE_PRIVATE_USER" })
	@DeleteMapping("/jobprofile/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		JobProfile jobprofileSelected = jobprofileService.getOne(id);
		
		jobprofileService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
    //CRUD - GET LIST
    @Secured({ "ROLE_PRIVATE_USER" })
	@GetMapping("/jobprofile")
	public ResponseEntity<List<JobProfileDto>> getList() {
		List<JobProfile> list = jobprofileService.getAll();
		List<JobProfileDto> listDto = list.stream()
				.map(jobprofile -> convertToDto(jobprofile))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}



/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	private JobProfileDto convertToDto(JobProfile jobprofile) {
		JobProfileDto jobprofileDto = modelMapper.map(jobprofile, JobProfileDto.class);
		return jobprofileDto;
	}
}
