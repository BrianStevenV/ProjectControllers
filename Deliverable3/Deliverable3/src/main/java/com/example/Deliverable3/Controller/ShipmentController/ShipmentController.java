package com.example.Deliverable3.Controller.ShipmentController;

import com.example.Deliverable3.Modules.Customer;
import com.example.Deliverable3.Modules.Shipment;
import com.example.Deliverable3.Service.ServiceShipment.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ShipmentController {
    //In this case, we haven't database, then it will be an example.
    @Autowired
    private ShipmentService shipmentService;
    @PostMapping("/shipment")
    public ResponseEntity<Shipment> shipmentCreation(@RequestBody Shipment shipmentCreated){
        ResponseEntity<Shipment> response = shipmentService.processCreated(shipmentCreated);
        return response;
    }

    @GetMapping(params = {"stateShipment", "idCustomer"})
    public List<Shipment> filtered(@RequestParam String stateShipment, @RequestParam String idCustomer) {
        //capa logica
        return shipmentService.filtered(stateShipment, idCustomer);
    }
}
