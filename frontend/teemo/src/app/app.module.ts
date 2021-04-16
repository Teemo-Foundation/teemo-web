import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { appRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { TeemoModule } from './teemo/teemo.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    appRoutingModule,
    TeemoModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
