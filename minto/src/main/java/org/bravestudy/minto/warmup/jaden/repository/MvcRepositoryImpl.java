package org.bravestudy.minto.warmup.jaden.repository;

import org.bravestudy.minto.common.component.BaseRepositorySupport;
import org.bravestudy.minto.warmup.common.vo.SampleUserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * @author 	Jaden.Lee
 * @file 			MvcRepositoryImpl.java
 * @since		February 04, 2015.
 * @version	1.0.0
 */
@Repository("jadenMvcRepositoryImpl")
public class MvcRepositoryImpl extends BaseRepositorySupport implements MvcRepository {
	
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(MvcRepositoryImpl.class);
	
	@Override
	public int insert(SampleUserVo vo) {
		return sqlSessionTemplate.insert("SampleUser.insert", vo);
	}

}	
