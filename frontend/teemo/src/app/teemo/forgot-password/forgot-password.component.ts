import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent implements OnInit {

  alertInputs: boolean = false;
  email: string = null

  constructor() { }

  ngOnInit(): void {
  }

  SendEmail(): void{
    this.alertInputs = this.email == null || this.email == "" ? true : false;
  }

}
