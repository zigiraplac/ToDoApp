package com.placide.TodoApp.repositories;

import com.placide.TodoApp.models.ToDoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ToDoAppRepository extends JpaRepository<ToDoModel, Integer> {

    @Query("SELECT td FROM ToDoModel td WHERE (:id IS NULL OR td.id= :id)" +
    "AND (:title IS NULL OR td.title= :title)" +
    "AND (:description IS NULL OR td.description = :description)" +
    " AND (:priority IS NULL OR td.priority =:priority)" +
    "AND (:isCompleted IS NULL OR td.isCompleted =:isCompleted)" +
    "AND (:startDate IS NULL OR td.startDate= : startDate)" +
    "AND (:endDate IS NULL OR td.endDate= : endDate)")
    Page<ToDoModel> toDoAppFilter(@Param("id") int id,
                                  @Param("title") String title,
                                  @Param("description") String description,
                                  @Param("priority") String priority,
                                  @Param("isCompleted") boolean isCompleted,
                                  @Param("startDate") LocalDateTime startDate,
                                  @Param("endDate") LocalDateTime endDate,
                                  Pageable pageable);

}
