import {Component, OnInit} from '@angular/core';
import {QuanlyBenhAnService} from '../quanly-benh-an.service';
import {QuanLyBenhAn} from '../model/quanLyBenhAn';
import {XoaBenhanComponent} from '../xoa-benhan/xoa-benhan.component';
import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-danhsach-benhan',
  templateUrl: './danhsach-benhan.component.html',
  styleUrls: ['./danhsach-benhan.component.css']
})
export class DanhsachBenhanComponent implements OnInit {
  benhAns: QuanLyBenhAn[] = [];

  constructor(private quanlyBenhAnService: QuanlyBenhAnService, private dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.quanlyBenhAnService.getAllBenhAn().subscribe((data) => {
      this.benhAns = data;
    });
  }

  openDialogDelete(idBenhAn): void {
    this.quanlyBenhAnService.findById(idBenhAn).subscribe(data => {
      const dialogReg = this.dialog.open(XoaBenhanComponent, {
        width : '500px',
        data : {data1: data},
        disableClose : true
      });
      dialogReg.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }
}
