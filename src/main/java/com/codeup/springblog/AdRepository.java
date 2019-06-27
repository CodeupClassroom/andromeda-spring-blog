package com.codeup.springblog;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends CrudRepository<Ad, Long> {
    List<Ad> findByTitleStartingWith(String str);

    @Query("select title from Ad where length(title) > 10")
    List<String> getTitleWithGreatLength();


    @Query(value = "select title from ads where length(title) > 10", nativeQuery = true)
    List<String> getTitleWithGreatLengthNative();



}

