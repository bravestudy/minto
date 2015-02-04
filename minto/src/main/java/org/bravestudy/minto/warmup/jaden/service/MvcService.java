package org.bravestudy.minto.warmup.jaden.service;

import org.bravestudy.minto.warmup.common.model.SampleUserForm;
import org.bravestudy.minto.warmup.common.model.SampleUserView;

/**
 * @author 	Jaden.Lee
 * @file 			MvcService.java
 * @Since 		February 04, 2015.
 * @version 	1.0.0
 */
public interface MvcService {
	
	SampleUserView insertSampleUser(SampleUserForm form);

}
