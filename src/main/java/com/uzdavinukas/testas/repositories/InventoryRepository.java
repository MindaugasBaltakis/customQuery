package com.uzdavinukas.testas.repositories;

import com.uzdavinukas.testas.entities.InvLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InventoryRepository extends JpaRepository<InvLine, Integer> {

    @Query(
            value = "SELECT i.id, i.product_id, Sum(i.qty) as qty FROM inv_lines i GROUP BY product_id",
            nativeQuery = true)
    List<InvLine> getAllProductQuantity();

    @Query(
            value = "SELECT i.id, i.product_id, Sum(i.qty) as qty FROM inv_lines i GROUP BY product_id LIMIT ?1 OFFSET ?2",
            nativeQuery = true)
    List<InvLine> getAllProductQuantity(Integer limit, Integer offset);

}
