package com.hand.demo.mapper;

import com.hand.demo.entity.Score;

public interface ScoreMapper {
    public Score qureyScoreBySn(int studentNumber);
    public int insertScore(Score score);

}
