import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentListComponent } from './student-list/student-list.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { StudentInformationComponent } from './student-information/student-information.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HttpClientModule} from '@angular/common/http';
import { StudentEditComponent } from './student-edit/student-edit.component';
import { StudentDeleteComponent } from './student-delete/student-delete.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {MatDialogModule} from '@angular/material/dialog';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {OrderModule} from 'ngx-order-pipe';
import {MatDatepickerModule} from '@angular/material/datepicker';

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    StudentInformationComponent,
    ReactiveFormComponent,
    NavbarComponent,
    FooterComponent,
    StudentEditComponent,
    StudentDeleteComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        ReactiveFormsModule,
        HttpClientModule,
        NgxPaginationModule,
        MatDialogModule,
        MatButtonModule,
        MatIconModule,
      BrowserAnimationsModule,
      OrderModule,
      MatDatepickerModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
