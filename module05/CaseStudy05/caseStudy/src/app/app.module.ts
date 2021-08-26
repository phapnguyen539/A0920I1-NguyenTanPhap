import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListCustomerComponent } from './customer/list-customer/list-customer.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarComponent } from './navbar/navbar.component';
import {HttpClientModule} from '@angular/common/http';
import { CreateCustomerComponent } from './customer/create-customer/create-customer.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatRadioModule} from '@angular/material/radio';
import { MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import { EditCustomerComponent } from './customer/edit-customer/edit-customer.component';
import { CreateCustomerTypeComponent } from './customer/create-customer-type/create-customer-type.component';
import { DeleteCustomerComponent } from './delete-customer/delete-customer.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {NgxPaginationModule} from 'ngx-pagination';
import { ListEmployeeComponent } from './employee/list-employee/list-employee.component';
import {MatInputModule} from '@angular/material/input';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatDialogModule} from '@angular/material/dialog';
import { MatSortModule} from '@angular/material/sort';
import { CreateEmployeeComponent } from './employee/create-employee/create-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    ListCustomerComponent,
    FooterComponent,
    NavbarComponent,
    CreateCustomerComponent,
    EditCustomerComponent,
    CreateCustomerTypeComponent,
    DeleteCustomerComponent,
    ListEmployeeComponent,
    CreateEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    MatRadioModule,
    MatFormFieldModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSnackBarModule,
    NgxPaginationModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule,
    MatSortModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
