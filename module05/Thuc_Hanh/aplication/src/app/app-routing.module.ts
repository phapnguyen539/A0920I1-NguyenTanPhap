import { Routes, RouterModule, PreloadAllModules } from '@angular/router';
import {TimelinesComponent} from './timelines/timelines.component';
import {NgModule} from '@angular/core';

const routes: Routes = [
  {
    path: 'timelines',
    component: TimelinesComponent

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})
export class AppRoutingModule {}
