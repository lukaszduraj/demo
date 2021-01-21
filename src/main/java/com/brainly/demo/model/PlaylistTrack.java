package com.brainly.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PlaylistTrack implements Serializable {

  @Id
  private long playlistId;
  @Id
  private long trackId;


  public long getPlaylistId() {
    return playlistId;
  }

  public void setPlaylistId(long playlistId) {
    this.playlistId = playlistId;
  }

  public long getTrackId() {
    return trackId;
  }

  public void setTrackId(long trackId) {
    this.trackId = trackId;
  }
}
