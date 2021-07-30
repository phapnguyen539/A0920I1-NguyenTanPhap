import { Component, OnInit } from '@angular/core';
import {Customers} from '../../model/customer';
import {customerDao} from '../../repository/customerRepository';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customers: Customers[] = customerDao;
  constructor() { }

  ngOnInit(): void {
  }

}
