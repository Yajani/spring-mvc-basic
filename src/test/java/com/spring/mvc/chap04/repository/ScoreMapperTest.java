package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.entity.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScoreMapperTest {
    @Autowired
    ScoreMapper mapper;

    @Test
    @DisplayName("마입바티스 매퍼로 점수정보 저장에 성공해야한다.")
    void saveTest(){
        //given
        Score score = Score.builder()
                .name("꺄륵끽")
                .kor(99)
                .eng(80)
                .math(100)
                .build();
        //when
        boolean flag = mapper.save(score);

        //then
        assertTrue(flag);
    }

//    @Test
//    @DisplayName("마입바티스 매퍼로 점수정보 저장에 성공해야한다.")
//    void findAllTest(){
//        //given
//
//        //when
//        List<Score> score = mapper.findAll();
//        //then
//        for (Score score1 : score) {
//            System.out.println(score1);
//        }
//        assertEquals(9,score.size());
//
//    }


    @Test
    @DisplayName("마입바티스 매퍼로 점수정보 저장에 성공해야한다.")
    void deleteByStuNumTest(){
        //given
        int stuNum = 6;
        //when
        boolean flag = mapper.deleteByStuNum(stuNum);
        //then
        assertTrue(flag);
    }

    @Test
    @DisplayName("마입바티스 매퍼로 점수정보 저장에 성공해야한다.")
    void findByStuNumTest(){
        //given
        int stuNum = 3;
        //when
        Score score = mapper.findByStuNum(stuNum);
        //then
        System.out.println("score = " + score);
        assertEquals("최예진", score.getName());
        assertEquals(259, score.getTotal());
        assertNotNull(score);
    }



}