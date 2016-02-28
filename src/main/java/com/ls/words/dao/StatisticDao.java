package com.ls.words.dao;


import com.ls.words.model.FileStatistic;
import com.ls.words.model.RowStatistic;

import java.util.List;

/**
 * Created by Sergey_PC on 25.02.2016.
 */
public interface StatisticDao {
    FileStatistic getById(Long id);
    List<FileStatistic> getAll();
    List<RowStatistic> getAllRowsFileStatistic(Integer id);
}
