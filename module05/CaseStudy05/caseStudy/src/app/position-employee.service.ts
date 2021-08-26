import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Customers} from './model/customer';
import {HttpClient} from '@angular/common/http';
import {PositionEmployee} from './model/positionEmployee';

@Injectable({
  providedIn: 'root'
})
export class PositionEmployeeService {
  private readonly API_URL = 'http://localhost:3000/positionEmployee';

  constructor(private httpClient: HttpClient) { }
  getAllPosition(): Observable<PositionEmployee[]> {
    return this.httpClient.get<PositionEmployee[]>(this.API_URL);
  }
}
