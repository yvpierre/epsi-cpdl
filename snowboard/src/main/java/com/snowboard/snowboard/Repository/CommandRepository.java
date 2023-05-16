package com.snowboard.snowboard.Repository;

import com.snowboard.snowboard.Entity.Command;
import org.springframework.data.repository.CrudRepository;

public interface CommandRepository extends CrudRepository<Command,Long > {
}
