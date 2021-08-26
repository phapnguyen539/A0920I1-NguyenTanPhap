import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {CustomerType} from './model/customerType';
import {Level} from './model/level';

@Injectable({
  providedIn: 'root'
})
export class LevelService {
  private readonly API_URL = 'http://localhost:3000/levels';

  constructor(private httpClient: HttpClient) { }
  getAllLevel(): Observable<Level[]>{
    return this.httpClient.get<Level[]>(this.API_URL);
  }

}
