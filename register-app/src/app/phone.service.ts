import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Phone } from './phone';

@Injectable({
    providedIn: 'root'
})

export class PhoneService {
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient){}

    public getPhone(): Observable<Phone[]> {
        return this.http.get<Phone[]>('${this.apiServerUrl}/phone/all');
    }

    public addPhone(phone: Phone): Observable<Phone> {
        return this.http.post<Phone>('${this.apiServerUrl}/phone/add', phone);
    }
}