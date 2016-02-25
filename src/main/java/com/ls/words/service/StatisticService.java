package com.ls.words.service;

import com.ls.words.dao.StatisticDao;
import com.ls.words.data.FileStatistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sergey_PC on 25.02.2016.
 */
@Service
public class StatisticService {
    @Autowired
    private StatisticDao statisticDao;

    public FileStatistic getById(Long id){
        return statisticDao.getById(id);
    }

    public List<FileStatistic> getAll(){
        return statisticDao.getAll();
    }
}
