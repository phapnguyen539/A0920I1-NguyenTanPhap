import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../customer.service';
import {Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerType} from '../../model/customerType';
import {TypeCustomerService} from '../../type-customer.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  createCustomer: FormGroup;
  typeCustomers: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private router: Router,
              private typeCustomerService: TypeCustomerService) {
  }

  ngOnInit(): void {
    this.createCustomer = new FormGroup({
      id: new FormControl('', [Validators.required]),
      name: new FormControl('', [Validators.required]),
      birthday: new FormControl('', [Validators.required]),
      gender: new FormControl('', [Validators.required]),
      card: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required]),
      address: new FormControl('', [Validators.required]),
      typeCustomer: new FormControl('', [Validators.required])
    });
    this.typeCustomerService.getAllCustomerType().subscribe((data) => {
        this.typeCustomers = data;
      }
    );
  }
  submitCustomer(){
    this.customerService.addCustomer(this.createCustomer.value).subscribe(
      (data) =>
        this.router.navigate(['/list-customer']));
    alert('Create success');
  }

}
