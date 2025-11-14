package org.example.table.service;


import org.example.table.model.TableEntity;
import org.example.table.repository.RepositoryTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {

    private final RepositoryTable repositoryTable;
    public TableService(RepositoryTable repositoryTable) {
        this.repositoryTable = repositoryTable;
    }

    public List<TableEntity> findAll() {
        return repositoryTable.findAll();
    }
    public TableEntity findById(Long id) {
        return repositoryTable.findById(id).orElse(null);
    }
    public Long create(TableEntity tableEntity) {
         repositoryTable.save(tableEntity);
         return tableEntity.getId();
    }
    public TableEntity update(Long id,TableEntity newTable) {
        TableEntity oldTableEntity = findById(id);
        oldTableEntity.setName(newTable.getName());
        oldTableEntity.setDescription(newTable.getDescription());
        oldTableEntity.setMaxGuests(newTable.getMaxGuests());
        return repositoryTable.save(oldTableEntity);
    }
    public void delete(Long id) {
        repositoryTable.deleteById(id);
    }

}
