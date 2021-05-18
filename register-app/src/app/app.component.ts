import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { City } from './city'
import { CityService } from './city.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public cities: City[] = [];

  constructor(private cityService: CityService){}

  ngOnInit() {
    this.getCity();
  }

  public getCity(): void{
    this.cityService.getCities().subscribe(
      (response: City[])=>{
        this.cities = response;
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
      }
    )
  }

}

