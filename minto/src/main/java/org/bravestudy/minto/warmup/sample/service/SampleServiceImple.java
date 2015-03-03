package org.bravestudy.minto.warmup.sample.service;

import java.util.List;

import org.bravestudy.minto.warmup.common.vo.SampleUserVo;
import org.bravestudy.minto.warmup.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImple implements SampleService{

	@Autowired
	SampleRepository sampleRepository;
	
	@Override
	public List<SampleUserVo> getAllUser() {
		return sampleRepository.getAllUser();
	}

}
