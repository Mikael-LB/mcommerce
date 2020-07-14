package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.CommandeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@FeignClient(name = "microservice-commandes", url = "localhost:9002")
public interface MicroserviceCommandeProxy {
    @RequestMapping(value = "/commandes")
    CommandeBean ajouterCommande(@RequestBody CommandeBean commande);

//    @RequestMapping(value = "/commandes/{id}")
//    CommandeBean recupererUneCommande(@PathVariable int id);
}
