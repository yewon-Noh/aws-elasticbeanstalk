package com.example.sample.mbti;

import com.example.sample.mbti.model.Mbti;
import com.example.sample.mbti.model.MbtiDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MbtiRepository extends JpaRepository<Mbti, Long> {

    @Query("SELECT COUNT(m) FROM Mbti m")
    Long countAll();
}
