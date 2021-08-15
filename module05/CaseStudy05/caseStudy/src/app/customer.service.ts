import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, ObservedValuesFromArray} from 'rxjs';
import {Customers} from './model/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private readonly API_URL = 'http://localhost:3000/customers';

  constructor(private httpClient: HttpClient) {
  }
  // httpOption = {
  //   headers: new HttpHeaders(
  //     {'Content-Type' : 'application/json'}
  //   )
  // };

  getAllCustomer(): Observable<Customers[]> {
    return this.httpClient.get<Customers[]>(this.API_URL);
  }
  addCustomer(customer: Customers): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, customer);
  }
  updateCustomer( customer: Customers): Observable<void>{
    return this.httpClient.put <void> (this.API_URL + '/' + customer.id, customer);
  }
  findById(id: number): Observable<Customers>{
    return this.httpClient.get<Customers>(this.API_URL + '/' + id);
  }
  deleteCustomer(id: number): Observable<Customers>{
    return this.httpClient.delete<Customers>(this.API_URL + '/' + id);
  }
}
