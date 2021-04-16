import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeemoComponent } from './teemo.component';

describe('TeemoComponent', () => {
  let component: TeemoComponent;
  let fixture: ComponentFixture<TeemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TeemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TeemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
