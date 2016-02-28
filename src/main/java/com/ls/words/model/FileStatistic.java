package com.ls.words.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by turenko on 25.02.2016.
 */
@Entity
@Table(name = "FILESTATISTIC")
public class FileStatistic {
    private Integer id               ;
    private String  fileName         ;
    private String  longWord         ;
    private String  shortWord        ;
    private Integer longWordLenght   ;
    private Integer shortWordLenght  ;
    private Integer rowLenght        ;
    private Integer averageWordLenght;
    private Integer countWords       ;
    private List<RowStatistic> rows = null;

    public FileStatistic() {}

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "FILENAME")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
    public int getAverageWordLenght() {
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

    @JsonManagedReference
    @Fetch(FetchMode.SELECT)
    @OneToMany(mappedBy = "fileStatistic", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<RowStatistic> getRows() {
        return rows;
    }

    public void setRows(List<RowStatistic> rows) {
        this.rows = rows;
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
                ", rows=" + rows +
                '}';
    }
}
