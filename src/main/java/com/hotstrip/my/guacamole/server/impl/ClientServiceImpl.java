package com.hotstrip.my.guacamole.server.impl;

import com.hotstrip.my.guacamole.model.Client;
import com.hotstrip.my.guacamole.repo.ClientRepository;
import com.hotstrip.my.guacamole.server.ClientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;

@Service
public class ClientServiceImpl implements ClientService {

    @Resource
    private ClientRepository clientRepository;

    @Override
    public Page<Client> findClientsByPage(Integer page, Integer size, Client query) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.DESC, "createTime");
        Page<Client> clients = clientRepository.findAll((Specification<Client>) (root, criteriaQuery, criteriaBuilder) -> {
            Predicate p1 = criteriaBuilder.equal(root.get("clientName").as(String.class), query.getClientName());
            Predicate p2 = criteriaBuilder.equal(root.get("hostName").as(String.class), query.getHostName());
            Predicate p3 = criteriaBuilder.equal(root.get("protocol").as(String.class), query.getProtocol());
            criteriaQuery.where(p1, p2, p3);
            return criteriaQuery.getRestriction();
        }, pageable);
        return clients;
    }
}
