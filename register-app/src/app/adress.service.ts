import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Adress } from './adress';


@Injectable({
    providedIn: 'root'
})

export class AdressService {
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient){}

    public getAdress(): Observable<Adress[]> {
        return this.http.get<Adress[]>('${this.apiServerUrl}/adress/all');
    }

    public addCity(adress: Adress): Observable<Adress> {
        return this.http.post<Adress>('${this.apiServerUrl}/adress/add', adress);
    }
}