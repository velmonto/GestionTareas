import { Component, OnInit } from '@angular/core';
import { Tarea } from '../tarea';
import { TareaService } from '../tarea.service';

@Component({
  selector: 'app-lista-tareas',
  templateUrl: './lista-tareas.component.html',
  styleUrls: ['./lista-tareas.component.css']
})
export class ListaTareasComponent implements OnInit {

  tareas:Tarea[];
  
  constructor(private tareaServicio:TareaService) {}
  ngOnInit(): void{
    this.obtenerTarea();
  }

    private obtenerTarea(){
      this.tareaServicio.obtenerListaTareas().subscribe(dato => {
        this.tareas = dato;
    });
    }

}
