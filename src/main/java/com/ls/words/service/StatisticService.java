package com.ls.words.service;

import com.ls.words.dao.StatisticDao;
import com.ls.words.data.FileStatistic;
import com.ls.words.data.RowStatistic;
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

    public FileStatistic getById(Long id){
        return statisticDao.getById(id);
    }

//    public List<FileStatistic> getAll(){
//        return statisticDao.getAll();
//    }

    public List<FileStatistic> getAll(){
        List<FileStatistic> list = new ArrayList<>();
        List<RowStatistic> rowStatistics = new ArrayList<>();
        RowStatistic r = new RowStatistic();
        r.setId(1);
        r.setShortWordLenght(2);
        r.setLongWordLenght(12);
        r.setCountWords(25);
        r.setLongWord("hellosdfdsf");
        r.setShortWord("ds");
        r.setAverageWordLenght(12);

        RowStatistic r2 = new RowStatistic();
        r2.setId(2);
        r2.setShortWordLenght(34);
        r2.setLongWordLenght(23);
        r2.setCountWords(33);
        r2.setLongWord("Testing");
        r2.setShortWord("b");
        r2.setAverageWordLenght(12);

        rowStatistics.add(r);
        rowStatistics.add(r2);

        FileStatistic f = new FileStatistic();
        f.setId(234);
        f.setAverageWordLenght(44);
        f.setLongWord("Hello");
        f.setShortWord("a");
        f.setLongWordLenght(5);
        f.setShortWordLenght(1);
        f.setAverageWordLenght(4);
//        f.setRows(rowStatistics);

        list.add(f);
        list.add(f);
        return list;

    }
}
