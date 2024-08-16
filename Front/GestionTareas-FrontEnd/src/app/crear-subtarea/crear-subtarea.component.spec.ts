import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrearSubtareaComponent } from './crear-subtarea.component';

describe('CrearSubtareaComponent', () => {
  let component: CrearSubtareaComponent;
  let fixture: ComponentFixture<CrearSubtareaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CrearSubtareaComponent]
    });
    fixture = TestBed.createComponent(CrearSubtareaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
