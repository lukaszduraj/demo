package com.chinook.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Track {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long trackId;
  private String name;
  private long albumId;
  private long mediaTypeId;
  private long genreId;
  private String composer;
  private long milliseconds;
  private long bytes;
  private String unitPrice;


  public long getTrackId() {
    return trackId;
  }

  public void setTrackId(long trackId) {
    this.trackId = trackId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getAlbumId() {
    return albumId;
  }

  public void setAlbumId(long albumId) {
    this.albumId = albumId;
  }


  public long getMediaTypeId() {
    return mediaTypeId;
  }

  public void setMediaTypeId(long mediaTypeId) {
    this.mediaTypeId = mediaTypeId;
  }


  public long getGenreId() {
    return genreId;
  }

  public void setGenreId(long genreId) {
    this.genreId = genreId;
  }


  public String getComposer() {
    return composer;
  }

  public void setComposer(String composer) {
    this.composer = composer;
  }


  public long getMilliseconds() {
    return milliseconds;
  }

  public void setMilliseconds(long milliseconds) {
    this.milliseconds = milliseconds;
  }


  public long getBytes() {
    return bytes;
  }

  public void setBytes(long bytes) {
    this.bytes = bytes;
  }


  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

}
