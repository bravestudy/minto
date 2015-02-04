package org.bravestudy.minto.warmup.jaden.repository;

import org.bravestudy.minto.common.component.BaseRepositorySupport;
import org.bravestudy.minto.warmup.common.vo.SampleUserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * @author 	Jaden.Lee
 * @file 			WarmupRepositoryImpl.java
 * @since		February 04, 2015.
 * @version	1.0.0
 */
@Repository("jadenWarmupRepositoryImpl")
public class WarmupRepositoryImpl extends BaseRepositorySupport implements WarmupRepository {
	
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(WarmupRepositoryImpl.class);
	
	@Override
	public int insert(SampleUserVo vo) {
		return sqlSessionTemplate.insert("SampleUser.insert", vo);
	}

}	
