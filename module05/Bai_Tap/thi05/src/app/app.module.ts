import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {NgxPaginationModule} from 'ngx-pagination';
import {MatDialogModule} from '@angular/material/dialog';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {OrderModule} from 'ngx-order-pipe';
import {MatDatepickerModule} from '@angular/material/datepicker';
import { DanhsachBenhanComponent } from './danhsach-benhan/danhsach-benhan.component';
import { SuaBenhanComponent } from './sua-benhan/sua-benhan.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatNativeDateModule} from '@angular/material/core';
import { XoaBenhanComponent } from './xoa-benhan/xoa-benhan.component';

@NgModule({
  declarations: [
    AppComponent,
    DanhsachBenhanComponent,
    SuaBenhanComponent,
    XoaBenhanComponent
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
        MatDatepickerModule,
        MatFormFieldModule,
      MatNativeDateModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
