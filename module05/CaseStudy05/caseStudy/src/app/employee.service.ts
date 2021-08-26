import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from './model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private readonly API_URL = 'http://localhost:3000/employees';
  constructor(private httpClient: HttpClient ){
  }
  getAllEmployee(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.API_URL);
  }
  addEmployee(employee: Employee): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, employee);
  }
  updateEmployee( employee: Employee): Observable<void>{
    return this.httpClient.put <void> (this.API_URL + '/' + employee.id, employee);
  }
  findById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(this.API_URL + '/' + id);
  }
  deleteEmployee(id: number): Observable<Employee>{
    return this.httpClient.delete<Employee>(this.API_URL + '/' + id);
  }
  findByName(nameSearch: string): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(this.API_URL + '?name_like=' + nameSearch);
  }
  findBySearchId(idSearch: number): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(this.API_URL + '?id_like=' + idSearch);
  }
}
