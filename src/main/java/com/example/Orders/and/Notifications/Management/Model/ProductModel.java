package com.example.Orders.and.Notifications.Management.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
public class ProductModel implements Modelable{
    private String serialNumber;
    private String name;
    private String vendor;
    private String category;
    private double price ;
    private int remainingCount;
    private int quantity;

}
