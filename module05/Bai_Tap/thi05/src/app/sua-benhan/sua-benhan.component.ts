import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {QuanlyBenhAnService} from '../quanly-benh-an.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {QuanLyBenhAn} from '../model/quanLyBenhAn';
import validate = WebAssembly.validate;

@Component({
  selector: 'app-sua-benhan',
  templateUrl: './sua-benhan.component.html',
  styleUrls: ['./sua-benhan.component.css']
})
export class SuaBenhanComponent implements OnInit {
  updateBenhAn: FormGroup;
  maBenhNhan: number;
  suaBenhAn: QuanLyBenhAn;

  constructor(private quanlyBenhAnService: QuanlyBenhAnService,
              private router: Router,
              private fb: FormBuilder,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.updateBenhAn = this.fb.group({
      id: [''],
      maBenhNhan: ['', Validators.required],
      maBenhAn: ['', Validators.required],
      tenBenhNhan: ['', Validators.required ],
      ngayNhapVien: [(''), Validators.required],
      ngayRaVien: [(''), Validators.required],
      lyDoNhapVien: [(''), Validators.required],
      phuongPhapDieuTri: [(''), Validators.required],
      bacSi: [('')]
    });
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      // tslint:disable-next-line:radix
      this.maBenhNhan = parseInt(paramMap.get('id'));
      this.quanlyBenhAnService.findById(this.maBenhNhan).subscribe((data) => {
        this.suaBenhAn = data;
        this.updateBenhAn.patchValue({
          id: this.suaBenhAn.id,
          maBenhNhan: this.suaBenhAn.maBenhNhan,
          maBenhAn: this.suaBenhAn.maBenhAn,
          tenBenhNhan: this.suaBenhAn.tenBenhNhan,
          ngayNhapVien: this.suaBenhAn.ngayNhapVien,
          ngayRaVien: this.suaBenhAn.ngayRaVien,
          phuongPhapDieuTri: this.suaBenhAn.phuongPhapDieuTri,
          lyDoNhapVien: this.suaBenhAn.lyDoNhapVien,
          bacSi: this.suaBenhAn.bacSi
        });
      });
    });
  }
  getUpdate(){
    this.quanlyBenhAnService.updateQuanLyBenhAn(this.updateBenhAn.value).subscribe((data) => {
      this.router.navigate(['/']);
      alert('Da sua thanh cong !');
      // this.snackBar.open('Da sua thanh cong', 'OK');
    });
  }
  }

