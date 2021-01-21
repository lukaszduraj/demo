package com.chinook.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long genreId;
  private String name;


  public long getGenreId() {
    return genreId;
  }

  public void setGenreId(long genreId) {
    this.genreId = genreId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
