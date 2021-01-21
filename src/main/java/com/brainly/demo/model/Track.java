package com.brainly.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = false)
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
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
}
