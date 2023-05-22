package com.example.sample.mbti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MbtiService {
    private final MbtiRepository mbtiRepository;

    @Autowired
    public MbtiService(MbtiRepository mbtiRepository) {
        this.mbtiRepository = mbtiRepository;
    }

    public Long resultCount() {
        return mbtiRepository.countAll();
    }
}
