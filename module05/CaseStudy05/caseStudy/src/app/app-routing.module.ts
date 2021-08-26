import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {CreateCustomerComponent} from './customer/create-customer/create-customer.component';
import {CreateCustomerTypeComponent} from './customer/create-customer-type/create-customer-type.component';
import {EditCustomerComponent} from './customer/edit-customer/edit-customer.component';
import {DeleteCustomerComponent} from './delete-customer/delete-customer.component';
import {ListEmployeeComponent} from './employee/list-employee/list-employee.component';
import {CreateEmployeeComponent} from './employee/create-employee/create-employee.component';

const routes: Routes = [
  {path: 'list-customer' , component: ListCustomerComponent },
  {path: 'create-customer', component: CreateCustomerComponent},
  {path: 'create-customerType', component: CreateCustomerTypeComponent},
  {path: 'edit-customer/:id'  , component: EditCustomerComponent},
  {path: 'delete-customer/:id' , component: DeleteCustomerComponent},
  {path: 'list-employee' , component: ListEmployeeComponent},
  {path: 'create-employee' , component: CreateEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
