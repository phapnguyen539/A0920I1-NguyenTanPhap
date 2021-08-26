import {Component, Inject, OnInit} from '@angular/core';
import {Customers} from '../model/customer';
import {CustomerService} from '../customer.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {
  public customerName;
  public customerId;

  constructor(private customerService: CustomerService, public dialogRef: MatDialogRef<DeleteCustomerComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit(): void {
    this.customerName = this.data.data1.name;
    this.customerId = this.data.data1.id;
  }

  deleteCustomer() {
    this.customerService.deleteCustomer(this.customerId).subscribe((data) => {
      this.dialogRef.close();
    });
  }

}
