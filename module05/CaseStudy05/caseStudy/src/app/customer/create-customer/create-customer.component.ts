import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../customer.service';
import {Router} from '@angular/router';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerType} from '../../model/customerType';
import {TypeCustomerService} from '../../type-customer.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  createCustomer: FormGroup;
  typeCustomer: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private router: Router,
              private typeCustomerService: TypeCustomerService) {
  }

  ngOnInit(): void {
    this.createCustomer = new FormGroup({
      id: new FormControl(''),
      name: new FormControl(''),
      birthday: new FormControl(''),
      gender: new FormControl(''),
      card: new FormControl(''),
      phone: new FormControl(''),
      email: new FormControl(''),
      address: new FormControl(''),
      typeCustomer: new FormControl('')
    });
    this.typeCustomerService.getAllCustomerType().subscribe((data) => {
        this.typeCustomer = data;
      }
    );
  }
  submitCustomer(){
    this.customerService.addCustomer(this.createCustomer.value).subscribe(
      (data) =>
        this.router.navigate(['/']));
    alert('Create success');
  }

}
