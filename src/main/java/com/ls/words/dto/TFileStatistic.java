package com.ls.words.dto;


import com.ls.words.model.FileStatistic;

/**
 * Created by turenko on 25.02.2016.
 */

public class TFileStatistic {
    private Integer id               ;
    private String  fileName         ;
    private String  longWord         ;
    private String  shortWord        ;
    private Integer longWordLenght   ;
    private Integer shortWordLenght  ;
    private Integer rowLenght        ;
    private Integer averageWordLenght;
    private Integer countWords       ;

    public TFileStatistic() {}

    public TFileStatistic(FileStatistic fileStatistic) {
        this.id                = fileStatistic.getId               ();
        this.fileName          = fileStatistic.getFileName         ();
        this.longWord          = fileStatistic.getLongWord         ();
        this.shortWord         = fileStatistic.getShortWord        ();
        this.longWordLenght    = fileStatistic.getLongWordLenght   ();
        this.shortWordLenght   = fileStatistic.getShortWordLenght  ();
        this.rowLenght         = fileStatistic.getRowLenght        ();
        this.averageWordLenght = fileStatistic.getAverageWordLenght();
        this.countWords        = fileStatistic.getCountWords       ();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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

    public int getAverageWordLenght() {
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
        return "FileStatistic{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", longWord='" + longWord + '\'' +
                ", shortWord='" + shortWord + '\'' +
                ", longWordLenght=" + longWordLenght +
                ", shortWordLenght=" + shortWordLenght +
                ", rowLenght=" + rowLenght +
                ", averageWordLenght=" + averageWordLenght +
                '}';
    }
}
