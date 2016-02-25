package com.ls.words.dao;

import com.ls.words.data.FileStatistic;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sergey_PC on 25.02.2016.
 */
@Repository("statisticDao")
public class StatisticDaoImpl extends AbstractDao implements StatisticDao{
    @Override
    public FileStatistic getById(Long id) {
        return (FileStatistic)getCurrentSession().get(FileStatistic.class, id);
    }

    @Override
    public List<FileStatistic> getAll() {
        return getCurrentSession().createCriteria(FileStatistic.class).list();
    }
}
