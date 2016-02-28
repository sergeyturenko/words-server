package com.ls.words.dao;

import com.ls.words.model.FileStatistic;
import com.ls.words.model.RowStatistic;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
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

    @Override
    public List<RowStatistic> getAllRowsFileStatistic(Integer id) {

        Criteria criteria = getSession().createCriteria(RowStatistic.class, "rowStatistic")
                .createAlias("rowStatistic.fileStatistic","fileStatistic")
                .add(Restrictions.eq("fileStatistic.id", id));

        return criteria.list();
    }
}
