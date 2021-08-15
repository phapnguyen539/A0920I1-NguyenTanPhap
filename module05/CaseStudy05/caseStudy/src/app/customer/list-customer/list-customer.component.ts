import { Component, OnInit } from '@angular/core';
import {Customers} from '../../model/customer';
import {CustomerService} from '../../customer.service';
@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customers: Customers[] = [];
  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.customerService.getAllCustomer().subscribe(
      (data) => {
        this.customers = data;
        console.log(this.customers);
      }
    );
  }
}
