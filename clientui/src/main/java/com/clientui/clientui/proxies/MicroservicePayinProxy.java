package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.PayBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "microservice-payin", url = "localhost:9003")
public interface MicroservicePayinProxy {

    @PostMapping(value = "/paiement")
    ResponseEntity<PayBean> payerUneCommande(@RequestBody PayBean paiement);
}
