package com.ygornacif.workshopmongob.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tex;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {
    }

    public CommentDTO(String tex, Date date, AuthorDTO author) {
        this.tex = tex;
        this.date = date;
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTex() {
        return tex;
    }

    public void setTex(String tex) {
        this.tex = tex;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
