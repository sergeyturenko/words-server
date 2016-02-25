package com.ls.words.dao;

import com.ls.words.data.FileStatistic;

import java.util.List;

/**
 * Created by Sergey_PC on 25.02.2016.
 */
public interface StatisticDao {
    FileStatistic getById(Long id);
    List<FileStatistic> getAll();
}
