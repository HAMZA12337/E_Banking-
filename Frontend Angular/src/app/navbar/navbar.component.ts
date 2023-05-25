import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor() { }
  ngOnInit():
    void {
  }
  opened = false;
  notific = 0;
  showSpinner = false;
  loadData(){
    this.showSpinner = true
    setTimeout(()=> {
      this.showSpinner = false;
    },5000);
  }

}
