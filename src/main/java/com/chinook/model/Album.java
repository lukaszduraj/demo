package com.chinook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long albumId;
  private String title;
  private long artistId;


  public long getAlbumId() {
    return albumId;
  }

  public void setAlbumId(long albumId) {
    this.albumId = albumId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public long getArtistId() {
    return artistId;
  }

  public void setArtistId(long artistId) {
    this.artistId = artistId;
  }

}
