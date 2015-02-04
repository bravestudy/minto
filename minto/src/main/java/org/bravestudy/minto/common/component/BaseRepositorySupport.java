package org.bravestudy.minto.common.component;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 	Jaden.Lee
 * @file 			BaseRepositorySupport.java
 * @since		February 04, 2015.
 * @version	1.0.0
 */
@Component
public class BaseRepositorySupport extends SqlSessionDaoSupport  {

	@Autowired
	protected SqlSessionTemplate sqlSessionTemplate;
	
	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
}
