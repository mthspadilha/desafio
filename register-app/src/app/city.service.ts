import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { City } from './city'
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
    providedIn: 'root'
})

export class CityService {
    private apiServerUrl = '';

    constructor(private http: HttpClient){}

    public getCity(): Observable<City[]> {
        return this.http.get<City[]>('${this.apiServerUrl}/city/all');
    }

    public addCity(city: City): Observable<City> {
        return this.http.post<City>('${this.apiServerUrl}/city/add', city);
    }
}