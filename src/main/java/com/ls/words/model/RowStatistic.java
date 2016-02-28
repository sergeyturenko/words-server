package com.ls.words.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

/**
 * Created by turenko on 25.02.2016.
 */
@Entity
@Table(name = "ROWSTATISTIC")
public class RowStatistic {
    private Integer id               ;
    private String  longWord         ;
    private String  shortWord        ;
    private Integer longWordLenght   ;
    private Integer shortWordLenght  ;
    private Integer rowLenght        ;
    private Integer averageWordLenght;
    private Integer countWords       ;
    private FileStatistic fileStatistic;

    public RowStatistic() {}

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonBackReference
    @JoinColumn(name = "extId")
    @ManyToOne(fetch = FetchType.LAZY)
    public FileStatistic getFileStatistic() {
        return fileStatistic;
    }

    public void setFileStatistic(FileStatistic fileStatistic) {
        this.fileStatistic = fileStatistic;
    }
    @Column(name = "LONGWORD")
    public String getLongWord() {
        return longWord;
    }

    public void setLongWord(String longWord) {
        this.longWord = longWord;
    }
    @Column(name = "SHORTWORD")
    public String getShortWord() {
        return shortWord;
    }

    public void setShortWord(String shortWord) {
        this.shortWord = shortWord;
    }
    @Column(name = "LONGWORDLENGHT")
    public Integer getLongWordLenght() {
        return longWordLenght;
    }

    public void setLongWordLenght(Integer longWordLenght) {
        this.longWordLenght = longWordLenght;
    }
    @Column(name = "SHORTWORDLENGHT")
    public Integer getShortWordLenght() {
        return shortWordLenght;
    }

    public void setShortWordLenght(Integer shortWordLenght) {
        this.shortWordLenght = shortWordLenght;
    }
    @Column(name = "ROWLENGHT")
    public Integer getRowLenght() {
        return rowLenght;
    }

    public void setRowLenght(Integer rowLenght) {
        this.rowLenght = rowLenght;
    }
    @Column(name = "AVERAGEWORDLENGHT")
    public Integer getAverageWordLenght() {
        return averageWordLenght;
    }

    public void setAverageWordLenght(Integer averageWordLenght) {
        this.averageWordLenght = averageWordLenght;
    }
    @Column(name = "COUNTWORDS")
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
                ", fileStatistic=" + fileStatistic +
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
