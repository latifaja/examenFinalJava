package com.emaple.examenjavapoo;

import java.util.ArrayList;
import java.util.List;

class ClientDAO {
    private List<Client> clients = new ArrayList<>();

    public void create(Client client) {
        clients.add(client);
    }

    public Client read(int id) {
        return clients.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public void update(Client client) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == client.getId()) {
                clients.set(i, client);
                break;
            }
        }
    }

    public void delete(int id) {
        clients.removeIf(c -> c.getId() == id);
    }
}