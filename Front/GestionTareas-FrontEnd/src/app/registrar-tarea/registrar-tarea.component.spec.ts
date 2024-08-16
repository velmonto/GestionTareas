import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarTareaComponent } from './registrar-tarea.component';

describe('RegistrarTareaComponent', () => {
  let component: RegistrarTareaComponent;
  let fixture: ComponentFixture<RegistrarTareaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RegistrarTareaComponent]
    });
    fixture = TestBed.createComponent(RegistrarTareaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
