package com.rule14.courtq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rule14.courtq.domain.CustomSequence;
import com.rule14.courtq.repositories.CustomSequenceRepository;

import reactor.core.publisher.Mono;

@Service
public class CustomSequenceServiceImpl implements CustomSequenceService{
	
	@Autowired
	private CustomSequenceRepository  customSequenceRepository;

	@Override
	public Mono<CustomSequence> generateSeq(String id) {
		
		
		return  customSequenceRepository.findById(id)
				.doOnSuccess(obj->{
			if(obj == null) {
				obj = new CustomSequence(id, 1L);
				customSequenceRepository.insert(obj).subscribe();
			}
			else {
				obj.setSeq(obj.getSeq()+1);
				customSequenceRepository.save(obj).subscribe();
			}
		});
		
		
		
		/*if (customSequence.block() == null) 
			return new Long(1L);
		else
			return customSequence.block().getSeq();*/
		
		
	}

}
