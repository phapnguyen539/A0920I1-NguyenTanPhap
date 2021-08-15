import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {CustomerType} from './model/customerType';

@Injectable({
  providedIn: 'root'
})
export class TypeCustomerService {
  private readonly API_URL = 'http://localhost:3000/typeCustomer';

  constructor(private httpClient: HttpClient) {
  }
  getAllCustomerType(): Observable<CustomerType[]>{
    return this.httpClient.get<CustomerType[]>(this.API_URL);
  }
  addTypeCustomer(customerTypes: CustomerType): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, customerTypes);
  }
}
