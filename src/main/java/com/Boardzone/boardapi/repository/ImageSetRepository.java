package com.Boardzone.boardapi.repository;

import com.Boardzone.boardapi.entity.ImageSetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageSetRepository extends JpaRepository<ImageSetEntity, Integer> {
    List<ImageSetEntity> findByImage1NotNull();
}
