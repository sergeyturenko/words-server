package com.ls.words.data;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by turenko on 19.02.2016.
 */
@Entity
public class FileStatistic {
    private Integer id               ;
    private String  fileName         ;
    private String  longWord         ;
    private String  shortWord        ;
    private int     longWordLenght   ;
    private int     shortWordLenght  ;
    private int     rowLenght        ;
    private int     averageWordLenght;
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

    @Column
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    @Column
    public String getLongWord() {
        return longWord;
    }

    public void setLongWord(String longWord) {
        this.longWord = longWord;
    }
    @Column
    public String getShortWord() {
        return shortWord;
    }

    public void setShortWord(String shortWord) {
        this.shortWord = shortWord;
    }
    @Column
    public int getLongWordLenght() {
        return longWordLenght;
    }

    public void setLongWordLenght(int longWordLenght) {
        this.longWordLenght = longWordLenght;
    }
    @Column
    public int getShortWordLenght() {
        return shortWordLenght;
    }

    public void setShortWordLenght(int shortWordLenght) {
        this.shortWordLenght = shortWordLenght;
    }
    @Column
    public int getRowLenght() {
        return rowLenght;
    }

    public void setRowLenght(int rowLenght) {
        this.rowLenght = rowLenght;
    }
    @Column
    public int getAverageWordLenght() {
        return averageWordLenght;
    }

    public void setAverageWordLenght(int averageWordLenght) {
        this.averageWordLenght = averageWordLenght;
    }

    public void setAverageWordLenght(Integer averageWordLenght) {
        this.averageWordLenght = averageWordLenght;
    }
    @JsonManagedReference
    @OneToMany(mappedBy = "fileStatistic", cascade = CascadeType.ALL)
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
