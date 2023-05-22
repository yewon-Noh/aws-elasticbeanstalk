package com.example.sample.mbti;

import com.example.sample.mbti.model.MbtiDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
