package org.example.table.repository;

import org.example.table.model.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTable extends JpaRepository<TableEntity,Long> {
}
