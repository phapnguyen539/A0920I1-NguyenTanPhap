import { Component, OnInit } from '@angular/core';
import {Customers} from '../model/customer';
import {CustomerService} from '../customer.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {
  deleteCustomer: Customers;
  idCustomer: number;

  constructor(private customerService: CustomerService,
              private activatedRoute: ActivatedRoute, private  router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      // tslint:disable-next-line:radix
      this.idCustomer = parseInt(paramMap.get('id'));
      this.customerService.findById(this.idCustomer).subscribe((data) => {
        this.deleteCustomer = data ;
        console.log( this.deleteCustomer = data);
      });
    });
  }
  deleteCus() {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      // tslint:disable-next-line:radix
      this.idCustomer = parseInt(paramMap.get('id'));
      this.customerService.deleteCustomer(this.idCustomer).subscribe(() => {
        this.router.navigate(['/']);
      });
    });
  }

}
