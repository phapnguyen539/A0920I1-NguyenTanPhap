import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActicleComponent } from './acticle.component';

describe('ActicleComponent', () => {
  let component: ActicleComponent;
  let fixture: ComponentFixture<ActicleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActicleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActicleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
