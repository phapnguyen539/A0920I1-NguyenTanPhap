import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {QuanLyBenhAn} from './model/quanLyBenhAn';

@Injectable({
  providedIn: 'root'
})
export class QuanlyBenhAnService {
  private readonly API_URL = 'http://localhost:3000/quanLyBenhAn';
  constructor(private httpClient: HttpClient) { }
  getAllBenhAn(): Observable<QuanLyBenhAn[]>{
    return this.httpClient.get<QuanLyBenhAn[]>(this.API_URL);
  }
  addNewBenhAn(benhAn: QuanLyBenhAn): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, benhAn);
  }
  findById(id: number): Observable<QuanLyBenhAn>{
    return this.httpClient.get<QuanLyBenhAn>(this.API_URL + '/' + id);
  }
  updateQuanLyBenhAn(benhAn: QuanLyBenhAn): Observable<void>{
    return this.httpClient.put<void>(this.API_URL + '/' + benhAn.maBenhAn, benhAn);
  }
  deleteBenhAn(id: number){
    return this.httpClient.delete(this.API_URL + '/' + id);
  }
}
