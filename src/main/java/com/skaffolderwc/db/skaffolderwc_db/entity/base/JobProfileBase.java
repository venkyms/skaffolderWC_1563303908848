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
package com.skaffolderwc.db.skaffolderwc_db.entity.base;

/**
 * 
 * 
  _____                      _              _ _ _     _   _     _        __ _ _      
 |  __ \                    | |            | (_) |   | | | |   (_)      / _(_) |     
 | |  | | ___    _ __   ___ | |_    ___  __| |_| |_  | |_| |__  _ ___  | |_ _| | ___ 
 | |  | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | __| '_ \| / __| |  _| | |/ _ \
 | |__| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  | |_| | | | \__ \ | | | | |  __/
 |_____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__|  \__|_| |_|_|___/ |_| |_|_|\___|
 
                                                                                   
 * DO NOT EDIT THIS FILE!! 
 *
 *  FOR CUSTOMIZE JobProfileBase PLEASE EDIT ../JobProfile.java
 * 
 *  -- THIS FILE WILL BE OVERWRITTEN ON THE NEXT SKAFFOLDER CODE GENERATION --
 * 
 */
 

/**
 * This is the model of JobProfile object
 * 
 */

import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
import javax.persistence.Column;
import java.util.Date;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.FetchType;
import java.util.stream.Collectors;
import com.skaffolderwc.db.skaffolderwc_db.entity.JobProfile;
// Import relations


@MappedSuperclass
public class JobProfileBase {
	
	@Id
	@GeneratedValue
	private Long _id;
	
	// Attributes
	
	
	
	public Long get_id() {
		return _id;
	}

	public void set_id(Long id) {
		this._id = id;
	}
	
    

    
}