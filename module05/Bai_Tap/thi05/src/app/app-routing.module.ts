import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DanhsachBenhanComponent} from './danhsach-benhan/danhsach-benhan.component';
import {SuaBenhanComponent} from './sua-benhan/sua-benhan.component';


const routes: Routes = [
  {path: '' , component : DanhsachBenhanComponent},
  {path: 'edit-benhan/:id', component: SuaBenhanComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
