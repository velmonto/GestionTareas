import { Component, OnInit } from '@angular/core';
import { Tarea } from '../tarea';
import { TareaService } from '../tarea.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registrar-tarea',
  templateUrl: './registrar-tarea.component.html',
  styleUrls: ['./registrar-tarea.component.css']
})
export class RegistrarTareaComponent implements OnInit{

  registrarTarea:Tarea= new Tarea();

  constructor(private tareaServicio:TareaService, private router:Router){}

  ngOnInit(): void{
    
  }
guardarTarea(){
  this.tareaServicio.registrarTarea(this.registrarTarea).subscribe(dato => {
    console.log(dato);
    this.isAListaTareas();

  },error => console.log(error) );
}

isAListaTareas(){
  this.router.navigate(['/tarea']);
}
  onSubmit(){
    this.guardarTarea();
  }

}
