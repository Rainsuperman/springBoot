package com.hand.demo.service;

import com.hand.demo.entity.Score;
import com.hand.demo.mapper.ScoreMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ScoreService {
    @Resource
    private ScoreMapper scoreMapper;
    public Score qureyScoreBySn(int studentNumber){
        return scoreMapper.qureyScoreBySn(studentNumber);
    }
    public int insertScore(Score score){
        return scoreMapper.insertScore(score);
    }

}
