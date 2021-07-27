import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RootComponent } from './root/root.component';
import {FormsModule} from '@angular/forms';
import { ActicleComponent } from './acticle/acticle.component';
@NgModule({
  declarations: [
    AppComponent,
    RootComponent,
    ActicleComponent
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
