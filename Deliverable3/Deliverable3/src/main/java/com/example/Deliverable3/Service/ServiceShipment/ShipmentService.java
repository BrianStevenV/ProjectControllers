package com.example.Deliverable3.Service.ServiceShipment;


import com.example.Deliverable3.Modules.Shipment;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

public class ShipmentService {

    private Map<String, Shipment> shipments = new HashMap<>();
    public ResponseEntity<Shipment> processCreated(@RequestBody Shipment shipmentCreated){
        if(shipmentCreated.getIdCustomer() != null &&
                !StringUtils.isEmpty(shipmentCreated.getOriginCity()) &&
                !StringUtils.isEmpty(shipmentCreated.getDestinationCity()) &&
                !StringUtils.isEmpty(shipmentCreated.getDestinationAddress()) &&
                !StringUtils.isEmpty(shipmentCreated.getReceptorName()) &&
                !StringUtils.isEmpty(shipmentCreated.getPhone()) &&
                !StringUtils.isEmpty(shipmentCreated.getDeclaredValue()) &&
                !StringUtils.isEmpty(shipmentCreated.getWeigth())){
            shipmentCreated = new Shipment(shipmentCreated.getIdCustomer(),shipmentCreated.getOriginCity(), shipmentCreated.getDestinationCity(), shipmentCreated.getDestinationAddress(), shipmentCreated.getReceptorName(), shipmentCreated.getPhone(), shipmentCreated.getDeclaredValue(), shipmentCreated.getWeigth());
            shipments.put(shipmentCreated.getIdCustomer(), shipmentCreated);
            return ResponseEntity.ok(shipmentCreated);
        }
        return ResponseEntity.badRequest().body(null);
    }



}
