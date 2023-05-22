package com.example.sample.mbti;

import com.example.sample.mbti.model.Mbti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MbtiRepository extends JpaRepository<Mbti, Long> {

    @Query("SELECT COUNT(m) FROM Mbti m")
    Long countAll();
}
