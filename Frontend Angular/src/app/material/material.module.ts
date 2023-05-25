import { NgModule } from '@angular/core';
import  {MatButtonToggleModule} from "@angular/material/button-toggle";
import  {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {MatCardModule} from "@angular/material/card";
import {MatBadgeModule} from "@angular/material/badge";
import {MatProgressSpinnerModule} from "@angular/material/progress-spinner";
import  {MatToolbarModule} from "@angular/material/toolbar";
import {MatSidenavModule} from "@angular/material/sidenav";

const  material = [
  MatButtonToggleModule,
  MatButtonModule,
  MatIconModule,
  MatButtonModule,
  MatCardModule,
  MatBadgeModule,
  MatProgressSpinnerModule,
  MatToolbarModule,
  MatSidenavModule
];
@NgModule({
  imports: [material],
  exports: [material]
})
export class MaterialModule { }
