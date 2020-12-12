package com.wsk.accountbook.application.repository;

import com.wsk.accountbook.domain.model.entity.Money;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface MoneyRepository extends JpaRepository<Money, Long> {
//    @Query(value = "SELECT * FROM money WHERE occurringDate BETWEEN :start_date AND :end_date")
//    Optional<List<Money>> findBetweenStartDateAndEndDate(@Param("start_date") LocalDate startDate,
//                                                         @Param("end_date") LocalDate endDate);

    @Query(value = "SELECT * FROM money WHERE occurringDate BETWEEN :start_date AND :end_date",
            countQuery = "SELECT count(*) FROM money WHERE occurringDate BETWEEN :start_date AND :end_date")
    Optional<Page<Money>> findBetweenStartDateAndEndDate(@Param("start_date") LocalDate startDate,
                                                         @Param("end_date") LocalDate endDate,
                                                         Pageable pageable);

    @Query(value = "SELECT sum(amount) as sum, " +
            "FROM money" +
            "WHERE occurring_date between :start_date and :end_date" +
            "GROUP BY use_type, currency")
    Optional<List<Map<String, Double>>> getSimpleStatisticByRange(@Param("start_date") LocalDate startDate,
                                                            @Param("end_date") LocalDate endDate);


}
 