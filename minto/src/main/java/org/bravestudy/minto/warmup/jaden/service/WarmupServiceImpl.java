package org.bravestudy.minto.warmup.jaden.service;

import org.bravestudy.minto.warmup.common.model.SampleUserForm;
import org.bravestudy.minto.warmup.common.model.SampleUserView;
import org.bravestudy.minto.warmup.common.vo.SampleUserVo;
import org.bravestudy.minto.warmup.jaden.repository.WarmupRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 	Jaden.Lee
 * @file 			WarmupServiceImpl.java
 * @since		February 04, 2015.
 * @version	1.0.0
 */
@Service("jadenWarmupServiceImpl")
public class WarmupServiceImpl implements WarmupService {
	
	private static final Logger logger = LoggerFactory.getLogger(WarmupServiceImpl.class);
	
	@Autowired
	@Qualifier("jadenWarmupRepositoryImpl")
	private WarmupRepository repository;
	
	
	@Transactional(rollbackFor=Exception.class)
	@Override
	public SampleUserView insertSampleUser(SampleUserForm form) {
		SampleUserVo vo = new SampleUserVo();
		vo.setName(form.getName());
		vo.setEmail(form.getEmail());
		
		int id = repository.insert(vo);
		logger.debug("Created User id : " + id);
		
		SampleUserView viewModel = new SampleUserView();
		viewModel.setName(form.getName());
		viewModel.setEmail(form.getEmail());
		return viewModel;
	}
}
