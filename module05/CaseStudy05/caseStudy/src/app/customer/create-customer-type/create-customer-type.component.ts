import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {TypeCustomerService} from '../../type-customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-create-customer-type',
  templateUrl: './create-customer-type.component.html',
  styleUrls: ['./create-customer-type.component.css']
})
export class CreateCustomerTypeComponent implements OnInit {
  createCustomerType: FormGroup;

  constructor(private typeCustomerService: TypeCustomerService, private router: Router) { }

  ngOnInit(): void {
    this.createCustomerType = new FormGroup({
      id: new FormControl(''),
      nameCustomerType: new FormControl('')
    });
  }
  getCustomerType(){
    this.typeCustomerService.addTypeCustomer(this.createCustomerType.value).subscribe((data) =>
      this.router.navigate(['/create-customer']));
  }

}
