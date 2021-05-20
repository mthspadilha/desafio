import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Client } from './cllient';

@Injectable({
    providedIn: 'root'
})

export class CityService {
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient){}

    public getClients(): Observable<Client[]> {
        return this.http.get<Client[]>('${this.apiServerUrl}/client/all');
    }

    public addCity(client: Client): Observable<Client> {
        return this.http.post<Client>('${this.apiServerUrl}/client/add', client);
    }
}