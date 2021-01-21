package com.brainly.demo.repository;

import com.brainly.demo.model.Album;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Album", path = "albums")
public interface AlbumRepository extends PagingAndSortingRepository<Album, Long> {
    List<Album> findAlbumByAlbumId(@Param("id") Long id);
}
