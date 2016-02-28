package com.ls.words.dto;


import com.ls.words.model.RowStatistic;

/**
 * Created by turenko on 25.02.2016.
 */

public class TRowStatistic {
    private Integer id               ;
    private String  longWord         ;
    private String  shortWord        ;
    private Integer longWordLenght   ;
    private Integer shortWordLenght  ;
    private Integer rowLenght        ;
    private Integer averageWordLenght;
    private Integer countWords       ;

    public TRowStatistic() {}

    public TRowStatistic(RowStatistic rowStatistic) {
        this.id                = rowStatistic.getId();
        this.longWord          = rowStatistic.getLongWord();
        this.shortWord         = rowStatistic.getShortWord();
        this.longWordLenght    = rowStatistic.getLongWordLenght();
        this.shortWordLenght   = rowStatistic.getShortWordLenght();
        this.rowLenght         = rowStatistic.getRowLenght();
        this.averageWordLenght = rowStatistic.getAverageWordLenght();
        this.countWords        = rowStatistic.getCountWords();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLongWord() {
        return longWord;
    }

    public void setLongWord(String longWord) {
        this.longWord = longWord;
    }

    public String getShortWord() {
        return shortWord;
    }

    public void setShortWord(String shortWord) {
        this.shortWord = shortWord;
    }

    public Integer getLongWordLenght() {
        return longWordLenght;
    }

    public void setLongWordLenght(Integer longWordLenght) {
        this.longWordLenght = longWordLenght;
    }

    public Integer getShortWordLenght() {
        return shortWordLenght;
    }

    public void setShortWordLenght(Integer shortWordLenght) {
        this.shortWordLenght = shortWordLenght;
    }

    public Integer getRowLenght() {
        return rowLenght;
    }

    public void setRowLenght(Integer rowLenght) {
        this.rowLenght = rowLenght;
    }

    public Integer getAverageWordLenght() {
        return averageWordLenght;
    }

    public void setAverageWordLenght(Integer averageWordLenght) {
        this.averageWordLenght = averageWordLenght;
    }

    public Integer getCountWords() {
        return countWords;
    }

    public void setCountWords(Integer countWords) {
        this.countWords = countWords;
    }


    @Override
    public String toString() {
        return "RowStatistic{" +
                "id=" + id +
                ", longWord='" + longWord + '\'' +
                ", shortWord='" + shortWord + '\'' +
                ", longWordLenght=" + longWordLenght +
                ", shortWordLenght=" + shortWordLenght +
                ", rowLenght=" + rowLenght +
                ", averageWordLenght=" + averageWordLenght +
                ", countWords=" + countWords +
                '}';
    }
}
