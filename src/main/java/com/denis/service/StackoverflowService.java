package com.denis.service;

import com.denis.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {

    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static {
        items.add(new StackoverflowWebsite("stackoverflow", "https://stackoverflow.com",
                "https://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico","Stack Overflow (StackExchange)",
                "for professional and ent programmer"));
        items.add(new StackoverflowWebsite("stackoverflow", "https://stackoverflow.com",
                "https://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico","Stack Overflow (StackExchange)",
                "for professional and ent programmer"));
    }

    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
