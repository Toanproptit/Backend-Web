package org.example.table.controller;

import org.example.table.model.TableEntity;
import org.example.table.service.TableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tables")
public class TableController {
    private final TableService tableService;
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }
    @GetMapping
    public List<TableEntity> findAll(){
        return tableService.findAll();
    }
    @GetMapping("/{id}")
    public TableEntity getById(@PathVariable Long id){
        return tableService.findById(id);
    }
    @PostMapping
    public Long save(@RequestBody TableEntity tableEntity){
        return tableService.create(tableEntity);
    }
    @PutMapping("/{id}")
    public TableEntity update(@PathVariable Long id,@RequestBody TableEntity tableEntity){
        return tableService.update(id,tableEntity);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        tableService.delete(id);
        return "delete table with " + id;
    }

}
