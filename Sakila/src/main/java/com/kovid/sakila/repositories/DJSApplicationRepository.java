package com.kovid.sakila.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
interface DJSApplicationRepository<T> extends PagingAndSortingRepository<T, Long> {
}