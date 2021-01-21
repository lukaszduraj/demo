package com.brainly.demo.model;


import javax.persistence.*;

@Entity
public class Playlist {

  @Id
  private int id;
  private Long playlistId;
  private String name;


  public long getPlaylistId() {
    return playlistId;
  }

  public void setPlaylistId(long playlistId) {
    this.playlistId = playlistId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
