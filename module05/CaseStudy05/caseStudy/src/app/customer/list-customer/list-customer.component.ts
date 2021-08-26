import {Component, OnInit} from '@angular/core';
import {Customers} from '../../model/customer';
import {CustomerService} from '../../customer.service';
import {MatDialog} from '@angular/material/dialog';
import {DeleteCustomerComponent} from '../../delete-customer/delete-customer.component';
@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customers: Customers[] = [];
  name: string;
  id: number ;
  p = 1 ;
  constructor(private customerService: CustomerService, private dialog: MatDialog) { }

  ngOnInit(): void {
    this.customerService.getAllCustomer().subscribe(
      (data) => {
        this.customers = data;
        console.log(this.customers);
      }
    );
  }
  searchName(): void {
    this.customerService.findByName(this.name).subscribe(data => {
        this.customers = data;
      }
    );
  }
  searchId(): void {
    this.customerService.findBySearchId(this.id).subscribe(data => {
        this.customers = data;
      }
    );
  }
  openDialogDelete(idCustomer): void {
    this.customerService.findById(idCustomer).subscribe(data => {
      const dialogReg = this.dialog.open(DeleteCustomerComponent, {
        width : '500px',
        data : {data1: data},
        disableClose : true
      });
      dialogReg.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }
}
