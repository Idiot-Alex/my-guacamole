package com.hotstrip.my.guacamole.server;

import com.hotstrip.my.guacamole.model.Client;
import org.springframework.data.domain.Page;

public interface ClientService {

    Page<Client> findClientsByPage(Integer page, Integer size, final Client query);
}
