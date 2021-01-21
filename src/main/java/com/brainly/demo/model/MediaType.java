package com.brainly.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MediaType {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long mediaTypeId;
  private String name;


  public long getMediaTypeId() {
    return mediaTypeId;
  }

  public void setMediaTypeId(long mediaTypeId) {
    this.mediaTypeId = mediaTypeId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
