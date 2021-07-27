import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentListComponent } from './student-list/student-list.component';
import {FormsModule} from '@angular/forms';
import { StudentInformationComponent } from './student-information/student-information.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    StudentInformationComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
