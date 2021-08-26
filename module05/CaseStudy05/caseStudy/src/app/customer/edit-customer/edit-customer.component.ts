import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../customer.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Customers} from '../../model/customer';
import {FormBuilder, FormGroup} from '@angular/forms';
import {CustomerType} from '../../model/customerType';
import {TypeCustomerService} from '../../type-customer.service';
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  idCustomer: number;
  editCustomer: Customers;
  updateForm: FormGroup;
  typeCustomers: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private router: Router,
              private fb: FormBuilder,
              private activatedRoute: ActivatedRoute,
              private typeCustomerService: TypeCustomerService,
              private snackBar: MatSnackBar) {
  }

  ngOnInit(): void {
    this.updateForm = this.fb.group({
      id: [('')],
      name: [('')],
      birthday: [('')],
      gender: [('')],
      card: [('')],
      phone: [('')],
      email: [('')],
      address: [('')],
      typeCustomer: [('')]
    });
  //   this.activatedRoute.paramMap.subscribe((paraMap: ParamMap) => {
  //     // tslint:disable-next-line:radix
  //     this.idCustomer = parseInt(paraMap.get('id'));
  //     this.customerService.findById(this.idCustomer).subscribe((data) => {
  //     this.editCustomer = data;
  //     console.log(this.editCustomer);
  //     this.updateForm.patchValue({
  //       id: this.editCustomer.id,
  //       name: this.editCustomer.name,
  //       birthday: this.editCustomer.birthday,
  //       gender: this.editCustomer.gender,
  //       card: this.editCustomer.card,
  //       phone: this.editCustomer.phone,
  //       email: this.editCustomer.email,
  //       address: this.editCustomer.address,
  //       typeCustomer: this.editCustomer.typeCustomer.nameCustomerType
  //     });
  //   });
  // });
    this.typeCustomerService.getAllCustomerType().subscribe((data) => {
        this.typeCustomers = data;
        this.customerService.findById(this.activatedRoute.snapshot.params.id).subscribe( (data) => {
          this.updateForm.setValue(data);
        });
      }
    );
  }
  getUpdate() {
    this.customerService.updateCustomer(this.updateForm.value).subscribe((data) => {
      this.router.navigate(['/list-customer']);
      alert('Da sua thanh cong !');
      // this.snackBar.open('Da sua thanh cong', 'OK');
    });
  }
}
