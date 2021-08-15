import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {IStudent} from './model/IStudent';
@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private readonly API_URL = 'http://localhost:3000/students';

  constructor(private httpClient: HttpClient) {
  }
  getAllStudent(): Observable<IStudent[]>{
    // console.log(this.httpClient.get<IStudent[]>(this.API_URL));
    return this.httpClient.get<IStudent[]>(this.API_URL);
  }
  addNewStudent(student: IStudent): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, student);
  }
  findById(id: number): Observable<IStudent>{
    return this.httpClient.get<IStudent>(this.API_URL + '/' + id);
  }
  updateStudents(student: IStudent): Observable<void>{
     return this.httpClient.put<void>(this.API_URL + '/' + student.id, student);
  }
  deleteStudent(id: number){
    return this.httpClient.delete(this.API_URL + '/'+ id);
  }
  searchAllName(keyword, keyword2){
    return this.httpClient.get(this.API_URL + '?name_like=' + keyword + '$IStudent.name'+ keyword2)
  }
  findByName(nameSearch: string):Observable<IStudent[]>{
    return this.httpClient.get<IStudent[]>(this.API_URL + '?name_like=' + nameSearch);
  }
  sortByName(order: any){
    return this.httpClient.get(this.API_URL + '?_sort=name&_order=' + order);
  }
}

