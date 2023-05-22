package com.example.sample.mbti;

import com.example.sample.mbti.model.MbtiDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MbtiController {
    private final MbtiService mbtiService;

    @Autowired
    public MbtiController(MbtiService mbtiService) {
        this.mbtiService = mbtiService;
    }

    @RequestMapping("/mbti")
    String mbti() {
        Long count = mbtiService.resultCount();
        return "<h3>MBTI 사용자 수 : " + count + " </h3>";
    }
}
