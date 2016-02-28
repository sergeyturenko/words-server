package com.ls.words.service;

import com.ls.words.dao.StatisticDao;
import com.ls.words.dto.TFileStatistic;
import com.ls.words.dto.TRowStatistic;
import com.ls.words.model.FileStatistic;
import com.ls.words.model.RowStatistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey_PC on 25.02.2016.
 */
@Service
public class StatisticService {
    @Autowired
    private StatisticDao statisticDao;

    public TFileStatistic getById(Long id){
        return new TFileStatistic(statisticDao.getById(id));
    }

    public List<TFileStatistic> getAll(){
        List<TFileStatistic> list = new ArrayList<>();
        for(FileStatistic f : statisticDao.getAll()){
           list.add(new TFileStatistic(f));
        }
        return list;
    }

    public List<TRowStatistic> getAllRowsFileStatistic(Integer id){
        List<TRowStatistic> list = new ArrayList<>();
        for(RowStatistic r : statisticDao.getAllRowsFileStatistic(id)){
            list.add(new TRowStatistic(r));
        }
        return list;
    }

}
