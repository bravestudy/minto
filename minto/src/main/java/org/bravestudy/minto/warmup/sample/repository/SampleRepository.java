package org.bravestudy.minto.warmup.sample.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.bravestudy.minto.warmup.common.vo.SampleUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {
	@Autowired
	private SqlSession sql;

	public List<SampleUserVo> getAllUser() {
		return sql.selectList("sample.selectAll");
	}

}
