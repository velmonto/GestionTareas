import { Component, OnInit } from '@angular/core';
import { Tarea } from '../tarea';

@Component({
  selector: 'app-registrar-tarea',
  templateUrl: './registrar-tarea.component.html',
  styleUrls: ['./registrar-tarea.component.css']
})
export class RegistrarTareaComponent implements OnInit{

  registrarTarea:Tarea= new Tarea();

  constructor(){}

  ngOnInit(): void{
    console.log(this.registrarTarea);
  }
  onSubmit(){
    console.log(this.registrarTarea);
  }

}
