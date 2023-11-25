package guru.springframework.spring6restmvc.controller;


import guru.springframework.spring6restmvc.model.Customer;
import guru.springframework.spring6restmvc.services.CostumerService;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@AllArgsConstructor
@RequestMapping("api/v1/costumer")
@RestController
public class CostumerController {
    CostumerService costumerService;



    @PostMapping()
    public ResponseEntity saveNewCostumer(@RequestBody Customer customer){
        Customer savedCustomer = costumerService.saveNewCostumer(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/costumer" + savedCustomer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> listAllCostumers (){
        return costumerService.listCostumers();
    }

    @RequestMapping(value = "{costumerId}", method = RequestMethod.GET)
    public Customer getCostumerById(@PathVariable UUID costumerId){
        return costumerService.getById(costumerId);
    }
}
