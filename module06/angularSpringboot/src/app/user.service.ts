import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {User} from './model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private API_URL = 'http://localhost:7070/users' ;

  constructor(private httpClient: HttpClient) { }
  getAllUser(): Observable<User[]>{
    // console.log(this.httpClient.get<IStudent[]>(this.API_URL));
    return this.httpClient.get<User[]>(this.API_URL);
  }
  addNewUser(users: User): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, users);
  }
  findById(id: number): Observable<User>{
    return this.httpClient.get<User>(this.API_URL + '/' + id);
  }
  updateUser(users: User): Observable<void>{
    return this.httpClient.put<void>(this.API_URL + '/' + users.id, users);
  }
}
