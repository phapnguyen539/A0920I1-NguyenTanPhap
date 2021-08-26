import {Component, Inject, OnInit} from '@angular/core';
import {QuanlyBenhAnService} from '../quanly-benh-an.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {MatSnackBar} from '@angular/material/snack-bar';
import {OverlayKeyboardDispatcher} from '@angular/cdk/overlay';

@Component({
  selector: 'app-xoa-benhan',
  templateUrl: './xoa-benhan.component.html',
  styleUrls: ['./xoa-benhan.component.css']
})
export class XoaBenhanComponent implements OnInit {
  public tenBenhAn;
  public idBenhAn;

  constructor(private quanlyBenhAnService: QuanlyBenhAnService, public dialogRef: MatDialogRef<XoaBenhanComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any){ }

  ngOnInit(): void {
    this.tenBenhAn = this.data.data1.tenBenhNhan;
    this.idBenhAn = this.data.data1.id;
  }
  deleteBenhAn() {
    this.quanlyBenhAnService.deleteBenhAn(this.idBenhAn).subscribe((data) => {
      this.dialogRef.close();
    });
  }

}
