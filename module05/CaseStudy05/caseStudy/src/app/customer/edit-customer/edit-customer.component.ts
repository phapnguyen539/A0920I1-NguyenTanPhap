import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../customer.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Customers} from '../../model/customer';
import {FormBuilder, FormGroup} from '@angular/forms';
import {CustomerType} from '../../model/customerType';
import {TypeCustomerService} from '../../type-customer.service';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  idCustomer: number;
  editCustomer: Customers;
  updateForm: FormGroup;
  typeCustomer: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private router: Router,
              private fb: FormBuilder,
              private activatedRoute: ActivatedRoute,
              private typeCustomerService: TypeCustomerService) {
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
    this.typeCustomerService.getAllCustomerType().subscribe((data) => {
        this.typeCustomer = data;
      }
    );
    this.activatedRoute.paramMap.subscribe((paraMap: ParamMap) => {
      // tslint:disable-next-line:radix
      this.idCustomer = parseInt(paraMap.get('id'));
      this.customerService.findById(this.idCustomer).subscribe((data) => {
      this.editCustomer = data;
      console.log(this.editCustomer);
      this.updateForm.patchValue({
        id: this.editCustomer.id,
        name: this.editCustomer.name,
        birthday: this.editCustomer.birthday,
        gender: this.editCustomer.gender,
        card: this.editCustomer.card,
        phone: this.editCustomer.phone,
        email: this.editCustomer.email,
        address: this.editCustomer.address,
        typeCustomer: this.editCustomer.typeCustomer.nameCustomerType
      });
    });
  });
  }
  getUpdate() {
    this.customerService.updateCustomer(this.updateForm.value).subscribe((data) => {
      this.router.navigate(['/']);
    });
  }
}
